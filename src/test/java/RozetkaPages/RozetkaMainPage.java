package RozetkaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RozetkaMainPage {
    private WebDriver driver;

    public RozetkaMainPage(WebDriver driver) {
        this.driver = driver;
    }
    By LoadingLink = By.xpath("//a[@name='signin']");

    public void LoadingLink() {
        driver.findElement(LoadingLink).click();
    }
}
