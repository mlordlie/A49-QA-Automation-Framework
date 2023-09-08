import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css ="[type='email']")
    WebElement emailField;
    @FindBy(css = "[type='password']")
    WebElement passwordField;
    @FindBy(css = "button[type='submit']")
    WebElement submit;

    public void provideEmail(String email) {
        emailField.sendKeys(email);
    }

    public void providePassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSubmit() {
        submit.click();
    }

    public void loginEmptyEmailPassword() {
        provideEmail("merry.lordlie@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();
    }
}
