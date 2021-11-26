package RozetkaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RozetkaPageAuthorization {
    private WebDriver driver;

    public RozetkaPageAuthorization(WebDriver driver) {
        this.driver = driver;
    }
    By UserNameBtn = By.xpath("//a[@name='profile']");
    By SignOutBtn = By.xpath("//a[@name='signout']");

    public void LogOut() {
        driver.findElement(UserNameBtn).click();
        driver.findElement(SignOutBtn).click();
    }
}
