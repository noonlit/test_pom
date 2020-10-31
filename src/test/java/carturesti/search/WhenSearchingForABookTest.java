package carturesti.search;

import carturesti.steps.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class WhenSearchingForABookTest {
    @Steps
    SearchSteps guestSearcher;

    @Test
    public void should_see_related_book(){
        // Given
        guestSearcher.opens_home_page();

        // When
        guestSearcher.searches_for_book("the haunting");

        // Then
        guestSearcher.should_see_book("The Haunting of Hill House");
    }
}