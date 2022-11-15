import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "firefox";
    static String url = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            //set Chrome driver path
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            //start Chrome browser
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            //set FireFox driver path
            System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
            //start FireFox browser
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            //set edge driver path
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            //start edge browser
            driver = new EdgeDriver();
        }

        //Open url
        driver.get(url);

        //Give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page Title is: " + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get web elements or page source
        System.out.println("Page Source is : " + driver.getPageSource());

        //Find and enter username in username field element
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        //Find and enter password in password field element
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        //Close browser
        driver.quit();
    }
}
