package resources;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.core.config.Configurator;

public class BaseClass {
    WebDriver driver;

    String url = "https://www.saucedemo.com/";
    //Initialize the driver
    public WebDriver initializeDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        return driver;
    }

    //setting up log4j configuration file location
    public void log4jConfigPathSetup() {
        Configurator.initialize(null,System.getProperty("user.dir")+"/src/main/java/resources/log4j2.xml");
    }
}
