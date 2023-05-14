package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;

    By txt_username = By.xpath("//input[@id='user-name']");
    By txt_password = By.xpath("//input[@id='password']");
    By btn_login = By.xpath("//input[@id='login-button']");
    By lbl_UsrNameRequired = By.xpath("//h3[text()='Epic sadface: Username is required']");
    By lbl_UsrNamePassNotMatched = By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']");
    By lbl_PassRequired = By.xpath("//h3[text()='Epic sadface: Password is required']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUserName(){
        driver.findElement(txt_username).sendKeys("standard_user");
    }

    public void enterPassword(){
        driver.findElement(txt_password).sendKeys("secret_sauce");
    }

    public void clickLoginBtn(){
        driver.findElement(btn_login).click();
    }

    public String getLblUsrNameRequired(){
        return driver.findElement(lbl_UsrNameRequired).getText();
    }

    public String getLblPassRequired(){
        return driver.findElement(lbl_PassRequired).getText();
    }

    public String getUsrPassNotMatched(){
        return driver.findElement(lbl_UsrNamePassNotMatched).getText();
    }

}
