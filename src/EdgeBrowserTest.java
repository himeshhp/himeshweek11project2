import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";

        //Set Chrome driver path
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //Start Chrome browser
        WebDriver driver = new EdgeDriver();

        //Open url
        driver.get(url);

        //Give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page Title is: " + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get web elements or page source
        System.out.println("Page Source is: " + driver.getPageSource());

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


