package org.epam.BDD_HT.enumeration.factory;

import org.epam.BDD_HT.properties.converters.SupportedBrowserConverter;
import org.epam.BDD_HT.properties.holders.PropertyHolder;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    public WebDriver getWebDriver(){
        return SupportedBrowserConverter.valueOfWebBrowser(
                new PropertyHolder().readProperty("browser")).getWebDriver();
    }
}
