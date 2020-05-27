package BDDBritishAirwaysProject.StepDefinitionPackage;

import BDDBritishAirwaysProject.PageObjectPackage.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Given("^user is on the British Airways Homepage$")
    public void user_is_on_the_British_Airways_Homepage() throws Throwable {
        homePage.homePageAssertion();
    }

    @When("^user click on Book a flight$")
    public void user_click_on_Book_a_flight() throws Throwable {
        homePage.mouceHoover();
    }
    @Then("^user can see departure country option$")
    public void userCanSeeDepartureCountryOption() {
        homePage.britishAirwayFlightAssertion();
    }

    @When("^user click on Discover$")
    public void userClickOnDiscover() throws InterruptedException {
        homePage.clickOnBA();
    }
    @And("^user click on The BA experience$")
    public void userClickOnTheBAExperience() {
    }

    @Then("^user can see more than a flight page$")
    public void userCanSeeMoreThanAFlightPage() {
    homePage.moreThanAflightAssert();
    }


    @And("^user click on usa$")
    public void userClickOnUsa() throws InterruptedException {
        homePage.departureCountry();
    }
}
