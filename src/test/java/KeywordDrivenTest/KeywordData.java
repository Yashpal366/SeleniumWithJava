package KeywordDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeywordData {
    private static WebDriver driver;
    
    public static void openBrowser(String browserType){
        if (browserType.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if(browserType.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else{
            System.out.println("browserType not specified");
        }
    }

    public static void navigateTo(String url){
            driver.get(url);
    }

    public static void enterText(String locator, String text){
        driver.findElement(By.id(locator)).sendKeys(text);
    }

     public static void click(String locator ){
        driver.findElement(By.id(locator)).click();
    }

    public static String getPageTitle(){
        return driver.getTitle();
    }
    
    public static void closeBrowser(){
        driver.close();
    }





}
