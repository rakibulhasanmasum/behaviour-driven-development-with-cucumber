package playground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestFacebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "bin/chromedriver_linux");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://google.com");
        driver.quit();
    }
}