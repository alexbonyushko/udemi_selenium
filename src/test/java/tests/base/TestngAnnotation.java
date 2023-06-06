package tests.base;

import org.testng.annotations.Test;

public class TestngAnnotation {
    /**
     * @Test(enabled = false)  - конкретный тест выполнять не нужно, true идет по дефолиу
     * @AfterSuite(alwaysRun = true) - выполнение чего-то в начале набора, есть для класса, теста, группы и метода (например закрывать вкладку/браузер, очищать cookie)
     * @BeforeSuite() - выполнение чего-то в конце набора, есть для класса, теста, группы и метода (сделать вычесление)
     * @Test(timeOut = 5000) - число предается в милисекундах, то есть тест должен выполниться за 5 сек, иначе будет помечен как failed
     * @Test(invocationCount = 2) тест выполниться 2 раза
     * @Test(invocationCount = 4, successPercentage = 50) - в 50% процентах тест может упасть и это норма использутеся вместо с аннтоцией invocationCount
     *
     */
}
