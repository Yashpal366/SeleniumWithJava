package HybridTesting;

import org.openqa.selenium.By;


public class seleniumTest extends BaseTest {

    public void login(String uname, String pword){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.id("username")).sendKeys(uname);
        driver.findElement(By.id("password")).sendKeys(pword);
    }
}
