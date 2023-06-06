package tests.searchapartaments;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class TestSOUT{
    @Test
    public void testSOUT() {
        System.out.println("TEST SOUT!!!");
    }
}

/**
 * запуск этого класса:
 * 1. создание переменной testngXML
 * 2. создание конфигурации при старте maven и предачи переменной testngXML
 * 3. создвние отдельного xml в ресурсах тестов с конфигурацией запуска
 * 4. запуск тестового комлекта - через команду в консоли  mvn clean test -DtestngXML=testng2.xml
 */
