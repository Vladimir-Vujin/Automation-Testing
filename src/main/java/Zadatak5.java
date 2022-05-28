import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
Napisati program koji:
učitava stranicu https://www.w3schools.com/html/default.asp
i za svaki element iz navigacije (Tutorials, References, Exercises) radi:
 -     klik na element
 -     čeka se 1s
 -     klikne se opet na isti element
 */
public class Zadatak5 {

    public static void main(String[] args) {

        // set chrome driver and create WebDriver object
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/html/default.asp");

        //     //*[@id="pagetop"]
        //     //*[@id='pagetop']/a[contains(@class, 'w3-bar-item')]
        // KADA IMAMO VI{E ELEMENATA KORISTIMO FINDELEMENTS
        List<WebElement> elementList = driver.findElements(By.xpath("//*[@id='pagetop']/a[contains(@class, 'w3-bar-item')]"));
        /*for (WebElement element : elementList) {
            System.out.println(element.getText());
        }*/
        for(int i =1; i <= 3; i++){
            System.out.println(elementList.get(i).getText());
        }

    }
}
