package carturesti.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultsPage extends PageObject  {
    @FindBy(tagName = "h5")
    List<WebElement> listingCards;

    /**
     * @return The titles of the products on the search results page.
     */
    public List<String> getResultTitles() {
        return listingCards.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}
