package com.alpine.pageObjects.trips;

import com.alpine.selenium.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Objects;
import java.util.Set;

public class TripCreationPage {
    private final WebDriver driver;

    @FindBy(className = "shipper-container-fluid")
    private WebElement shipperContainerFluid;

    public TripCreationPage(WebDriver driver) {
        this.driver = driver;
        String oldHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles) {
            if (!Objects.equals(handle, oldHandle)) {
//                driver.close();
                driver.switchTo().window(handle);
                driver.getCurrentUrl();
                break;
            }
//            WaitExplicit.wait(5000);
//            System.out.println(handle);
        }
        PageFactory.initElements(driver, this);
        System.out.println("TRIP CREATION PAGE" + driver.getCurrentUrl());
    }
    public void userIsCurrentlyOnThisPage() {
        Wait.untilPageLoadComplete(driver, 100L);
        Wait.untilJqueryIsDone(driver);
        WaitExplicit.wait(2999);
//        String currentUrl = driver.getCurrentUrl();
//        System.out.println(currentUrl);
//        Assert.assertTrue(currentUrl.contains("trip_creation"));
//        shipperContainerFluid.getAttribute("innerHTML");
    }
}
