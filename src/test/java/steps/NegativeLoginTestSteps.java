package steps;

import base.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class NegativeLoginTestSteps extends BaseClass {
    @When("I enter an invalid username andOr password I will see an error message")
    public void i_enter_an_invalid_username_and_or_password_i_will_see_an_error_message(DataTable dataTable) {
        List<Map<String, String>> mapList = dataTable.entries();
        for (Map<String, String> map : mapList) {
            if (map.get("Username") != null) {
                sendText(loginPage.username, map.get("Username"));
            }
            if (map.get("Password") == null) {
                loginPage.password.clear();
            } else {
                sendText(loginPage.password, map.get("Password"));
            }
            click(loginPage.loginBtn);
            wait(1);
            Assert.assertEquals("Login Error Message is Incorrect", map.get("ErrorMessage"), loginPage.loginErrorMessage.getText());
        }
    }
}
