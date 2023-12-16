package com.basics;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class screenshot 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.8.0");
        driver.manage().window().maximize();
        TakesScreenshot ts =(TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = "screen.png";
        Files.copy(source.toPath(), new File(destination).toPath());
        
        // Close the browser
        driver.quit();
                    
        };
}
