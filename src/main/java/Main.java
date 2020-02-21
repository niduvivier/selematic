import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        Partial.include("aaaa", (selector) -> {

            Interactor.click(selector);
            return null;
        });
    }
}
