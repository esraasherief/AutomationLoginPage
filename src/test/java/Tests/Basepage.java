package Tests;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basepage {

    WebDriver driver;
    LoginPage login ;


    @BeforeMethod
    public void setup(){
        driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();
        login = new LoginPage(driver);
    }

    @AfterMethod
    public void tearout(){
        driver.quit();
    }


}
