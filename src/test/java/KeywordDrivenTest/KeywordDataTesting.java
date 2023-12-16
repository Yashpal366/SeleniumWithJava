package KeywordDrivenTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KeywordDataTesting {
    @Test
    public static void ChromeTest(){
        KeywordData.openBrowser("chrome");
        KeywordData.navigateTo("https://practicetestautomation.com/practice-test-login/");
        KeywordData.enterText("username", "student");
        KeywordData.enterText("password", "Password123");
        KeywordData.click("submit");
        KeywordData.closeBrowser();
    }
    @Test
    public static void firefoxTest(){
        KeywordData.openBrowser("firefox");
        KeywordData.navigateTo("https://practicetestautomation.com/practice-test-login/");
        KeywordData.enterText("username", "student");
        KeywordData.enterText("password", "Password123");
        KeywordData.click("submit");
        
        String ExpectedTitle ="Logged In Successfully | Practice Test Automation";
        String ActualTitle =KeywordData.getPageTitle();
        System.out.println(ActualTitle);
        Assert.assertEquals(ActualTitle, ExpectedTitle, "Page title doesn't match expected title");

        KeywordData.closeBrowser();
    }
}
