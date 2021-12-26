package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    LoginPage homePage = new LoginPage();
    Dashboard dashboard = new Dashboard();
    EmployeeInformation employeeInformation = new EmployeeInformation();
    AddEmployee addEmployee = new AddEmployee();
    MyProfile myProfile = new MyProfile();
    EmployeeList employeeList= new EmployeeList();

    @Given("I am on login page")
    public void i_am_on_login_page() {
        homePage.userShouldAbleToLoginWithValidUserNameAndPassword();
    }

    @When("I enters valid username and valid password")
    public void i_enters_valid_username_and_valid_password() {

    }

    @When("click on login button")
    public void click_on_login_button() {

    }

    @Then("I should able to login successfully")
    public void i_should_able_to_login_successfully() {

    }

    @When("I click on PIM in  main menu bar")
    public void i_click_on_pim_in_main_menu_bar() {

        dashboard.UserCanAbleToClickPIMCategoryFromMainMenu();
    }

    @When("click on add employee")
    public void click_on_add_employee() {
        employeeInformation.userShouldAbleToAddEmployee();
    }

    @When("I fill all require details")
    public void i_fill_all_require_details() {
        addEmployee.userShouldAbleToFillRequireDetails();
    }

    @When("click on save button")
    public void click_on_save_button() {

    }

    @Then("I can see employee details in personal details page")
    public void i_can_see_employee_details_in_personal_details_page() {
        myProfile.userShouldAbleToViewProfile();

    }
    @When("I click on welcome button in main menu bar")
    public void i_click_on_welcome_button_in_main_menu_bar() {

    }
    @When("click on Logout")
    public void click_on_logout() {

    }
    @Then("I can see Login page")
    public void i_can_see_login_page() {

    }
    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() {
        homePage.userEnterValidCradentials();
    }
    @Then("I can see dashboard page")
    public void i_can_see_dashboard_page() {
        dashboard.userAtWelcomePage();
    }
    @Given("user is on login Page")
    public void user_is_on_login_page() {
        homePage.userShouldAbleToLoginWithValidUserNameAndPassword();
    }
    @When("user enter username and password")
    public void user_enter_username_and_password() {

    }
    @When("able to successfully login")
    public void able_to_successfully_login() {
        dashboard.UserCanAbleToClickPIMCategoryFromMainMenu();
    }
    @When("I Click on the PIM from category")
    public void i_click_on_the_pim_from_category() {

    }
    @When("click on the employee list")
    public void click_on_the_employee_list() {
        employeeList.userShouldBeAbleToSeeEmployeeList();
    }
    @When("I enter employee name in employee name text box")
    public void i_enter_employee_name_in_employee_name_text_box() {

    }
    @When("click on search button")
    public void click_on_search_button() {

    }
    @When("I select employee name from the list")
    public void i_select_employee_name_from_the_list() {

    }
    @When("click on delete Button")
    public void click_on_delete_button() {

    }
    @When("I click ok of the alert box to confirm the delete name")
    public void i_click_ok_of_the_alert_box_to_confirm_the_delete_name() {

    }
    @Then("I should be able to verify that Employee record has been successfully deleted")
    public void i_should_be_able_to_verify_that_employee_record_has_been_successfully_deleted() {
        employeeList.userNoRecordFound();
    }
}
