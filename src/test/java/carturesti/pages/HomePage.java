package carturesti.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://carturesti.ro/")
public class HomePage extends PageObject {

    @FindBy(css = "i[class='material-icons']")
    WebElement searchButton;

    public void searchFor(String keywords) {
        $("#search-input").sendKeys(keywords);
        searchButton.click();
    }
}
