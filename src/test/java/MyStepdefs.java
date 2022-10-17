import io.cucumber.java.en.when;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStepdefs {

    static WebDriver driver;
    static String URL = "https://materializecss.com/";

    public MyStepdefs() {
        Given("^User open menu radio button html$", () -> {
            static String URL = "https://materializecss.com/";
            System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
            driver = new ChromeDriver();

            driver.navigate().to(URL+"/radio-buttons.html");
            driver.findElement(By.id("radio"));

            WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"radio\"]/form/p[2]/label/span"));

            radio1.click();
        }
        });
        When("^User click radio button yellow$", () -> {
        });
        Then("^radio button is selected$", () -> {
        });
        When("^User click Checkbox red$", () -> {
        driver.navigate().to(URL+"/checkboxes.html");
        driver.findElement(By.id("checkbox"));
        });
        Then("^checkbox is selected$", () -> {
        driver.findElement(By.xpath("//*[@id=\"checkbox\"]/form/p[1]/label/span")).click();
    }
        });
        When("^User click dropdow$", () -> {
        driver.navigate().to(URL+"/select.html");
        //driver.findElement(By.className("dropdown-trigger"));

        Select dropdownOption = new Select(driver.findElement(By.xpath("//*[@id=\"introduction\"]/div/form/div/div[1]/div/select")));
        dropdownOption.selectByVisibleText("Option 1");
        Thread.sleep(1000);
        dropdownOption.selectByValue("Option 2");
        Thread.sleep(1000);
        dropdownOption.selectByIndex(3);

        //fungsi hitung total option
        List<WebElement> hitungElemen = dropdownOption.getOptions();
        System.out.println("Total optionnya adalah = " + hitungElemen.size());

        //fungsi hitung dan cetak setiap option
        List <WebElement> hitungElemenLagi = dropdownOption.getOptions();
        int textvalue = hitungElemenLagi.size();
        for(int i=0;i<textvalue;i++){
        String textnyaItu = hitungElemenLagi.get(i).getText();
        System.out.println("Text optionnyanya = " + textnyaItu);
        }
        }
        });
        Then("^dropdown is selected$", () -> {
        });
    }
}
