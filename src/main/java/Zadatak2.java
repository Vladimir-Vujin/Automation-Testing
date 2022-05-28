import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Zadatak 2
Napisati program koji:
●    učitava stranicu https://demoqa.com/login
●    loginuje se sa usename-om itbootcamp i lozinkom ITBootcamp2021!
●    zatim čeka 5 sekundi da se korisnik uloguje
●    klikne na dugme za logout
●    Gasi google chrome
*/
public class Zadatak2 {

    public static void main(String[] args) {

        try {
            System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.navigate().to("https://demoqa.com/login");

            // Prvi način unosim user name, password i kliknemo mišem na dugme login
            // driver.findElement(By.id("userName")).sendKeys("itbootcamp");
            // driver.findElement(By.id("password")).sendKeys("ITBootcamp2021!");
            // driver.findElement(By.id("login")).click();

            // Drugi način, unosimo user name, password i dok smo u polju password pritisnemo dugme ENTER
            driver.findElement(By.id("userName")).sendKeys("itbootcamp");
            // imenujemo promenljivu
            WebElement inputPassword = driver.findElement(By.id("password"));
            // Simuliramo pritisak na ENTER, klasa Keys simulira sve znakove na tastaturi
            // inputPassword.sendKeys("ITBootcamp2021!");
            // inputPassword.sendKeys(Keys.ENTER);
            // Ili gornja dva reda skraćeno u jednom redu
            inputPassword.sendKeys("ITBootcamp2021!" + Keys.ENTER);

            // Koristimo java klasu Thread da program miruje 5 sekundi tj da ga zaustavimo 5 sekundi
            Thread.sleep(5000); // 5 sekundi program miruje

            WebElement logout =driver.findElement(By.id("submit"));
            logout.click();

            // Ovo ne pi[e u zadatku nego čisto da proverimo da je uradio log out
            Thread.sleep(3000);

            // zatvaranje prozora
            driver.close();

        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
