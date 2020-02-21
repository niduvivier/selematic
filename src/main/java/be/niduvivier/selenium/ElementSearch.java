package be.niduvivier.selenium;

import be.niduvivier.utils.IMethodParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ElementSearch {
    private String selector;
    private SelectorType selectorType;
    private WebElement element;
    private static WebDriver driver;

    private static Map<SelectorType, IMethodParameter> operations;

    static {
        operations = new HashMap<>();
        operations.put(SelectorType.ID, selector -> driver.findElement(By.id(selector)));
        operations.put(SelectorType.CLASSNAME, selector -> driver.findElement(By.className(selector)));
        operations.put(SelectorType.XPATH, selector -> driver.findElement(By.xpath(selector)));
        operations.put(SelectorType.CSSSELECTOR, selector -> driver.findElement(By.cssSelector(selector)));
        operations.put(SelectorType.TEXT, selector -> driver.findElement(By.xpath("//*[text()='"+selector+"']")));
    }

    public ElementSearch(WebDriver driver, String selector){
        ElementSearch.driver = driver;
        this.selector = selector;
        String temp = selector.substring(0,1);
        switch (temp){
            case "#": this.selectorType = SelectorType.ID; break;
            case ".": this.selectorType = SelectorType.CLASSNAME; break;
            case "/": this.selectorType = SelectorType.XPATH; break;
            case "?": this.selectorType = SelectorType.CSSSELECTOR; break;
            default: this.selectorType = SelectorType.TEXT; break;
        }
    }

    public void test(){
        operations.get(this.selectorType).testMethodParameter(selector);
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public SelectorType getSelectorType() {
        return selectorType;
    }

    public void setSelectorType(SelectorType selectorType) {
        this.selectorType = selectorType;
    }

    public WebElement getElement() {
        return element;
    }

    public void setElement(WebElement element) {
        this.element = element;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        ElementSearch.driver = driver;
    }
}
