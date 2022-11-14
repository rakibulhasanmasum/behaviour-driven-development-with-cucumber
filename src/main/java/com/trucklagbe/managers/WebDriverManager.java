package com.trucklagbe.managers;

import com.trucklagbe.enums.DriverType;
import com.trucklagbe.enums.EnvironmentType;
import com.trucklagbe.enums.OperatingSystemType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    private WebDriver driver;
    private static DriverType driverType;
    private static EnvironmentType environmentType;

    private static OperatingSystemType operatingSystemType;
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";

    private Boolean headless;

    public WebDriverManager() {
        driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
        environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
        operatingSystemType = FileReaderManager.getInstance().getConfigReader().getOperatingSystemType();
    }

    public WebDriver getDriver() {
        if(driver == null) driver = createDriver();
        return driver;
    }

    private WebDriver createDriver() {
        switch (environmentType) {
            case LOCAL : driver = createLocalDriver();
                break;
            case REMOTE : driver = createRemoteDriver();
                break;
        }
        return driver;
    }

    private WebDriver createRemoteDriver() {
        throw new RuntimeException("RemoteWebDriver is not yet implemented");
    }

    private WebDriver createLocalDriver() {
        switch (driverType) {
            case FIREFOX :
                // Not Using DriverManager
//                System.setProperty(FIREFOX_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath() + "geckodriver");

                // Using Driver Manager
                io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();

                // Options
                headless = FileReaderManager.getInstance().getConfigReader().getHeadlessOption();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
//                ProfilesIni allProfiles = new ProfilesIni();
//                FirefoxProfile firefoxProfile = allProfiles.getProfile("default");
//                firefoxOptions.setProfile(firefoxProfile);
//                String profileDir = System.getProperty("user.dir") + "/" + "firefox_data_dir";
                String profileDir = "/home/rakibul/Workstation/automation/behaviour-driven-development-with-cucumber/firefox_data_dir";
//                String profileDir = "/home/rakibul/snap/firefox/common/.mozilla/firefox/";
//                String profileDir = "/var/lib/jenkins/workspace/Automation Pipeline/firefox_data_dir";
                firefoxOptions.addArguments("--profile");
                firefoxOptions.addArguments(profileDir);
                firefoxOptions.setHeadless(headless);
                driver = new FirefoxDriver(firefoxOptions);
                break;
            case CHROME :
                headless = FileReaderManager.getInstance().getConfigReader().getHeadlessOption();
                String user_data_dir = "--user-data-dir=" + System.getProperty("user.dir") + "/" + FileReaderManager.getInstance().getConfigReader().getUserDataDirForChromeOptions() + "";

                // Not using ChromeDriverManagerDependency
//                System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath() + "chromedriver_" + operatingSystemType.toString().toLowerCase());

                // Using ChromeDriverManagerDependency
                io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();

                // Chrome options
                ChromeOptions options = new ChromeOptions();
                options.addArguments(user_data_dir);
                options.setHeadless(headless);
                options.addArguments("enable-automation");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-infobars");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--disable-browser-side-navigation");
                options.addArguments("--disable-gpu");
//                options.addArguments("--user-data-dir=/home/rakibul/Workstation/ruby-selenium-automation/user_data");
//                options.addArguments("--user-data-dir=/home/rakibul/Workstation/automation/behaviour-driven-development-with-cucumber/chrome_data_dir");
//                options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//                options.addArguments("--disable-extentions");
//                options.addArguments("--profile-directory=Profile 1");
                driver = new ChromeDriver(options);
                break;
            case INTERNETEXPLORER : driver = new InternetExplorerDriver();
                break;
        }

        if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
        return driver;
    }

    public void closeDriver() {
        driver.close();
        driver.quit();
    }
}
