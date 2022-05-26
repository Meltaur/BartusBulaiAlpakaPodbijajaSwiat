package com.example.enumeration;

import com.example.invoker.WebDriverInvoker;
import com.example.invoker.implementation.LocalChromeInvoker;
import com.example.invoker.implementation.LocalFirefoxInvoker;
import org.openqa.selenium.WebDriver;

public enum SupportedBrowser {
    LOCAL_CHROME(new LocalChromeInvoker()),
    LOCAL_FIREFOX(new LocalFirefoxInvoker());

    private WebDriverInvoker webDriverInvoker;

    SupportedBrowser(WebDriverInvoker webDriverInvoker){
        this.webDriverInvoker = webDriverInvoker;
    }


    public WebDriver getWebDriver(){
        return webDriverInvoker.invokeWebDriver();
    }
}
