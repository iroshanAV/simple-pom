package functions;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginPageFunctions {
    WebDriver driver;
    LoginPage lp;

    public LoginPageFunctions(WebDriver driver){
        this.driver = driver;
    }

    public void loginToPortal(){
        lp = new LoginPage(driver);
        lp.enterUserName();
        lp.enterPassword();
        lp.clickLoginBtn();
    }

    public void loginToPortalWithOutPass(){
        lp = new LoginPage(driver);
        lp.enterUserName();
        lp.clickLoginBtn();
    }

    public void loginToPortalWithOutUsrNm(){
        lp = new LoginPage(driver);
        lp.enterPassword();
        lp.clickLoginBtn();
    }

    public void loginToPortalUsrPassNotMatched(){
        lp = new LoginPage(driver);
        lp.enterUserName();
        lp.enterPassword();
    }



    public String getUsrNameRequired(){
        return lp.getLblUsrNameRequired();
    }

    public String getPassRequired(){
        return lp.getLblPassRequired();
    }

    public String getUsrPassNotMatched(){
        return lp.getUsrPassNotMatched();
    }



}
