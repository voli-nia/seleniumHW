package Tests;

import MyProject.MyProjectPage;
import Settings.SettingsForMyProject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyProjectTest extends SettingsForMyProject {
    @Test
    public void Navigation() throws InterruptedException {
        driver.manage().window().maximize();
        MyProjectPage myProjectPage = new MyProjectPage(driver);
        assertEquals("https://voli-nia.github.io/HTML-project/", driver.getCurrentUrl());
        System.out.println("Main page loaded correctly");

        myProjectPage.PageNavigation();
        Thread.sleep(1000);
        assertEquals("https://voli-nia.github.io/HTML-project/page_1.html", driver.getCurrentUrl());
        System.out.println("First page loaded correctly");

        myProjectPage.DropDownMenu();
        Thread.sleep(1000);

        myProjectPage.LinkOne();
        Thread.sleep(1000);
        assertEquals("https://voli-nia.github.io/HTML-project/page_2.html", driver.getCurrentUrl());
        System.out.println("Second page loaded correctly");

        myProjectPage.BackNavigation();
        Thread.sleep(1000);

        myProjectPage.DropDownMenu();
        Thread.sleep(1000);

        myProjectPage.LinkTwo();
        Thread.sleep(1000);
        assertEquals("https://voli-nia.github.io/HTML-project/page_3.html", driver.getCurrentUrl());
        System.out.println("Third page loaded correctly");

        myProjectPage.BackNavigation();
        Thread.sleep(1000);

        myProjectPage.LinkThree();
        Thread.sleep(1000);
        assertEquals("https://voli-nia.github.io/HTML-project/page_4.html", driver.getCurrentUrl());
        System.out.println("Fourth page loaded correctly");
        System.out.println("Test passed successfully");
    }
}
