import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.*;

import java.time.Duration;

public class TestCases {
   private WebDriver driver;
   HomePage homePage;
   SignUp registerPage;
   SignIn loginPage;
   @BeforeMethod
   public void setup(){
      driver = new EdgeDriver();
      driver.get("https://a5dr.com/");
      driver.manage().window().maximize();
      homePage = new HomePage(driver);
   }

   @Test(priority = 0)
   public void RegistrationWithValidData() throws InterruptedException {
      registerPage = homePage.ClickOnRegisterButton();
      registerPage.ScrollDown();
      registerPage.ClickOnSignUp();
      Thread.sleep(3000);
      registerPage.EnterFullname("ranaa");
      registerPage.EnterEmail("maha1816832@miuegypt.edu.eg.com");
      registerPage.EnterPassword("1234mr@");
      registerPage.ClickOnSignUpFinish();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
   }
   @Test(priority = 1)
   public void LoginWithValidData() throws InterruptedException {
     // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
      loginPage = homePage.ClickOnLoginButton();
      loginPage.Email("ayasherifmohamed@gmail.com");
      loginPage.Password("1234mr@");
      WebElement frame =  driver.findElement(By.xpath("//iframe[@aria-hidden='true'  and @title = '_hjSafeContext']"));
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //driver.switchTo().frame(frame);
     // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      loginPage.ScrollDown();
      loginPage.ClickOnSignIn();

     // Thread.sleep(3000);
     // Thread.sleep(3000);
   }

   @AfterMethod
   public void Quit(){

      //driver.quit();
   }
}

