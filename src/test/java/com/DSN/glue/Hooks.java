package com.DSN.glue;

import com.DSN.framework.Browser;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {
    @Before
    public void beforeScenario() {
        Browser.get().get("http://weirdpage.com");
        Browser.refresh(true);
    }

    @After(order = 2)
    public void afterScenario() {
        Browser.close();
    }

    @After(order = 3)
    public void embedScreenshot(Scenario scenario){
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot)Browser.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
    }

}
