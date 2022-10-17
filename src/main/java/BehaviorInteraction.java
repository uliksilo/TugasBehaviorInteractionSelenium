import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BehaviorInteraction {

    static WebDriver driver;
    static String URL="https://test.io/";

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);

        driver.manage().window().maximize();
    }

    @Test
    public void b_Behavior() throws Exception{
        driver.navigate().to(URL+"/services");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        String titlenya = driver.getTitle();
        System.out.println(titlenya);

        String pageSourcenya = driver.getPageSource();
        System.out.println(pageSourcenya);

        Thread.sleep(3000);
    }

    @Test
    public void a_Interaction() throws Exception {
        driver.navigate().to(URL+"/");
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div[1]/div/div[2]/div[1]/div/a")).isEnabled();

        String textnya = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/section/div[1]/img")).getText();
        System.out.println(textnya);

        String getCSS = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div[2]/div/div/div[2]/div/a")).getCssValue("font-size");
        String getCSS2 = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div[2]/div/div/div[2]/div/a")).getCssValue("text-decoration");
        System.out.println("Colornya adalah = "+getCSS);
        System.out.println("Decnya adalah = "+getCSS2);

        String getAttribut = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div[2]/div/div/div[2]/div/a")).getAttribute("class");
        System.out.println(getAttribut);

        WebElement getSizenih = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div[2]/div/div/div[2]/div/a"));
        Dimension dimensi = getSizenih.getSize();

        System.out.println("Dimensinya yaitu = "+dimensi);

        WebElement getLokasinya = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div[2]/div/div/div[2]/div/a"));
        Point pointnya = getLokasinya.getLocation();

        System.out.println("Lokasi X nya yaitu = "+ pointnya.x + " dan Y nya " + pointnya.y);

        Thread.sleep(3000);
    }

    @AfterClass
    public static void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }



}
