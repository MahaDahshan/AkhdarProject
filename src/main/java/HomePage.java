import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    By loginButton = By.xpath("(//div/button[contains(text(),'تسجيل الدخول')])[1]");


    By signupButton = By.xpath("//button[contains(text(),'تسجيل')]");


    public SignIn ClickOnLoginButton(){
        driver.findElement(loginButton).click();
       return new SignIn(driver);
    }
    public SignUp ClickOnRegisterButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(signupButton).click();
        return new SignUp(driver);
    }
}
