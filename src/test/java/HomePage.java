import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By playlistField = By.cssSelector("#playlists li:nth-child(3)");
    By newPlaylist = By.cssSelector("[name='name']");
    By notification = By.cssSelector("div.success.show");

    public void doubleCLickPlaylist() {
        doubleCLickPlaylist(playlistField);
    }
    public void enterNewPlaylist(String playlist) {
        findElement(newPlaylist).sendKeys(Keys.chord(Keys.COMMAND,"A",Keys.DELETE));
        findElement(newPlaylist).sendKeys(playlist);
        findElement(newPlaylist).sendKeys(Keys.ENTER);
    }
    public String renamePlaylistMsg() {
        return findElement(notification).getText();
    }
}
