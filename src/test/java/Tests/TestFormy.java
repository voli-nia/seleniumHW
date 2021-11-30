package Tests;

import FormyProject.FormyMainPage;
import Settings.SettingsForFormyProject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFormy extends SettingsForFormyProject {
    @Test
    public void Navigation() throws InterruptedException {
        driver.manage().window().maximize();
        FormyMainPage formyMainPage = new FormyMainPage(driver);
        assertEquals("https://formy-project.herokuapp.com/", driver.getCurrentUrl());
        System.out.println("Main page has loaded correctly");

        formyMainPage.ButtonPage();
        Thread.sleep(1000);
        assertEquals("https://formy-project.herokuapp.com/buttons", driver.getCurrentUrl());
        System.out.println("Button page has loaded correctly");
    }
}
