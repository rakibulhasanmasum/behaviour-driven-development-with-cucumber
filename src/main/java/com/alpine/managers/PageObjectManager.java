package com.alpine.managers;

import com.alpine.pageObjects.trips.creation.LocationTab;
import com.alpine.pageObjects.trips.creation.TripCreationIndexPage;
import com.alpine.pageObjects.trips.creation.TripInformationTab;
import org.openqa.selenium.WebDriver;

import com.alpine.pageObjects.trips.*;

public class PageObjectManager {
    protected WebDriver driver;
    private RequestsPage requestsPage;
    private LocationTab locationTab;
    private TripInformationTab tripInformationTab;
    private TripCreationIndexPage tripCreationIndexPage;

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
}