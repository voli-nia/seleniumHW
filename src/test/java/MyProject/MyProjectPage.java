package MyProject;

import Settings.SettingsForMyProject;
import org.openqa.selenium.*;


public class MyProjectPage extends SettingsForMyProject {
    protected WebDriver driver;

    public MyProjectPage (WebDriver driver) {
        this.driver = driver;
    }
    By loadingLink = By.linkText("https://voli-nia.github.io/HTML-project/");

    public void LoadingLink() {
        driver.findElement(loadingLink).click();
    }

    public void PageNavigation() {
        driver.findElement(By.xpath("//a[normalize-space()='1. QA Testing']")).click();
    }

    public void DropDownMenu() {
        driver.findElement(By.cssSelector("button.mainmenubtn")).click();
    }

    public void LinkOne() {
        driver.findElement(By.xpath("//a[normalize-space()='Manual testing']")).click();
    }

    public void BackNavigation() {
        WebDriver.Navigation navigation = driver.navigate();
        driver.navigate().back();
        driver.findElement(By.cssSelector("button.mainmenubtn")).click();
    }

    public void LinkTwo() {
        driver.findElement(By.xpath("//a[normalize-space()='SQL']")).click();
    }


    public void LinkThree() {
        driver.findElement(By.xpath("//a[normalize-space()='HTML, CSS']")).click();
    }
}
