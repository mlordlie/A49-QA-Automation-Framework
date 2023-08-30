import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Homework19 extends BaseTest {
    String expectedDeletedPlaylistMsg = "Deleted playlist \"My Playlist.\"";
    @Test
    public void deletePlaylist() throws InterruptedException {
        provideEmail("merry.lordlie@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();
        clickPlaylist();
        clickDeleteBtnPlaylist();
        clickOKBtn();
        Assert.assertEquals(deletedPlaylistMsg(), expectedDeletedPlaylistMsg);
    }

    public void clickOKBtn() {
        WebElement okBtn = driver.findElement(By.xpath("//button[@class='ok']"));
        okBtn.click();
    }

    public void clickPlaylist() throws InterruptedException{
        WebElement myPlaylist = driver.findElement(By.cssSelector("#playlists li:nth-child(3)"));
        myPlaylist.click();
        Thread.sleep(2000);
    }

    public void clickDeleteBtnPlaylist() {
        WebElement deleteBtn = driver.findElement(By.xpath("//button[@title='Delete this playlist']"));
        deleteBtn.click();
    }

    public String deletedPlaylistMsg() {
        WebElement notificationAlert = driver.findElement(By.xpath("//div[@class='alertify-logs top right']"));
        return notificationAlert.getText();
    }
}
