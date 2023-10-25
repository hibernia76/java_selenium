import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.manage().window().maximize();

        try {
        driver.get("https://google.ie");

        //WebElement signUpHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Sign up for GitHub']")));
        // Perform actions on the page (if needed)

        } finally {
            driver.quit(); // Ensure the WebDriver is closed even if an exception occurs
        }
        //driver.close();
    }
}
