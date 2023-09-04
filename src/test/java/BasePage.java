import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
        protected WebDriver driver;
        protected WebDriverWait wait;
        protected Actions actions;

        public BasePage (WebDriver driver){
            this.driver = driver;
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            actions = new Actions(driver);
        }

        public WebElement findElement(By locator) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }

    public void doubleCLickPlaylist(By locator) {
        actions.doubleClick(findElement(locator)).perform();
    }
}
