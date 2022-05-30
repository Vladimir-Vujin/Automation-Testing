import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
* Zadatak 1
Napisati program koji prijavljivanju na stranicu http://cms.demo.katalon.com/my-account/, cekira Remember me checkbox.
* */
public class Zadatak3005Jedan {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("http://cms.demo.katalon.com/my-account/");

        WebElement checkBox = driver.findElement(By.id("rememberme"));
        checkBox.click();

    }

}
