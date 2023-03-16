package steps;
import base.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class AddMultipleEmployeesSteps1 extends BaseClass {
    @Given("user navigates to the add employee page")
    public void user_navigates_to_the_add_employee_page() {
        pimPage.navigateToAddEmployee();
    }
    @When("user enters new employee's {string}, {string}, and {string}")
    public void userEntersNewEmployeeSAnd(String firstName, String middleName, String lastName) {
        sendText(addEmployeePage.firstName, firstName);
        sendText(addEmployeePage.middleName, middleName);
        sendText(addEmployeePage.lastName, lastName);
    }
    @When("user clicks on the save button")
    public void user_clicks_on_the_save_button() {
        addEmployeePage.saveButton.click();
    }
    @Then("new employee {string} is added successfully")
    public void new_employee_is_added_successfully(String fullName) {
        Assert.assertEquals("Actual and expected names does NOT matches", fullName, personalDetailsPage.employeeFullName.getText());
    }

    @When("user enters employee's full name and click on save button")
    public void user_enters_employee_s_full_name_and_click_on_save_button(DataTable dataTable) {

      List<Map<String ,String >> mapList = dataTable.asMaps();
       // System.out.println(mapList);
        //mapList.forEach(System.out::println);
        for (Map<String,String> user  :mapList){
            //System.out.println(user.get("FirstName");
            addEmployeePage.firstName.sendKeys(user.get("Firstname"));// Ariana
            addEmployeePage.firstName.sendKeys(user.get("MiddleName"));// A.
            addEmployeePage.firstName.sendKeys(user.get("LastName"));// Knight
            addEmployeePage.saveButton.click();
        }
    }
    @Then("employee is added successfully")
    public void employee_is_added_successfully() {

    }

}
