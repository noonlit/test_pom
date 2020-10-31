package carturesti.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

@DefaultUrl("https://carturesti.ro/")
public class HomePage extends PageObject {
    /**
     * Searches for the given input.
     *
     * @param keywords The input.
     */
    public void searchFor(String keywords) {
        WebElementFacade element = $("#search-input");

        element.sendKeys(keywords);
        element.sendKeys(Keys.ENTER);
    }
}
