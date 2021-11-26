package RozetkaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RozetkaSignInPage {
    private WebDriver driver;

    public RozetkaSignInPage(WebDriver driver) {
        this.driver = driver;
    }
    By SignInField = By.xpath("//input[@name='login']");
    By PasswordField = By.xpath("//div[@class='auth-f-i']//input[@name='password']");
    By SubmitButton = By.xpath("//button[@name='auth_submit']");

    public void InputData(){
        driver.findElement(SignInField).sendKeys("user211121@mail.ru");
        driver.findElement(PasswordField).sendKeys("TestPassword211121");
        driver.findElement(SubmitButton).click();
    }
}
