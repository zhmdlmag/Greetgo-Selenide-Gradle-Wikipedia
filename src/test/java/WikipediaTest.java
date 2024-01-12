import org.testng.annotations.Test;
import pom.ContentsPage;
import pom.MainPage;

public class WikipediaTest{

    @Test
    public void checkButtonTest() {
        new MainPage()
                .checkCreateArticleBtn();
    }

    @Test
    public void checkInputTest() {
        new ContentsPage()
                .checkInput();
    }

    @Test
    public void checkConfTest(){
        new ContentsPage()
                .checkPolicy();
    }

    @Test
    public void checkInputFillTest(){
        new ContentsPage()
                .searchForValue();
    }

    @Test
    public void checkArticleCountTest(){
        new ContentsPage()
                .searchForValue()
                .checkArticlesCount();
    }

}





