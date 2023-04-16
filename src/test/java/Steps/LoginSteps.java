package Steps;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSteps extends CommonMethods {
    @Given("the user navigates to the url")
    public void the_user_navigates_to_the_url() {
       openBrowserAndLaunchApplication();

    }
    @When("user enters a valid email and password")
    public void user_enters_a_valid_email_and_password() {
       // WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
      //  WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        sendText(login.usernameTextBox, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordTextBox,ConfigReader.getPropertyValue("password"));
        // this method can also be used but you need to write another code to clear the text box first
        // before sending the keys or before sending text. which is why the first approach is better
       // passwordTextBox.sendKeys(ConfigReader.getPropertyValue("password"));

    }
    @When("clicks on Login Button")
    public void clicks_on_login_button() {
       // WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        doClick(login.loginBtn);

    }
    @Then("the user is logged in")
    public void the_user_is_logged_in() {

        // assertion that you are logged in
        System.out.println("logged in");

    }

    @When("user enters a valid email {string} and password {string}")
    public void user_enters_a_valid_email_and_password(String username, String password) {
       // WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
       // WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        sendText(login.usernameTextBox,username);
        sendText(login.passwordTextBox,password);

    }
    @When("user enters a username {string} and password {string}")
    public void user_enters_a_username_and_password(String username, String password) {
      //  WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
      //  WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        sendText(login.usernameTextBox,username);
        sendText(login.passwordTextBox,password);


    }
    @Then("the user is not logged in")
    public void the_user_is_not_logged_in() {
        System.out.println("the user is not logged in");

    }

    @When("user enters the {string} and {string}")
    public void user_enters_the_and(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }
    @Then("user see a message {string}")
    public void user_see_a_message(String errorMsg) {
        System.out.println(errorMsg);
    }




}
