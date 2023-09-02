import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


class Homework21 extends BaseTest {
    String expectedRenamePlaylistMsg = "Updated playlist \"My New Playlist.\"";
    String playlist = "My New Playlist";
    @Test
    public void renamePlaylist() {
        provideEmail("merry.lordlie@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();
        doubleCLickPlaylist();
        enterNewPlaylist();
        Assert.assertEquals(renamePlaylistMsg(), expectedRenamePlaylistMsg);
    }

    public void enterNewPlaylist() {
        WebElement newPlaylist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name']")));
        newPlaylist.sendKeys(Keys.chord(Keys.COMMAND,"A",Keys.DELETE));
        newPlaylist.sendKeys(playlist);
        newPlaylist.sendKeys(Keys.ENTER);
    }

    public void doubleCLickPlaylist() {
        WebElement playlistField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#playlists li:nth-child(3)")));
        actions.doubleClick(playlistField).perform();
    }

    public String renamePlaylistMsg() {
        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
        return notification.getText();
    }
}

