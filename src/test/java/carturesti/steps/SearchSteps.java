package carturesti.steps;

import carturesti.pages.HomePage;
import carturesti.pages.SearchResultsPage;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.List;

public class SearchSteps {
    HomePage homePage;
    SearchResultsPage searchResultsPage;

    @Step
    public void opens_home_page() {
        homePage.open();
    }

    @Step
    public void searches_for_book(String keywords) {
        homePage.searchFor(keywords);
    }

    @Step
    public void should_see_book(String title) {
        List<String> resultTitles = searchResultsPage.getResultTitles();
        assertThat(resultTitles, hasItem(title));
    }
}
