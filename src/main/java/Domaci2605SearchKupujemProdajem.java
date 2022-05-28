import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


/*
Domaći: Otići na kupujemprodajem.com, u pretragu ukucati iphone 13,
kliknuti na prvi rezultat. Proveriti da je naslov oglasa onaj koji
smo uočili i tokom manuelnog izvođenja kejsa.
*/
public class Domaci2605SearchKupujemProdajem {

    public static void main(String[] args) {
        try {

            System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.navigate().to("https://www.kupujemprodajem.com");

            // Sleep for 5 seconds
            Thread.sleep(5000);

            // remove modal - pop up window in my case
            driver.findElement(By.xpath("//*[@id=\"bodyTag\"]/div[9]/div/div[2]")).click();

            driver.findElement(By.id("searchKeywordsInput")).sendKeys("iphone 13" + Keys.ENTER);

            List<WebElement> listaOglasa = driver.findElements(By.xpath("//a[contains(@class, 'adName')]"));

            String expectingTitle = "iPhone 13, iPhone 12, iPhone 11 - NOVO!";
            String actualTitle = listaOglasa.get(0).getText();

            if (expectingTitle.equals(actualTitle))
                System.out.println("Očekivani naslov prvog oglasa: " + expectingTitle + "\n" +
                        "Aktuelni naslov prvog oglasa: " + actualTitle + "\n" + "Test case: true (poklapaju se naslovi)");
            else
                System.out.println("Očekivani naslov prvog oglasa: " + expectingTitle + "\n" +
                        "Aktuelni naslov prvog oglasa: " + actualTitle + "\n" + "Test case: fale (ne poklapaju se naslovi)");


            //Thread.sleep(20000);
            // NAPOMEN: Program je odradio klik na prvi oglas ali treba da se sačeka bukvalno par minuta
            WebElement element = driver.findElement(By.xpath("//*[@id='adDescription7321776']/div/section[2]/div[1]/div[1]/a"));
            element.sendKeys(Keys.ENTER);

            // Dokaz da je otvorio prvi oglas
            System.out.println(driver.getTitle());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
