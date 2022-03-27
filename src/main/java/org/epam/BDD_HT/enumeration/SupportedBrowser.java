package org.epam.BDD_HT.enumeration;

import org.epam.BDD_HT.invoker.WebDriverInvoker;
import org.epam.BDD_HT.invoker.implementation.LocalChromeInvoker;
import org.epam.BDD_HT.invoker.implementation.LocalFirefoxInvoker;
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
