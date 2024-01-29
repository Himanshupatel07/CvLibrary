package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pages.SearchPage;

public class SearchStep {
    SearchPage searchPage = new SearchPage();

    @Given("User on argos website")
    public void user_on_argos_website() {
        String url = searchPage.getUrl();
        Assert.assertThat(url, Matchers.endsWith("argos.co.uk/"));
    }

    @When("User accept cookies")
    public void user_accept_cookies() {
        searchPage.setCookie();

    }

    @When("User enter {string} in to search box")
    public void user_enter_in_to_search_box(String product) {
        searchPage.setSearchBox(product);
    }

    @When("User click on search bar")
    public void user_click_on_search_bar() {
        searchPage.setSearchBar();
    }

    @Then("User must able to see nike products")
    public void user_must_able_to_see_nike_products() {
        String nike = searchPage.getText();
        Assert.assertThat(nike, Matchers.equalTo("nike"));

    }

    @Then("User must able to see puma products")
    public void user_must_able_to_see_puma_products() {
        String puma = searchPage.getText();
        Assert.assertThat(puma, Matchers.equalTo("puma"));
    }
}