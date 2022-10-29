package com.alpine.cucumber;

import com.alpine.managers.PageObjectManager;
import com.alpine.managers.WebDriverManager;

public class TestContext {
    private final WebDriverManager webDriverManager;
    private final PageObjectManager pageObjectManager;
    public final ScenarioContext scenarioContext;

    public TestContext(){
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
        scenarioContext = new ScenarioContext();
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }
}
