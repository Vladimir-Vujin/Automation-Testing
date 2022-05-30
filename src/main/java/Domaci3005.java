import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
Domaći:
Otići na http://www.strela.co.rs/, kliknuti na dugme Prodavnica u headeru, izabrati opciju Lukovi - Bows
iz leve navigacije, potom kliknuti na luk koji se zove Samick Sage, i onda proveriti da ime tog luka na
njegovoj stranici zaista sadrži reč Samick.
*/
public class Domaci3005 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("http://www.strela.co.rs/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement captionShop = driver.findElement(By.xpath("//*[@id=\"ctl00_RadMenu1\"]/ul/li[2]/a/span"));
        captionShop.click();

        WebElement optionBows = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_GrupeRadTreeView\"]/ul/li[1]/div/span[3]"));
        optionBows.click();

        WebElement samicSage = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_ListView1_ctrl35_Panel1\"]/figure/a/img"));
        samicSage.click();

        //*[@id="ctl00_MainContent_ItemListView_ctrl0_ItemNazivLabel"]
        WebElement bowLabel = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_ItemListView_ctrl0_ItemNazivLabel\"]"));
        String label = bowLabel.getText();
        //System.out.println(label);

        // Check in page label
        if(label.contains("Samick"))
            System.out.println("LABEL: Yes, its Samic Sage!");
        else
            System.out.println("LABEL: No, it isn't Samic Sage!");

        // CHECK in page title
        if(driver.getTitle().contains("Samick"))
            System.out.println("TITLE: Yes, its Samic Sage!");
        else
            System.out.println("TITLE: No, it isn't Samic Sage!");

        driver.close();
    }
}
