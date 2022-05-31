import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

/*
Zadatak 6 (za vežbanje)
Napisti program koji:
Ucitava stranicu http://cms.demo.katalon.com/
Hvata sve linkove (chart, my account, sampla page, …)  iz navigacije i vraca listu WebElemenata
i ispisuje u konzoli tekst svakog linka
Rezultat programa treba da bude:
https://cms.demo.katalon.com/cart/
https://cms.demo.katalon.com/checkout/
https://cms.demo.katalon.com/my-account/
https://cms.demo.katalon.com/sample-page/
https://cms.demo.katalon.com/
*
* */
public class Zadatak3005Sesti {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("http://cms.demo.katalon.com/");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        List<WebElement> navListElements = driver.findElements(By.xpath("//*[@id=\"primary-menu\"]/ul/li/a"));

        /*for(int i = 0; i < 5; i++){
            System.out.println(navListElements.get(i).getAttribute("href"));
        }*/

        for (WebElement element : navListElements) {
            element.getAttribute("href");
        }

        driver.close();
    }
}
