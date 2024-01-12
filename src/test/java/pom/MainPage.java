package pom;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.reporters.jq.Main;
import util.ConfigurationClass;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class MainPage extends ConfigurationClass {

    final SelenideElement CONTENT = $("#n-content");
    final SelenideElement BUTTON = $(".main-top-createArticle");


    public MainPage(){
        configSetup();
        open("/");
    }

    public MainPage checkCreateArticleBtn(){
        BUTTON.shouldBe(visible,enabled);
        return this;
    }

    public ContentsPage clickContent() {
        CONTENT.click();
        return new ContentsPage();
    }
}
