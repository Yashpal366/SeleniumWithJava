package DataDrivenTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;


public class DataDrivenTesting {

    WebDriver driver;
    @Test(dataProvider = "getData")
    public void Logintest(String username, String Password){
        try{
            driver = new ChromeDriver();
            driver.get("https://practicetestautomation.com/practice-test-login/");
            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(Password);
            driver.findElement(By.id("submit")).click();
            String ExpectedTitle = "Logged In Successfully | Practice Test Automation";
            String ActualTitle = driver.getTitle();
            Assert.assertEquals(ActualTitle, ExpectedTitle, "Page title doesn't match expected title");
        } finally{
            if (driver != null) {
            driver.quit();
            };
        };
    }

    // @DataProvider
    // public Object[][] getData(){
    //     return new Object[][]{
    //         {"student","Password123"},
    //         {"student","pass"},
    //         {"user","Password123"},
    //     };
    // }
    @DataProvider
    public Object[][] getData() {
        List<String[]> data = readDataFromCSV("C:\\Users\\dell\\Desktop\\java\\basics\\src\\test\\java\\resources\\loginData.csv");

        Object[][] dataArray = new Object[data.size()][2];
        for (int i = 0; i < data.size(); i++) {
            dataArray[i] = data.get(i);
        }

        return dataArray;
    }

    private List<String[]> readDataFromCSV(String filePath) {
        List<String[]> records = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            records = csvReader.readAll();
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return records;
    }
}


