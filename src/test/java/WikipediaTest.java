import org.testng.annotations.Test;
import pom.ContentsPage;
import pom.MainPage;

public class WikipediaTest extends MainPage {

    @Test
    public void checkButtonTest() {
        new MainPage()
                .openSite()
                .checkCreateArticleBtn();
    }

    @Test
    public void checkInputTest() {
        new ContentsPage()
                .clickContent()
                .checkInput();
    }

    @Test
    public void checkConfTest(){
        new ContentsPage()
                .clickContent()
                .checkConf();
    }

    @Test
    public void checkInputFillTest(){
        new ContentsPage()
                .clickContent()
                .checkInputField();
    }

    @Test
    public void checkArticleCountTest(){
        new ContentsPage()
                .checkInputField()
                .checkArticlesCount();

    }

}





