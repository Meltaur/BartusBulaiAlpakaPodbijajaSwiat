package org.epam.BDD_HT.properties.converters;

import org.epam.BDD_HT.enumeration.SupportedBrowser;

public final class SupportedBrowserConverter {
    public static SupportedBrowser valueOfWebBrowser(String webBrowser){
         return switch (webBrowser){
             case "local_chrome" -> SupportedBrowser.LOCAL_CHROME;
             case "local_firefox" -> SupportedBrowser.LOCAL_FIREFOX;
             default -> throw new IllegalArgumentException("No appropriate browser found");
         };
    }
}
