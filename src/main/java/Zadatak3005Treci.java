import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
* Zadatak 3
Napisti program koji:
·        učitava stranicu https://www.w3schools.com/html/default.asp
·        zatim klinke na Next dugme, 5 puta.
Za sve akcije na strani, čekamo najviše 2 sekunde.
* */
public class Zadatak3005Treci {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.w3schools.com/html/default.asp");

        // OVO JE ČEKANJE KADA IDEMO SA STRANICE NA STRANICU NAVIGATE.TO, BACK, FORWARD
        // ZNAČI ČEKANJE ZA UČITAVANJE STRANICE
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        // DEFINIŠEMO IMPLICITNI WAITER, ZA SVAKI ELEMENT NA STRANI DRIVER
        // ČEKA PO DVE SEKUNDE, UKOLIKO SE ELEMENT NE UČITA ZA DVE SEKUNDE
        // PRIJAVLJUJE GREŠKU
        // ČEKANJE ZA UČITAVANJE ELEMENTA FINDELEMENT
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        for (int i = 1; i <= 5; i++) {
            WebElement nextButton = driver.findElement(By.xpath("//*[@id=\'main\']/div[2]/a[2]"));
            nextButton.click();
            //driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[2]")).click();
        }
    }
}
