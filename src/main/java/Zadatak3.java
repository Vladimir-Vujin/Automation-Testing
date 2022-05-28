
/*
Zadatak 3
Napisati program koji:
●    učitava stranicu https://demoqa.com/login
●    čita naslov stranice i štampa ga na ekranu
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/login");
        System.out.println("Naziv stranice: " + driver.getTitle());

        driver.close();
    }
}
