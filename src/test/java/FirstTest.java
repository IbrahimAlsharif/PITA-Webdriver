import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Setup {
    @Test
    public void initialize(){
        WebDriver chromeDriver = WebDriverManager.chromedriver().create();
        chromeDriver.get("https://google.com");
    }
}
