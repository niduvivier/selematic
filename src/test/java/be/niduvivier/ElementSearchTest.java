package be.niduvivier;

import be.niduvivier.selenium.ElementSearch;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ElementSearchTest {
    @Test
    public void verifyIdSelector(){
        FakeDriver driver = new FakeDriver();
        ElementSearch elementSearch = new ElementSearch(driver, "#haha");
        elementSearch.test();
        Assert.assertEquals("ById",driver.getTestClass());
    }

    @Test
    public void verifyClassnameSelector(){
        FakeDriver driver = new FakeDriver();
        ElementSearch elementSearch = new ElementSearch(driver, ".haha");
        elementSearch.test();
        Assert.assertEquals("ByClassName",driver.getTestClass());
    }

    @Test
    public void verifyCssSelector(){
        FakeDriver driver = new FakeDriver();
        ElementSearch elementSearch = new ElementSearch(driver, "?haha");
        elementSearch.test();
        Assert.assertEquals("ByCssSelector",driver.getTestClass());
    }

    @Test
    public void verifyXpathSelector(){
        FakeDriver driver = new FakeDriver();
        ElementSearch elementSearch = new ElementSearch(driver, "/haha");
        elementSearch.test();
        Assert.assertEquals("ByXPath",driver.getTestClass());
    }

    @Test
    public void verifyTextSelector(){
        FakeDriver driver = new FakeDriver();
        ElementSearch elementSearch = new ElementSearch(driver, "haha");
        elementSearch.test();
        Assert.assertEquals("ByXPath",driver.getTestClass());
        Assert.assertEquals("By.xpath: //*[text()='haha']",driver.getTestBy());
    }
}
