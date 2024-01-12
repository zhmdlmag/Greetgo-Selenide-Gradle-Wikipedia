package util;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

public class ConfigurationClass {
    public static void configSetup(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://ru.wikipedia.org/";
    }
}

