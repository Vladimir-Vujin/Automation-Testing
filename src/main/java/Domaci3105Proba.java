import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Domaci3105Proba {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.telerik.com/support/demos");
        //*[@id="ContentPlaceholder1_T53129E6C012_Col00"]/nav/div/div[2]/a[2]
        //*[@id="ContentPlaceholder1_T53129E6C012_Col00"]/nav/div/div[2]/a[3]
        //WebElement desktopClick = driver.findElement(By.xpath("//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/div/div[2]/a[2]"));
        WebElement desktopClick = driver.findElement(By.xpath("//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/div/div[2]/a[3]"));
        desktopClick.click();

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mobile")));
        WebElement element = driver.findElement(By.id("desktop"));
        //driverWait.until(ExpectedConditions.visibilityOf(element));

        WebElement element1 = driver.findElement(By.id("mobile"));
        System.out.println(element1.getText());

        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/div/div[2]/a[2]"));
        System.out.println(element2.getText());
        System.out.println(element2.getAttribute("href"));

        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/div/div[2]/a[3]"));
        System.out.println(element3.getText());
        System.out.println(element3.getAttribute("href"));
        //driverWait.until(ExpectedConditions.visibilityOf(element));

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        // Css selector #desktop
        /*if( driver.findElement(By.cssSelector("#mobile")).isDisplayed()){
            System.out.println("Element is Visible");
        }else{
            System.out.println("Element is InVisible");
        }

        if( driver.findElement(By.cssSelector("#desktop")).isDisplayed()){
            System.out.println("Element is Visible");
        }else{
            System.out.println("Element is InVisible");
        }*/

        /*System.out.println("Desktop");
        System.out.println(element.getAttribute("top"));
        System.out.println(element.isDisplayed());
        System.out.println(element.getLocation());
        System.out.println(element.isSelected());
        boolean desktop = driver.findElement(By.id("desktop")).isDisplayed();
        System.out.println(desktop);


        System.out.println("Mobile");
        System.out.println(element1.getAttribute("top"));
        System.out.println(element1.isDisplayed());
        System.out.println(element1.getLocation());
        System.out.println(element1.isSelected());
        boolean mobile = driver.findElement(By.id("mobile")).isDisplayed();
        System.out.println(mobile);
        //Assert.assertEquals(true, element.isDisplayed());*/

        //driver.close();

    }
}
