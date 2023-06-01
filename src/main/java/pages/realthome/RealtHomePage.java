package pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    By countRooms = By.xpath("//select[@id='rooms']");
    By optionTwoRooms = By.xpath("//select[@id='rooms']/option[@value='2']");
    By findBtn = By.xpath("//*[@id='residentialInputs']//a[text()='Найти']");

    public RealtHomePage enterCountRoom() {
        driver.findElement(countRooms).click();
        driver.findElement(optionTwoRooms).click();
        return this;
    }

    public RealtHomePage clickToFind() {
        driver.findElement(findBtn).click();
        return this;
    }

}
