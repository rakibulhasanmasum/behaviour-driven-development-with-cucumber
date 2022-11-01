package com.alpine.pageObjects.trips;

import com.alpine.managers.FileReaderManager;
import com.alpine.pageObjects.Page;
import com.alpine.selenium.Wait;
import com.alpine.testDataTypes.Shipper;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RequestsPage extends Page {
    private WebDriver driver;

    @FindBy(id = "create_new_trip")
    private WebElement createNewTripButton;

    @FindBy(id = "search_button")
    private WebElement shipperSearchButton;

    @FindBy(name = "search_shipper")
    private WebElement searchInputFieldForShipper;

    @FindBy(className = "shipper_card")
    private WebElement shipperCard;

    @FindBy(className = "shipper_body_id")
    private WebElement shipperBodyId;

    @FindBy(id = "proceed")
    private WebElement proceedButton;

    public RequestsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void navigateToRequestsPage() {
        Wait.untilPageLoadComplete(driver);
        Wait.untilJqueryIsDone(driver);
        driver.get(FileReaderManager.getInstance().getConfigReader().getRequestsUrl());
    }

    public void clickNewTripButton() {
        createNewTripButton.click();
    }

    public void checkIfShipperSearchButtonExists() {
        if (shipperSearchButton == null) {
            throw new NoSuchElementException("Can not locate shipper search button");
        }
    }

    public void enterValuesInShipperSearchInputField(String shipperData) {
        searchInputFieldForShipper.sendKeys(shipperData);
    }

    public void clickShipperSearchButton() {
        shipperSearchButton.click();
        Wait.untilJqueryIsDone(driver);
    }

    public void checkIfShipperCardAppears() {
        if (shipperCard == null) {
            throw new NoSuchElementException("Can not locate shipper card");
        }
    }

    public void checkIfShipperInfoMatches(String shipperInfo) {
        String shipperId = shipperBodyId.getText().replace("#", "");
        Assert.assertEquals(shipperId, shipperInfo);
    }

    public void clickProceedButton() {
        proceedButton.click();
    }
}