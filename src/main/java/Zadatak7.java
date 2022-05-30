import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
Napisti program koji:
Ucitava stranicu https://cms.demo.katalon.com/
Zatim za svaki link iz navigacije radi:
klik na link
štampa naslov stranice
radi back na stranicu.
*/
public class Zadatak7 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://cms.demo.katalon.com/");

        // PRVI NACIN
        //*[@id="primary-menu"]/ul/li[1]/a
        for (int i = 1; i <= 5; i++) {
            driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[" + i + "]/a")).click();
            System.out.println(driver.getTitle());
            if (i != 5)
                driver.navigate().back();
        }

        /*// DRUGI NACIN
        //*[@id="primary-menu"]/ul/li/a
        List<WebElement> elementNavigationList = driver.findElements(By.xpath("//*[@id=\"primary-menu\"]/ul/li/a"));
        for (WebElement element : elementNavigationList) {
            element.click();
            System.out.println(driver.getTitle());
            driver.navigate().back();
        }*/
    }
}
