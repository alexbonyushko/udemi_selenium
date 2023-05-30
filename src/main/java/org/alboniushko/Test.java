package org.alboniushko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alboniushko/IdeaProjects/udemi_selenium/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //поиск элемента на UI по id
        WebElement input = driver.findElement(By.id("QWE"));
        /**
         * поиск элемента на UI по css
         *  * - все элементы на странице
         *  #main - поиск по id=main
         *  .main - поиск по классу main
         *  div a - все div у которых есть ссылка
         *  div.main a - div с классом main c ссылками
         *  div.main + p - первый параграф(элемент) после div с классом main
         *  div.main ~ p - все параграфы(элементы) после div с классом main
         *  a[href='hello'] - поиск по всему содержимому в таге a
         *  a[href*='hello'] - поиск по части содержимого(текста) в таге a
         *  a[href^='hello'] - поиск по всему содержимому(тексту) который начинается со слов 'hello' в таге a
         *  a[href$='hello'] - поиск по всему содержимому(тексту) который заканчивается словами 'hello' в таге a
         *  div:not(#main) - все div которые не имеют id=main
         *  div::first-line - первая строка div
         *  div::nth-child(4) - поиск 4го дочернего элемента в div
         *  div::nth-last-сhild() - поиск последнего дочернего элемента в div
         *  div::nth-last-сhild(2) - поиск 2го дочернего элемента с конца в div
         *  div::ашкые-сhild - поиск первого дочернего элемента в div
         */

        WebElement inputCss = driver.findElement(By.cssSelector(""));
    }
}
