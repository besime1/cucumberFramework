package pages;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage extends BaseClass {
    @FindBy(id="empsearch_id")
    public WebElement employeeIdSearchField;
    /*

     */
    @FindBy(id="empsearch_employee_name_empName")
    public WebElement employeeNameSearchField;

    @FindBy(id="searchBtn")
    public WebElement empListSearchButton;

    public  void searchEmployeeById(String empID){
        employeeIdSearchField.sendKeys(empID);
    }
    public  void searchEmployeeByName(String empName){
        employeeIdSearchField.sendKeys(empName);
    }

    public EmployeeListPage() {
        PageFactory.initElements(driver, this);
    }

}
