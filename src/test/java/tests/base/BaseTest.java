package tests.base;

import common.CommonAction;
import org.openqa.selenium.Alert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.base.BasePage;
import pages.listing.RealtListingPage;
import pages.realthome.RealtHomePage;

import java.util.Set;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected RealtListingPage realtListingPage = new RealtListingPage(driver);
    WebDriverWait wait = new WebDriverWait(driver, 10);


    protected void switchWindow() {
        JavascriptExecutor js = (JavascriptExecutor) driver;//создание js экзекютера
        String window1 = driver.getWindowHandle();
        js.executeScript("window.open()");//с помощью js открытие новой вкладки
        Set<String> currentWindows = driver.getWindowHandles();//set  с хэшами вкладок браузера
        String window2 = null;
        for (String window :
                currentWindows) {
            if (!window.equals(window1)) {//если вкладка не равна вкладке window1
                window2 = window;//то мы запишем это значение в window2
                break;
            }
        }
        driver.switchTo().window(window2);//переключение на открытую вкладку с полученнным хэш-кодом
    }

    protected void workWithAlert() {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        alert.accept();
    }
    @AfterSuite(alwaysRun = true)//всегда выполнять
    public void quit(){
        //driver.close(); - //закрывает вкладку
        driver.quit();//закрывает браузер

    }
}
