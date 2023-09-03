import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework22 extends BaseTest{
    String expectedRenamePlaylistMsg = "Updated playlist \"My New Playlist.\"";
    String playlist = "My New Playlist";
    @Test
    public void renamePlaylist() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.loginEmptyEmailPassword();
        homePage.doubleCLickPlaylist();
        homePage.enterNewPlaylist(playlist);
        Assert.assertEquals(homePage.renamePlaylistMsg(), expectedRenamePlaylistMsg);
    }
}

