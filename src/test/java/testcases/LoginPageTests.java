package testcases;

import functions.LoginPageFunctions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InventoryPage;
import resources.BaseClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPageTests extends BaseClass {
    WebDriver driver;
    LoginPageFunctions lpf;
    InventoryPage ip;
    public static Logger log = LogManager.getLogger(LoginPageTests.class);


    @BeforeMethod
    public void initialize(){
        driver = initializeDriver();
        log4jConfigPathSetup();
    }

    @Test(priority = 0)
    public void checkLoginSuccessful(){
        lpf = new LoginPageFunctions(driver);
        lpf.loginToPortal();
        ip = new InventoryPage(driver);
        log.info("TC001: check login successful");
        Assert.assertEquals(ip.getInventoryPgeLabel(),"Products"," User did not logged in to the system");
    }

    @Test(priority=1)
    public void checkPasswordRequiredMessage(){
        lpf = new LoginPageFunctions(driver);
        lpf.loginToPortalWithOutPass();
        log.info("TC002: check password required message");
        Assert.assertEquals(lpf.getPassRequired(),"Epic sadface: Password is required","Password required message not visible");
    }

    @Test(priority = 2)
    public void checkUserNameRequiredMessage(){
        lpf = new LoginPageFunctions(driver);
        lpf.loginToPortalWithOutUsrNm();
        log.info("TC002: check Username required message");
        Assert.assertEquals(lpf.getUsrNameRequired(),"Epic sadface: Username is required","Username required message not visible");
    }




    @AfterMethod
    public void tearDown(){
        driver.close();
    }


}
