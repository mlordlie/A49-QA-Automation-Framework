import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework17 extends BaseTest{
    String expectedAddedSongMsg = "Added 1 song into \"Homework17.\"";
    @Test
    public void addSongToPlaylist() throws InterruptedException {
        navigateToPage();
        provideEmail("merry.lordlie@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();
        Thread.sleep(2000);
        searchSong("Pluto");
        clickViewAll();
        clickFirstSong();
        clickAddTo();
        selectMyPlaylist();
        verifyAddedSongMsg();
        Assert.assertEquals(verifyAddedSongMsg(), expectedAddedSongMsg);
    }

    public String verifyAddedSongMsg() {
        WebElement addedSongMessage = driver.findElement(By.cssSelector("div.success.show"));
        return addedSongMessage.getText();
    }
}
