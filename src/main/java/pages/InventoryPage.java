package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    WebDriver driver;
    By lbl_Products = By.xpath("//span[text()='Products']");

    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }

    public String getInventoryPgeLabel(){
        return driver.findElement(lbl_Products).getText();
    }


}
