package pom;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import util.ConfigurationClass;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class MainPage extends ConfigurationClass {

    final SelenideElement CONTENT = $("#n-content");
    final SelenideElement BUTTON = $(".main-top-createArticle");

    public MainPage openSite(){
        open(Configuration.baseUrl);
        return this;
    }

    public MainPage checkCreateArticleBtn(){
        BUTTON.shouldBe(visible, enabled);
        return this;
    }

    public ContentsPage clickContent() {
        openSite();
        CONTENT.click();
        return new ContentsPage();
    }
}
