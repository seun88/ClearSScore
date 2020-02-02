package co.uk.ClearScore.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    WebDriver driver;

    @Given("i navigate to clearscore web")
    public void i_navigate_to_clearscore_web() {
       driver = new ChromeDriver();
       driver.navigate().to("https://app.clearscore.com/login");
    }

    @Given("input {string}")
    public void input(String string) {

    }

    @When("i click login button")
    public void i_click_login_button() {

    }

    @Then("i am logged in")
    public void i_am_logged_in() {

    }

}
