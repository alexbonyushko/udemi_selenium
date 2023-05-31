package org.alboniushko;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * 29. Input Text
 */
public class InputTextTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alboniushko/IdeaProjects/udemi_selenium/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//неявное ожидание элемента на странице для всего проекта
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);//ожидание полной загрузки страницы
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);//ожидание выполнения асинхронного запроса

        By input = By.xpath("//*");

        WebElement element = driver.findElement(input);

        element.sendKeys("автомобили", Keys.ENTER);//ввод в инпут слова автомобили и нажатие ентера
        /**
         * sendKeys для:
         * 1. вставки текста и его отправки
         * 2. передача кодов конопок ( например копировать/вставить)
         * 3. загрузка файла на сервер
         */

        driver.get("https://www.google.com/");
    }
}
