package BDDBritishAirwaysProject.PageObjectPackage;

import BDDBritishAirwaysProject.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends DriverFactory {
    @FindBy(linkText = "Book")
    WebElement book;

    @FindBy(linkText = "Book a flight")
    WebElement bookaFlight;

    @FindBy(xpath = "//h1[@class='pageTitle']")
    WebElement britishAirwaysflight;

    @FindBy(partialLinkText = "Discov")
    WebElement discoverButton;

    @FindBy(partialLinkText = "The BA experien")
    WebElement theBAExperience;

    @FindBy(xpath ="//h1[@class='pfH1']" )
    WebElement moreThanAFlight;

    @FindBy(id = "depCountry")
    WebElement departCountry;
    public void departureCountry() throws InterruptedException {


        departCountry.click();
        Thread.sleep(2000);
        Select select = new Select(departCountry);
        Thread.sleep(2000);
        select.selectByVisibleText("USA");

    }
    public void clickOnBA() throws InterruptedException {
        discoverButton.click();
        Thread.sleep(3000);
        theBAExperience.click();
    }
    public void moreThanAflightAssert(){
        String actualmoreThanFlight = moreThanAFlight.getText();
        Assert.assertThat(actualmoreThanFlight,Matchers.containsString("THE BRITISH AIRWAYS EXPERIENCE"));

    }

    public void mouceHoover() throws InterruptedException {
        book.click();
        Thread.sleep(3000);
        bookaFlight.click();

    }//mouceHoover method end

    public void homePageAssertion(){
        String actualHomePageURL = driver.getCurrentUrl();
        Assert.assertThat(actualHomePageURL, Matchers.containsString("britishairways"));

    }//homePageAssertion method end

    public void britishAirwayFlightAssertion(){
        String actualFlighPageAssertion = driver.getTitle();
        Assert.assertThat(actualFlighPageAssertion,Matchers.containsString("Flights – Compare & Book – British Airways"));
    }
}
//vipul bhesania