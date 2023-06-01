package tests.searchapartaments;

import tests.base.BaseTest;

public class SearchApartTest extends BaseTest {
    public void checkIsRedirectToListing() {
        basePage.open("https://realt.by/");
        realtHomePage
                .enterCountRoom()
                .clickToFind();
    }
}
