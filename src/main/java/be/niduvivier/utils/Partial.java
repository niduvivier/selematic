package be.niduvivier.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial {
    private static WebElement element = null;
    public static void include(String selector, IMethodParameter methodParameter){
        element = methodParameter.testMethodParameter(selector);
    }

    public static void test(String selector){
        IMethodParameter iMethodParameter = (s) -> {
            WebElement element = new ChromeDriver().findElement(By.className(s));
            return element;
        };

        element = iMethodParameter.testMethodParameter(selector);
    }
}
