package BDDBritishAirwaysProject.BaseClassPackage;

import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();
    @Before //(@Before from Cucumber.api.java)
    public void setup(){
        driverFactory.openBrowser();
    }//setup method finish

    public void teardown(){
        driverFactory.closeBrowser();
    }//teardown method end
}
