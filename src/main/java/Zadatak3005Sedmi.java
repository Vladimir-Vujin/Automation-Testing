import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadatak3005Sedmi {

/*
Zadatak 7 (za vežbanje)
Ucitava stranicu https://demoqa.com/login
Loguje se sa usename itbootcamp i lozinkom ITBootcamp2021!
Zatim ceka do maksimalno 5 sekundi da se korisnik uloguje
Proverava da li se korisnik ulogovao, tako sto se proverava postojanje dugmeta Logout. Ispisati odgovarajucu poruku
u konzoli za rezultat logovanja.
Klikne na dugme za logout
Gasi stranicu
*/
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com/login");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("itbootcamp");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("ITBootcamp2021!");

        WebElement loginClick = driver.findElement(By.id("login"));
        loginClick.click();

        System.out.println("User successfully login!");

        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("submit")));

        WebElement logoutClick = driver.findElement(By.id("submit"));
        logoutClick.click();

        System.out.println("User successfully logout!");

        driver.close();
    }
}
