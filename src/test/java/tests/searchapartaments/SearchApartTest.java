package tests.searchapartaments;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import tests.base.CustomListeners;

//@Listeners(tests.base.CustomListeners.class)
public class SearchApartTest extends BaseTest {
    @Test
    public void checkIsRedirectToListing() {
        basePage.open("https://realt.by/");
        realtHomePage
                .enterCountRoom()
                .clickToFind();

        realtListingPage
                .checkCountCards();

        switchWindow();

    }
}
