package cucumber_BDD_Tests.stepDefinitions;

import com.chromatech.automation.utils.CommonMethods;
import com.chromatech.automation.utils.CucumberLogUtils;
import com.chromatech.automation.utils.WebDriverUtils;
import cucumber_BDD_Tests.pages.DashboardPage;
import cucumber_BDD_Tests.pages.LoginPage;
import cucumber_BDD_Tests.pages.StudentAdmissionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import javax.swing.*;

import static com.chromatech.automation.utils.WebDriverUtils.driver;

public class All_Steps {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();

    @Given("a CTSMS user is on the login page {string}")
    public void a_ctsms_user_is_on_the_login_page(String url) {
        driver.get(url);
        CucumberLogUtils.logScreenShot();
    }

    @When("the user enters username {string} in username text box")
    public void the_user_enters_username_in_username_text_box(String username) {
        CucumberLogUtils.scenario.log("* * * * LOGGING IN WITH ADMIN CREDENTIALS * * * *");
        loginPage.usernameTextbox.sendKeys(username);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters password {string} in password text box")
    public void enters_password_in_password_text_box(String password) {
        loginPage.passwordTextBox.sendKeys(password);
    }

    @When("clicks on the Sign In button")
    public void clicks_on_the_sign_in_button() {
        loginPage.signInButton.click();
    }

    @Then("the user is navigated to the dashboard page {string}")
    public void the_user_is_navigated_to_the_dashboard_page(String expectedURL) {
        Assert.assertEquals(WebDriverUtils.driver.getCurrentUrl(), expectedURL);
    }

    @When("the user clicks on Student Information module")
    public void the_user_clicks_on_student_information_module() {
        dashboardPage.studentInformationModule.click();
    }

    @When("clicks on Student Admissions subModule")
    public void clicks_on_student_admissions_sub_module() {
        dashboardPage.studentAdmissionSubModule.click();
    }

    @When("enters Admission Number {string} in Admission No text box")
    public void enters_admission_number_in_admission_no_text_box(String admissionNumber) {
        studentAdmissionPage.admissionNumberTextBox.sendKeys(admissionNumber);
    }

    @When("enters first name {string} in first name text box")
    public void enters_first_name_in_first_name_text_box(String firstName) {
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
    }

    @When("enters last name {string} in last name text box")
    public void enters_last_name_in_last_name_text_box(String lastName) {
        studentAdmissionPage.lastNameTextBox.sendKeys(lastName);
    }

    @When("selects {string} for Class drop down")
    public void selects_for_class_drop_down(String option) {
        CommonMethods.selectValueByVisibleText(studentAdmissionPage.classDropDown, option);
    }

    @When("select {string} for Section drop down")
    public void select_for_section_drop_down(String option) {
        CommonMethods.selectValueByVisibleText(studentAdmissionPage.sectionDropDown, option);
    }

    @When("selects {string} for Section drop down")
    public void selects_for_section_drop_down(String option) {
        CommonMethods.selectValueByVisibleText(studentAdmissionPage.sectionDropDown, option);
    }

    @When("selects {string} for gender drop down")
    public void selects_for_gender_drop_down(String option) {
        CommonMethods.selectValueByVisibleText(studentAdmissionPage.genderDropDown, option);
    }

    @When("selects Date of Birth {string}")
    public void selects_date_of_birth(String date) {
        CommonMethods.selectDateByJS(studentAdmissionPage.dateOfBirthTextBox, date);
    }

    @When("selects {string} for Guardian")
    public void selects_for_guardian(String guardianType) {
        studentAdmissionPage.dynamicGuardianTypeLocator(guardianType).click();

    }

    @When("enters guardian name {string}")
    public void enters_guardian_name(String guardianName) {
        studentAdmissionPage.guardianNameTextBox.sendKeys(guardianName);
    }
    @When("enters guardian phone number {string}")
    public void enters_guardian_phone_number(String guardianPhoneNumber) {
        studentAdmissionPage.guardianPhoneNumberTextBox.sendKeys(guardianPhoneNumber);
        CommonMethods.sleep(2000);
    }
//

}