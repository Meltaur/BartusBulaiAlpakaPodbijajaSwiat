module com.example.plemionagui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.seleniumhq.selenium.api;
    requires org.seleniumhq.selenium.support;
    requires io.github.bonigarcia.webdrivermanager;
    requires org.seleniumhq.selenium.firefox_driver;
    requires org.seleniumhq.selenium.chrome_driver;
    requires json.simple;

    opens com.example.plemionagui to javafx.fxml;
    exports com.example.plemionagui;
}