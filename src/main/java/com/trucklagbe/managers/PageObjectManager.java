package com.trucklagbe.managers;

import com.trucklagbe.pageObjects.LoginPage;
import com.trucklagbe.pageObjects.trips.creation.LocationTab;
import com.trucklagbe.pageObjects.trips.creation.TripCreationIndexPage;
import com.trucklagbe.pageObjects.trips.creation.TripInformationTab;
import org.openqa.selenium.WebDriver;

import com.trucklagbe.pageObjects.trips.*;

public class PageObjectManager {
    protected WebDriver driver;
    private RequestsPage requestsPage;
    private LocationTab locationTab;
    private TripInformationTab tripInformationTab;
    private TripCreationIndexPage tripCreationIndexPage;
    private LoginPage loginPage;

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
}