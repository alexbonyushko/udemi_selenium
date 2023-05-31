package org.alboniushko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * 30. Get Text
 */
public class GetTextTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alboniushko/IdeaProjects/udemi_selenium/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//неявное ожидание элемента на странице для всего проекта
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);//ожидание полной загрузки страницы
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);//ожидание выполнения асинхронного запроса

        By input = By.xpath("//*");
        WebElement element = driver.findElement(input);
        String name = element.getText();// получение содержимого тэга

        driver.get("https://www.google.com/");
    }
}
