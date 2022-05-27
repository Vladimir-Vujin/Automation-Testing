import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestKupujemProdajem {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.kupujemprodajem.com");

        // remove modal - pop up window
        driver.findElement(By.xpath("//*[@id=\"bodyTag\"]/div[9]/div/div[2]")).click();

        WebElement element = driver.findElement(By.id("searchKeywordsInput"));
        element.sendKeys("iphone 13");
        element.submit();


        //driver.close();
    }
}
