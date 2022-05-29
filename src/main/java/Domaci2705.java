import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Otići na https://www.stealmylogin.com/demo.html, uneti bilo koje kredencijale za login, pritisnuti dugme.
Izvršiti proveru da je, nakon logina, URL promenjen na https://example.com/ kroz grananje.
Ako jeste, štampati “Nice”. Ako nije, štampati “Not nice.”
Sve elemente koji se koriste smestiti u intuitivno imenovane promenljive.
Kod na git, screen recording puštanja i izvršavanja testa na Drive.
* */
public class Domaci2705 {

    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.navigate().to("https://www.stealmylogin.com/demo.html");

            //String firstURL = driver.getCurrentUrl();

            WebElement userName = driver.findElement(By.name("username"));
            userName.sendKeys("Vladimir");

            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("Vujin");

            WebElement loginButton = driver.findElement(By.xpath("/html/body/form/input[3]"));
            loginButton.click();

            String actualURL = driver.getCurrentUrl();
            String expectingURL = "https://example.com/";

            if (actualURL.equals(expectingURL))
                System.out.println("Nice");
            else
                System.out.println("Not nice");

            /*String newURL = driver.getCurrentUrl();
            if(!firstURL.equals(newURL))
                System.out.println("Nice");
            else
                System.out.println("Not nice");

            System.out.println("First URL: " + firstURL);
            System.out.println("New URL: " + newURL);*/

            // Ne traži se u zadatku, uradio sam zbog vežbe
            // driver.navigate().back();

            Thread.sleep(3000);

            driver.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
