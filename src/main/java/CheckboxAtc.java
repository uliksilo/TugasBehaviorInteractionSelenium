import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckboxAtc {

    static WebDriver driver;
    static String URL = "https://materializecss.com/";

    @BeforeClass
    public static void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().maximize();
    }

    @Test
    public void a_radioButton() throws Exception{
        driver.navigate().to(URL+"/radio-buttons.html");
        driver.findElement(By.id("radio"));

        WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"radio\"]/form/p[2]/label/span"));

        radio1.click();
    }

    @Test
    public void b_checkBox() {
        driver.navigate().to(URL+"/checkboxes.html");
        driver.findElement(By.id("checkbox"));


        driver.findElement(By.xpath("//*[@id=\"checkbox\"]/form/p[1]/label/span")).click();
    }

    @Test
    public void c_dropdown() throws Exception {
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

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }
}
