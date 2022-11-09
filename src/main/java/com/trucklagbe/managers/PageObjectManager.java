package com.trucklagbe.managers;

import com.trucklagbe.pageObjects.LoginPage;
import com.trucklagbe.pageObjects.owner.AddNewOwnerPage;
import com.trucklagbe.pageObjects.shipper.AddNewShipperPage;
import com.trucklagbe.pageObjects.trips.creation.LocationTab;
import com.trucklagbe.pageObjects.trips.creation.TripCreationIndexPage;
import com.trucklagbe.pageObjects.trips.creation.TripInformationTab;
import org.openqa.selenium.WebDriver;

import com.trucklagbe.pageObjects.trips.*;

public class PageObjectManager {
    protected WebDriver driver;

    // trips
    private RequestsPage requestsPage;
    private LocationTab locationTab;
    private TripInformationTab tripInformationTab;
    private TripCreationIndexPage tripCreationIndexPage;
    private LoginPage loginPage;

    // shipper
    private com.trucklagbe.pageObjects.shipper.IndexPage shipperIndexPage;
    private AddNewShipperPage addNewShipperPage;

    // owner
    private com.trucklagbe.pageObjects.owner.IndexPage ownerIndexPage;
    private AddNewOwnerPage addNewOwnerPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public RequestsPage getRequestsPage() {
        return (requestsPage == null) ? requestsPage = new RequestsPage(driver) : requestsPage;
    }

    public LocationTab getLocationTab() {
        return (locationTab == null) ? locationTab = new LocationTab(driver) : locationTab;
    }

    public TripInformationTab getTripInformationTab() {
        return (tripInformationTab == null) ? tripInformationTab = new TripInformationTab(driver) : tripInformationTab;
    }

    public TripCreationIndexPage getTripCreationIndexPage() {
        return (tripCreationIndexPage == null) ? tripCreationIndexPage = new TripCreationIndexPage(driver) : tripCreationIndexPage;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

    public com.trucklagbe.pageObjects.shipper.IndexPage getShipperIndexPage() {
        return (shipperIndexPage == null) ? shipperIndexPage = new com.trucklagbe.pageObjects.shipper.IndexPage(driver) : shipperIndexPage;
    }

    public AddNewShipperPage getAddNewShipperPage() {
        return (addNewShipperPage == null) ? addNewShipperPage = new AddNewShipperPage(driver) : addNewShipperPage;
    }

    public com.trucklagbe.pageObjects.owner.IndexPage getOwnerIndexPage() {
        return  (ownerIndexPage == null) ? ownerIndexPage = new com.trucklagbe.pageObjects.owner.IndexPage(driver) : ownerIndexPage;
    }

    public AddNewOwnerPage getAddNewOwnerPage() {
        return (addNewOwnerPage == null) ? addNewOwnerPage = new AddNewOwnerPage(driver) : addNewOwnerPage;
    }
}