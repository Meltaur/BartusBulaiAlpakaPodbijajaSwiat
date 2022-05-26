package com.example.enumeration.factory;

import com.example.properties.converters.SupportedBrowserConverter;
import com.example.properties.holders.PropertyHolder;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    public WebDriver getWebDriver(){
        return SupportedBrowserConverter.valueOfWebBrowser(
                new PropertyHolder().readProperty("browser")).getWebDriver();
    }
}
