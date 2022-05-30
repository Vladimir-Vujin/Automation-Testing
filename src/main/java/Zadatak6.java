
/*
Napisti program koji:
učitava stranicu https://www.w3schools.com/html/default.asp
zatim klikne na Next dugme, ceka 2 sekunkde. To radimo 5 puta.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak6 {

    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.navigate().to("https://www.w3schools.com/html/default.asp");

            //input[@type='submit' and @name='btnLogin']
            //*[@id="main"]/div[2]/a[2]
            //a[contains(@class, 'w3-right') and text()='Next ❯']
            for (int i = 1; i <= 5; i++) {
                //driver.findElement(By.xpath("//*[@id=\'main\']/div[2]/a[2]")).sendKeys(Keys.ENTER);
                driver.findElement(By.xpath("//*[@id=\'main\']/div[2]/a[2]")).click();
                System.out.println(i + ". klik na next");
                Thread.sleep(2000);
            }

            System.out.println("Program finished!");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
