package BDDBritishAirwaysProject;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources/Homepage.feature",tags = {"@smoke"})
public class RunCukeTest {
}
//vipul