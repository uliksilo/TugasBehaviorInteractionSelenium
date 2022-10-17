import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class BehaviorInteractionCucumber {
    WebDriver driver;
    String URL="https://test.io/";
    public BehaviorInteractionCucumber() {
        Given("^User click menu services$", () -> {
            public void userClickmenuServices() {
                System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
                driver = new ChromeDriver();
                driver.get(URL);
                driver.manage().window().maximize();
                driver.navigate().to(URL+"/services");
            }
        });
        When("^User click button back$", () -> {
            public void userClickButtonBack(){
                driver.navigate().back();
            }
        });
        And("^User click button forward$", () -> {
            public void userClickButtonForward(){
                driver.navigate().forward();
            }
        });
        And("^User click button refresh$", () -> {
            public void userClickButtonRefresh(){
                driver.navigate().refresh();
            }
        });
        And("^User get Title$", () -> {
            public void getTitle() {
                String titlenya = driver.getTitle();
                System.out.println(titlenya);
            }
        });
        And("^user get pagesource$", () -> {
            public void getpageSources() {
                String pageSourcenya = driver.getPageSource();
                System.out.println(pageSourcenya);
                Thread.sleep(3000);
            }
        });
        And("^User get css$", () -> {
            public void getcss(){
                driver.navigate().to(URL+"/");
                driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div[1]/div/div[2]/div[1]/div/a")).isEnabled();

                String textnya = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/section/div[1]/img")).getText();
                System.out.println(textnya);

                String getCSS = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div[2]/div/div/div[2]/div/a")).getCssValue("font-size");
                String getCSS2 = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div[2]/div/div/div[2]/div/a")).getCssValue("text-decoration");
                System.out.println("Colornya adalah = "+getCSS);
                System.out.println("Decnya adalah = "+getCSS2);
            }
        });
        And("^User get attribute$", () -> {
            public void getAttribute(){
                String getAttribut = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div[2]/div/div/div[2]/div/a")).getAttribute("class");
                System.out.println(getAttribut);
            }
        });
        And("^User get size$", () -> {
            public void getSize(){
                WebElement getSizenih = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div[2]/div/div/div[2]/div/a"));
                Dimension dimensi = getSizenih.getSize();
            }
        });
        And("^User get Location$", () -> {
            public void getLocation(){
                WebElement getLokasinya = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div[2]/div/div/div[2]/div/a"));
                Point pointnya = getLokasinya.getLocation();

                System.out.println("Lokasi X nya yaitu = "+ pointnya.x + " dan Y nya " + pointnya.y);

                Thread.sleep(3000);
            }
        });
    }

    private void And(String s, Object o) {
    }

    private void When(String s, Object o) {
    }

    private void Given(String s, Object o) {
    }
}
