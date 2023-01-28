import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SignIn {
    private WebDriver driver;
    public SignIn(WebDriver driver){
        this.driver = driver;
    }
    By emailButton = By.xpath("(//div/input[@type='text'])[3]");
    By passwordButton = By.xpath("(//div/input[@type='password'])");
    By loginButton = By.cssSelector("div.py-2 button.btn-block");

    public void ScrollDown ()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(loginButton) ) ;

    }
    public void Email(String f){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(emailButton).sendKeys(f);
    }
    public void Password(String f){
        driver.findElement(passwordButton).sendKeys(f);
    }
    public void ClickOnSignIn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(loginButton).click();
    }

}
