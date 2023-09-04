import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework23 extends BaseTest{
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
