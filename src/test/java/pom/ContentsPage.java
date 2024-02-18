package pom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import util.ConfigurationClass;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ContentsPage extends ConfigurationClass {

    public ContentsPage() {
        configSetup();
        open("/wiki/Википедия:Содержание");
    }

    public final SelenideElement
            INPUT = $(".mw-searchInput"),
            POLICY = $("#footer-places-privacy"),
            SEARCH = $("input.mw-ui-button");

    public void checkInput() {
        INPUT.shouldBe(Condition.visible);
    }

    public void checkPolicy() {
        POLICY.scrollIntoView(true).shouldBe(visible);
    }

    public void checkInputFill() {
        INPUT.setValue("гора").shouldHave(value("гора"));
    }

    public SearchResultPage searchForValue() {
        checkInputFill();
        SEARCH.click();
        return new SearchResultPage();
    }
}