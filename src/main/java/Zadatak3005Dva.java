import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
* Zadatak 2
Napisati program koji ucitava stranicu https://www.ebay.com/ i bira kategoriju “Crafts”
eBayeBay
Electronics, Cars, Fashion, Collectibles & More | eBay
Buy & sell electronics, cars, clothes, collectibles & more on eBay, the world's online marketplace.
* Top brands, low prices & free shipping on many items.
* */
public class Zadatak3005Dva {

    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.navigate().to("https://www.ebay.com/");

            Select selectCategory = new Select(driver.findElement(By.id("gh-cat")));
            selectCategory.selectByVisibleText("Crafts");

            Thread.sleep(5000);

            selectCategory.selectByVisibleText("Art");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
