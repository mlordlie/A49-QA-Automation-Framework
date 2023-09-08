import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css ="#playlists li:nth-child(3)")
    WebElement playlistField;
    @FindBy(css = "a.active")
    WebElement newPlaylist;
    @FindBy(css = "div.success.show")
    WebElement notification;

    public void doubleCLickPlaylist() {
        playlistField.click();
    }
    public void enterNewPlaylist(String playlist) {
        newPlaylist.sendKeys(Keys.chord(Keys.COMMAND,"A", Keys.DELETE));
        newPlaylist.sendKeys(playlist);
        newPlaylist.sendKeys(Keys.RETURN);
    }
    public String renamePlaylistMsg() {
        return notification.getText();
    }
}
