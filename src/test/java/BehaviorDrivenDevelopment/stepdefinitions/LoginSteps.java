package BehaviorDrivenDevelopment.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    private WebDriver driver;

    @Given("^user navigates to the login page$")
    public void navigateToLoginPage() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("your_login_page_url");
    }

    @When("^the user enters username \"([^\"]*)\" and password \"([^\"]*)\" in username and password fields$")
    public void enterCredentials(String username, String password) {
        WebElement usernameField = driver.findElement(By.name("username")); // Replace with the actual name attribute
        WebElement passwordField = driver.findElement(By.name("password")); // Replace with the actual name attribute

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    @When("^clicks the login button$")
    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.id("loginButton")); // Replace with the actual ID attribute
        loginButton.click();
    }

    @Then("^the user should be logged in successfully$")
    public void verifyLoginSuccess() {
        // Assuming there is some element on the page that indicates successful login
        WebElement successMessage = driver.findElement(By.id("successMessage")); // Replace with the actual ID attribute
        assertEquals("Login successful", successMessage.getText());
    }

    @Then("^close the browser$")
    public void closeBrowser() {
        driver.quit();
    }
}
