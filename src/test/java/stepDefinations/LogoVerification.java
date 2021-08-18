package stepDefinations;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoVerification {

    WebDriver driver;

    @Given("Open Browser")
    public void open_Browser() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Sama//Documents//webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("Logging into Application")
    public void logging_into_Application() {
        driver.get("https://greenlots.com/");


    }

    @Then("Verify the Greenlot Logo")
    public void verify_the_Greenlot_Logo() {

        boolean status = driver.findElement(By.xpath("//a[contains(text(),'Greenlots')]")).isDisplayed();
        Assert.assertEquals(true, status);

    }

    @Then("Close browser")
    public void close_browser() {
        driver.quit();

    }

}
