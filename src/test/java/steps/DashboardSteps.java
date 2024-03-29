package steps;

import base.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
/**
 * As of Cucumber 7.0 and later asList(), asLists(), and asMaps() have changed:
 * Replace DataTable.asList() with -> DataTable.values()
 * Replace DataTable.asLists() with -> DataTable.cells()
 * Replace DataTable.asMaps() with -> DataTable.entries()
 */

import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.menu;

public class DashboardSteps extends BaseClass {
    @Then("user should see dashboard menu displayed")
    public void user_should_see_dashboard_menu_displayed(DataTable menu) {
        List<String> expectedAdminMenu=menu.values();
        List<String> actualAdminMenu=new ArrayList<>();
        for(int i=0;i<dashboardPage.mainMenu.size(); i++){
           actualAdminMenu.add(dashboardPage.mainMenu.get(i).getText());
        }
        //2.way
//        for (WebElement mainMenu:dashboardPage.mainMenu){
//            actualAdminMenu.add(mainMenu.getText());
//        }
        Assert.assertEquals("Menus do not match",expectedAdminMenu,actualAdminMenu);
        System.out.println("Expected Admin Menu ==> " + expectedAdminMenu);
        System.out.println("Actual Admin Menu ==> " + actualAdminMenu);


    }
}
