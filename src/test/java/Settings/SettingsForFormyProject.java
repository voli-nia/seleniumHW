package Settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SettingsForFormyProject {
    protected WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Valea\\IdeaProjects\\seleniumHW\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://voli-nia.github.io/HTML-project/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
