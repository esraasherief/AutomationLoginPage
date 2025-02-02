package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

      WebDriver driver ;
      WebDriverWait wait ;


    private By usernameField = By.name("username");
    private By passwordField = By.id("password");
    By radiobtn = By.xpath("//*[@value='user']");
    By okaybtn = By.xpath("//*[text()='Okay']");
    By droplist = By.xpath("//*[@data-style='btn-info']");
    By termsCheckbox = By.cssSelector("[id='terms']");
    By signinbtn = By.xpath("//*[@value='Sign In']");
    By infotext = By.xpath("//*[@class='text-center text-white']");



    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait=  new WebDriverWait(driver, Duration.ofSeconds(20));
    }


    public String[] extractLoginCredentials() {
        String text = driver.findElement(infotext).getText();
        String[] parts = text.replace("(", "").replace(")", "").split(" and ");
        String username = parts[0].split(" ")[2];
        String password = parts[1].split(" ")[2];
        return new String[]{username, password};
    }



    public void Username (String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void Password (String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public  void radiobttn(){
        driver.findElement(radiobtn).click();
    }
    public void Okmessg(){
       wait.until(ExpectedConditions.elementToBeClickable(okaybtn));
       driver.findElement(okaybtn).click();
    }



    public void dropdownlist(){
     wait.until(ExpectedConditions.elementToBeClickable(droplist));
        WebElement list = driver.findElement(droplist);
        Select select = new Select(list);
        select.selectByVisibleText("Teacher");
    }

    public  void termschekbox(){
        driver.findElement(termsCheckbox).click();
    }

    public void signin(){
        driver.findElement(signinbtn).click();
    }



}
