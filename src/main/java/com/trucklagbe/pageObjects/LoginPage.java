package com.trucklagbe.pageObjects;

import com.trucklagbe.helper.WaitExplicit;
import com.trucklagbe.selenium.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends Page {
    WebDriver driver;

    @FindBy(className = "login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage() {
        driver.get("https://n.trucklagbe.com/adev/login");
        Wait.untilPageLoadComplete(driver);
        Wait.untilJqueryIsDone(driver);
    }

    public void userIsCurrentlyOnLoginPage() {
        Wait.untilPageLoadComplete(driver);
        Wait.untilJqueryIsDone(driver);
        Assert.assertTrue( driver.getCurrentUrl().contains("login") );
    }

    public Boolean checkIfUserIsCurrentlyOnLoginPage() {
        return driver.getCurrentUrl().contains("login");
    }

    public void clickLoginButton() {
        Wait.untilPageLoadComplete(driver);
        Wait.untilJqueryIsDone(driver);
        if (!checkIfUserIsCurrentlyOnLoginPage()) {
            return;
        }
        WaitExplicit.wait(10000);
        System.out.println(loginButton.findElement(By.className("title")).getAttribute("innerHTML"));
        loginButton.findElement(By.className("title")).click();
        loginButton.click();
        Wait.untilJqueryIsDone(driver);
        WaitExplicit.wait(3000);
    }
}
