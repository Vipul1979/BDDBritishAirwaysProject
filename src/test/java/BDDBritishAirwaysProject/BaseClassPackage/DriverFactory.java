package BDDBritishAirwaysProject.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;
    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }

    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.britishairways.com/en-gb/flights-and-holidays/flights");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }//openBrowser method end
    public void closeBrowser(){
        driver.quit();
    }
}
