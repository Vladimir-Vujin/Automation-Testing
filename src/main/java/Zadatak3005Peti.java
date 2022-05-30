import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
* Zadatak 5
Napisati program koji ucitava stranicu https://vue-demo.daniel-avellaneda.com/
klikce na checkbox dugme da postavljanje
Dark teme na stranici, zatim ceka da (id=”app) dobije klasu theme--dark
* */
public class Zadatak3005Peti {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://vue-demo.daniel-avellaneda.com/");

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement  toogleElement = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/header/div/div[3]/div[1]/div/div/div/div[1]/div"));
        toogleElement.click();
        driverWait.until(ExpectedConditions.attributeContains(By.id("app"),"class", "theme--dark"));

        System.out.println("Dark tema primenjena!");
    }
}
