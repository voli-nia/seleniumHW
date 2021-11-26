package Tests;

import RozetkaPages.RozetkaMainPage;
import RozetkaPages.RozetkaSignInPage;
import Settings.SettingsForRozetka;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRozetka extends SettingsForRozetka {
    @Test
    public void LogIn() throws InterruptedException {
        RozetkaMainPage rozetkaMainPage = new RozetkaMainPage(driver);
        RozetkaSignInPage rozetkaSignInPage = new RozetkaSignInPage(driver);
        rozetkaMainPage.LoadingLink();
        Thread.sleep(1000);

        rozetkaSignInPage.InputData();
        assertEquals("https://my.rozetka.md/signin/", driver.getCurrentUrl());
        System.out.println("Test passed successfully");

    }
}
