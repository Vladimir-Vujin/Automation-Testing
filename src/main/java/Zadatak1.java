import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Zadatak 1
Posetite stranicu http://cms.demo.katalon.com/ i u delu za pretragu uneti tekst “Flying Ninja”
i kliknuti na search dugme (search ikonica). Pri učitavanju stranice maksimizovati prozor.
 */

public class Zadatak1 {

    public static void main(String[] args) {

        // set chrome driver and create WebDriver object
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Metod za pristup stranici - get
        // driver.get("https://cms.demo.katalon.com");
        // Metod za pristup stranici - navigate; primer upotrebe metode navigate
        driver.navigate().to("https://cms.demo.katalon.com");
        // driver.navigate().to("https://www.google.com");
        // driver.navigate().back();   // vraća na "https://cms.demo.katalon.com"
        // driver.navigate().forward();   // ide na "https://www.google.com"

        // Pristupamo input fieldu pomoću xPath
        // WebElement element = driver.findElement(By.xpath("//*[@id=\"search-2\"]/form/label/input"));
        // Pristupamo input fieldu pomoću klase
        // WebElement element = driver.findElement(By.className("search-field"));
        // Pristupamo input fieldu pomoću name
        WebElement element = driver.findElement(By.name("s"));
        // Prosleđujemo tekst za pretragu u input field, tekst je "Flying Ninja"
        element.sendKeys("Flying Ninja");
        // Simuliramo pritisak dugmeta enter na tastaturi
        // lement.submit();

        // Pristupamo buttonu search pomoću xPath i simuliramo click na ikonicu
        //driver.findElement(By.xpath("//*[@id=\"search-2\"]/form/button")).click();
        // Pristupamo buttonu search pomoću className i simiuliramo click na ikonicu
        driver.findElement(By.className("search-submit")).click();
    }
}
