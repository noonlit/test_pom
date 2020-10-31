package carturesti.tests;

import carturesti.steps.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)
public class WhenSearchingForABookTest {
    @Managed
    WebDriverFacade driver;

    @Steps
    SearchSteps client;

    @Test
    public void should_see_related_book(){
        // Given
        client.opens_home_page();

        // When
        client.searches_for_book("the haunting");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Then
        client.should_see_book("The Haunting of Hill House");
    }
}