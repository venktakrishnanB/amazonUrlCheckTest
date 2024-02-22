import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonUrlCheckTest {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.in/");

            String currentUrl = driver.getCurrentUrl();

            if (currentUrl.equals("https://www.amazon.in/")) {
                System.out.println("Navigated to the amazon website successfully");
            } else {
                System.out.println("Navigation was unsuccessful");
            }

            driver.quit();
        }
    }

