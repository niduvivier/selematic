import org.openqa.selenium.WebElement;

@FunctionalInterface
public interface IMethodParameter {
    WebElement testMethodParameter(String selector);
}
