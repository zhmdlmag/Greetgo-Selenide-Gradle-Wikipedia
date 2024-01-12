package pom;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage extends ContentsPage {

    public ElementsCollection ARTICLE = $$(".mw-search-result-heading");
    public SearchResultPage checkArticlesCount() {
        ARTICLE.shouldHave(CollectionCondition.size(20));
        return this;
    }
}