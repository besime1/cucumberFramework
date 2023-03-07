package steps;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginSteps extends BaseClass {
    @Then("welcome message is displayed in dashboard page")
    public void welcome_message_is_displayed_in_dashboard_page() {
        if(dashboardPage.welcome.isDisplayed()){
            System.out.println("Admin login is successful");
        }
        tearDown();
    }

    @When("user pass the valid username and invalid password")
    public void user_pass_the_valid_username_and_invalid_password() {
        loginPage.loginToWebsite("username","invalidpassword");
    }

    @When("user pass the valid username and empty password")
    public void user_pass_the_valid_username_and_empty_password() {
        loginPage.loginToWebsite("username","emptypassword");
    }

    @Then("login error message is displayed in loginpage")
    public void login_error_message_is_displayed_in_loginpage() {
        //if(loginPage.LoginErrorMessage.isDisplayed()){
           // System.out.println("User login is NOT successfull");


       // }
        String  expectedLoginErrorMsg="Invalid credentials";
        String actualLoginErrorMsg= loginPage.loginErrorMessage.getText();
        Assert.assertEquals("Login Error is Incorrect",expectedLoginErrorMsg, actualLoginErrorMsg);

        Assert.assertEquals("Login Error is Incorrect","Invalid credentials",loginPage.loginErrorMessage.getText());
        tearDown();
    }
}
