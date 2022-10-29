package com.alpine.cucumber;

import com.alpine.managers.PageObjectManager;
import com.alpine.managers.WebDriverManager;

public class TestContext {
    private final WebDriverManager webDriverManager;
    private final PageObjectManager pageObjectManager;

    public TestContext(){
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
