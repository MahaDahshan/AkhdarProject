import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SignUp {
    private WebDriver driver;

    By fullname = By.xpath("//section /label /div /input[@type='text']");
    By email = By.xpath("//div /input[@type='email']");
    By password = By.xpath("//div /input[@type='password']");
    By signup = By.xpath("//span [contains(text(),'انشاء حساب')]");
    By signupFinish = By.xpath("//button [contains(text(),'سجل الان')]");

    public SignUp(WebDriver driver){
        this.driver = driver;
    }

    public void ScrollDown ()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
         ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(signup) ) ;

    }

    public void EnterFullname(String f){
        driver.findElement(fullname).sendKeys(f);
    }
    public void EnterEmail(String f){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(email).sendKeys(f);
    }
    public void EnterPassword(String f){
        driver.findElement(password).sendKeys(f);
    }
    public void ClickOnSignUp(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(signup).click();
    }
    public void ClickOnSignUpFinish(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(signupFinish).click();
    }

}
