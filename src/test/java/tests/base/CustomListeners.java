package tests.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import java.io.File;
import java.io.IOException;

public class CustomListeners implements ITestListener {//слушает что происходит в процессе выполнения наших тестов и видит некие событие

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        String message = result.getName().trim();
        ITestContext context = result.getTestContext();//получение контекста теста
        WebDriver driver = (WebDriver) context.getAttribute("driver");//получение драйвера из контекста теста
        makeScreeshot(message, driver);

    }

    @Override
    public void onTestFailure(ITestResult result) {//метод для выполнения действий, если тест упал
        System.out.println("Hello");
    }

    public void makeScreeshot(String methodName, WebDriver driver) {//создание скриншота
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File(methodName + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
