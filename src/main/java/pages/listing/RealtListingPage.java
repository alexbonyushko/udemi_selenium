package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import pages.base.BasePage;
import pages.realthome.RealtHomePage;

public class RealtListingPage extends BasePage {
    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class='hover:shadow-10bottom overflow-hidden rounded-md']");

    public RealtListingPage checkCountCards() {
        waitElementIsVisible(driver.findElement(card));
        /**
         * Hard asserts - тест упадет
         * Assertion assertion = new Assertion(); - создание ассертов через экземпляр класса Assertion
         * assertion.assertEquals(123,123,"This is right"); - проверка значений между собой и вывод сообщения
         * assertion.assertTrue(); - проверка что пришел true
         * assertion.assertNotNull(); - что пришел не null

         * Soft asserts - тест идет дальше независимо от результата ассерат, но у нас будет сообщение
         * SoftAssert softAssert = new SoftAssert(); - - создание ассертов через экземпляр класса SoftAssert
         * softAssert.assertNotNull();
         */

        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 30);
        return this;
    }

}
