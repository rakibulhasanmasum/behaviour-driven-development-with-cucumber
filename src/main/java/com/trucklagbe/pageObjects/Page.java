package com.trucklagbe.pageObjects;

import com.trucklagbe.helper.WindowHandler;
import com.trucklagbe.selenium.Wait;
import org.apache.commons.io.FileUtils;
import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.DB;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class Page {
    WebDriver driver;
    public Page(WebDriver webDriver) {
        driver = webDriver;
    }

    public void handOverTheWindowHandler() {
        WindowHandler.handOverTheHandlerToNextTab(driver);
        Wait.untilPageLoadComplete(driver);
        Wait.untilJqueryIsDone(driver);
    }

    public void takeScreenShot(WebElement el, String fileName) {
        try {
            File x = el.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(x, new File("target/screenshots/" + fileName));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
}
