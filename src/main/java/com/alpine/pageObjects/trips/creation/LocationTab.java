package com.alpine.pageObjects.trips.creation;

import com.alpine.helper.WaitExplicit;
import com.alpine.pageObjects.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LocationTab extends Page {
    private WebDriver driver;

    @FindBy(className = "shipper-container-fluid")
    private WebElement shipperContainerFluid;

    @FindBy(xpath = "//*[@id=\"location-panel\"]/app-location/div/div/div[1]/div/app-location-search-bar/div/div[1]/input")
    WebElement loadLocationInputField;

    @FindBy(xpath = "//*[@id=\"location-panel\"]/app-location/div/div/div[3]/div/app-location-search-bar/div/div[1]/input")
    WebElement unloadLocationInputField;

    @FindBy(className = "suggestion-item")
    List<WebElement> suggestionList;

    @FindBy(xpath = "/html/body/app-root/div/div[2]/section/app-trip-creation/div/div[2]/div[2]/button")
    WebElement doneButton;

    @FindBy(xpath = "/html/body/app-root/div/div[2]/section/app-trip-creation/div/div[2]/div[2]/button")
    WebElement nextButton;

    public LocationTab(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void setLoadLocation(String loadLocation) {
        loadLocationInputField.sendKeys(loadLocation);
    }

    public void selectNthLocationSuggestion(int suggestionEntryNumber)  {
        WebElement elem = suggestionList.get(suggestionEntryNumber - 1).findElement(By.className("title"));
        elem.click();
    }

    public void setUnloadLocation(String unloadLocation) {
        unloadLocationInputField.sendKeys(unloadLocation);
    }

    public void clickDoneButton() {
        doneButton.click();
    }

    public void clickNextButton() {
        nextButton.click();
        WaitExplicit.wait(200);
    }
}
