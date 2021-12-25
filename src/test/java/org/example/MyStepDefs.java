package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    WelcomePage welcomePage = new WelcomePage();
    LoadProp loadProp = new LoadProp();
    Pim pim = new Pim();
    AddEmployee addEmployee = new AddEmployee();
    EmployeeList employeeList = new EmployeeList();

    @Given("user is in Loging Page")
    public void user_is_in_loging_page() {

    }

    @When("user Enter DefaultUserId And Password.")
    public void user_enter_default_user_id_and_password() {
        homePage.UserCanAbleToLogingWIthDefultUserNameAndPassword();

    }

    @When("user can able to log in")
    public void user_can_able_to_log_in() {
        welcomePage.MainPage();

    }

    @When("user Click on the PIM category")
    public void user_click_on_the_pim_category() {

    }

    @When("user click on the Employee list")
    public void user_click_on_the_employee_list() {

    }

    @When("user enter Emloyee Name on EmployeeName search bar")
    public void user_enter_emloyee_name_on_employee_name_search_bar() {
        pim.userEnterEmployeeName();

    }

    @When("user click on search button")
    public void user_click_on_search_button() {

    }

    @When("user select name from the list")
    public void user_select_name_from_the_list() {

    }

    @When("user click on Delete Button")
    public void user_click_on_delete_button() {

    }

    @When("user click ok on the alartbox to confirm the delete action")
    public void user_click_ok_on_the_alartbox_to_confirm_the_delete_action() {

    }

    @Then("I should be able to verify that Employee Record successfully deleted")
    public void i_should_be_able_to_verify_that_employee_record_successfully_deleted() {
        pim.userNoRecordFound();

    }
    @Given("user is in login screen")
    public void user_is_in_login_screen() {

    }

    @When("User Enter DefultUserId And Password On Login Page")
    public void user_enter_defult_user_id_and_password_on_login_page() {
        homePage.UserCanAbleToLogingWIthDefultUserNameAndPassword();


    }

    @Then("user can Able to Log in And Come To dashboard page")
    public void user_can_able_to_log_in_and_come_to_dashboard_page() {
        welcomePage.MainPage();

    }

    @Then("user click on PIM category")
    public void user_click_on_pim_category() {
        pim.userClickOnPimFromWelcomePage();

    }

    @Then("User Click on Add Empolyee Details Page")
    public void user_click_on_add_empolyee_details_page() {

    }

    @Then("user Enter All Empolyee Details")
    public void user_enter_all_empolyee_details() {
        addEmployee.userCanAddEmployeeDetails();

    }

    @Then("click on save Button")
    public void click_on_save_button() {

    }

    @Then("user come to Empolyee Details Profile page")
    public void user_come_to_empolyee_details_profile_page() {
        employeeList.userAtEmployeeList();

    }

    @Then("user click on Welcome")
    public void user_click_on_welcome() {

    }

    @Then("from welcome user can able log out")
    public void from_welcome_user_can_able_log_out() {

    }

    @Then("user come back to lOGIN page")
    public void user_come_back_to_l_ogin_page() {
        homePage.userEnterValidCredentialsInLogInPage();

    }

    @When("user Enter Valid User id And Password")
    public void user_enter_valid_user_id_and_password() {

    }

    @Then("User Should able To loging Successfully")
    public void user_should_able_to_loging_successfully() {
        welcomePage.userAtWelcomePage();

    }
}