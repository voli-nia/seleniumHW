package FormyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormyMainPage {
    private WebDriver driver;

    public FormyMainPage(WebDriver driver) {
        this.driver = driver;
    }
    By loadLink = By.linkText("https://formy-project.herokuapp.com/");

    public void LoadLink() {
        driver.findElement(loadLink).click();
    }

    public void ButtonPage() {
        driver.findElement(By.xpath("//a[@class='btn btn-lg'][normalize-space()='Buttons']"));
        driver.findElement(By.xpath("//button[normalize-space()='Info']"));

    }

}
