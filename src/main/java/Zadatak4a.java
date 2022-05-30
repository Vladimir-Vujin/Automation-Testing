import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
Zadatak 4a
Sa stranice https://www.w3schools.com/sql/ nađite xpath koji hvata sve linkove iz glavne navigacije.
To su : HTML, CSS, JAVASCRIPT, SQL, PYTHON, ….
*/
public class Zadatak4a {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/sql/");

        // ručno formiranje xPath-a   xpath = // tagname[@Attribute = 'Value']
        // a[contains(@class, 'w3-right') and text()='Next ❯']
        // *[@id="topnav"]
        // *[@id="topnav"]/div/div[1]
        // *[@id="topnav"]/div/div[1]/a[9]

        // Kljucna rec je CONTAINS
        List<WebElement> elementLst = driver.findElements(By.xpath("//*[@id='topnav']/div/div[1]/a[contains(@class, 'w3-bar-item')]"));

        for (WebElement element : elementLst) {
            System.out.println(element.getText());
        }

        // Vežba
        //    //div[not(@class = 'item')] daj mi sve div tagove koji nisu klase item
        //    //*    znači svi tagovi
        //    //div  znači sdiv tagovi
        //    //a    zmači a tagovi
    }
}
