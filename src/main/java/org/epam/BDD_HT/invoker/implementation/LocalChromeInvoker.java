package org.epam.BDD_HT.invoker.implementation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.epam.BDD_HT.invoker.WebDriverInvoker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocalChromeInvoker implements WebDriverInvoker {
    @Override
    public WebDriver invokeWebDriver(){
        WebDriverManager.chromedriver().browserVersion("98").setup();
        return new ChromeDriver();
    }
}
