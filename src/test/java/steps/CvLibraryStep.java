package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.yecht.Data;
import pages.CvLibraryPage;

public class CvLibraryStep {

    CvLibraryPage cvLibraryPage = new CvLibraryPage();

    @Given("User on Cv Library web page")
    public void user_on_cv_library_web_page() {
        String url = cvLibraryPage.getJobUrl();
        Assert.assertThat(url, Matchers.endsWith("cv-library.co.uk/"));

    }

    @When("User accept cookies on web page")
    public void user_accept_cookies_on_web_page() {
        cvLibraryPage.setCookies();

    }

    @When("User enter {string} on search box")
    public void user_enter_on_search_box(String job) {
        cvLibraryPage.setSearchBox(job);

    }

    @When("User select Location miles")
    public void user_select_location_miles() {
        cvLibraryPage.setLocationViaDropDown();

    }

    @Then("User click on magglass")
    public void user_click_on_magglass() {
        cvLibraryPage.setMagGlass();

    }

    @Then("User should see a list of relevant job posting")
    public void user_should_see_a_list_of_relevant_job_posting() {
        String jobTitle = cvLibraryPage.getJobText();
        Assert.assertThat(jobTitle, Matchers.startsWith("Software Automation jobs"));

    }

    @When("User click on register button")
    public void user_click_on_register_button() {
        cvLibraryPage.setRegisterButton();
    }

    @When("User enters valid email {string} into email box")
    public void user_enters_valid_email_into_email_box(String email) {
        cvLibraryPage.setEmailBox(email);
    }

    @When("User enter {string} into password box")
    public void user_enter_into_password_box(String password) {
        cvLibraryPage.setPasswordBox(password);
    }

    @Then("click on Register button")
    public void click_on_register_button() {
        cvLibraryPage.setConfirmRegisterButton();
    }

    @When("User enter invaild data {string} into search box")
    public void user_enter_invaild_data_into_search_box(String job) {
        cvLibraryPage.setSearchBox(job);

    }

    @When("User click on search button")
    public void user_click_on_search_button() {
        cvLibraryPage.setMagGlass();

    }

    @Then("an error message should be displayed")
    public void an_error_message_should_be_displayed() {
        String displayError = cvLibraryPage.getErrorMessage();
        Assert.assertThat(displayError, Matchers.startsWith("0 jobs found."));

    }

    @When("User enetr a very long job title {string} into searchbox")
    public void user_enetr_a_very_long_job_title_into_searchbox(String job) {
        cvLibraryPage.setSearchBox(job);
    }

    @Then("User should able to see very long job title posting")
    public void user_should_able_to_see_very_long_job_title_posting() {
        String jobTitle = cvLibraryPage.getJobText();
        Assert.assertThat(jobTitle, Matchers.startsWith("Software Automation With Java Expert"));
    }

    @When("the user enters {string} in the search bar")
    public void the_user_enters_in_the_search_bar(String jobTitle) {
        cvLibraryPage.setSearchBox(jobTitle);
    }

    @When("clicks the search button")
    public void clicks_the_search_button() {
        cvLibraryPage.setMagGlass();
    }
    @Then("the user should see a list of job postings")
    public void the_user_should_see_a_list_of_job_postings() {
        String jobTitle = cvLibraryPage.getJobText();
        Assert.assertTrue(jobTitle.contains(jobTitle));




        // System.out.println(jobTitle);

}



}


