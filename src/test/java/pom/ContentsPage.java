package pom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ContentsPage extends MainPage {

    public final SelenideElement INPUT = $(".mw-searchInput");
    public final SelenideElement POLICY = $("#footer-places-privacy");
    public final SelenideElement SEARCH = $("input.mw-ui-button");

    public void checkInput(){
        INPUT.shouldBe(Condition.visible);
    }

    public void checkConf(){
        POLICY.scrollIntoView(true).shouldBe(visible);
    }

    public SearchResultPage checkInputField(){
        INPUT.setValue("гора");
        SEARCH.click();
        return new SearchResultPage();
    }
}