package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginPage {

    WebDriver driver;

    @Given("I launch the browser")
    public void i_launch_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("I enter my valid username and password")
    public void i_enter_my_valid_username_and_password() throws InterruptedException {
        Thread.sleep(3000);
         driver.findElement(By.id("txtUsername")).sendKeys("Admin");
         driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    }

    @And("I click on login button")
    public void i_click_on_login_button() {
         driver.findElement(By.id("btnLogin")).click();
    }

    @Then("I should be able to login into website")
    public void i_should_be_able_to_login_into_website() throws InterruptedException {
        Thread.sleep(4000);
         boolean status= driver.findElement(By.xpath("//div[@class='head']/h1")).isDisplayed();
        Assert.assertTrue(status);
    }

    @And("close browser")
    public void close_browser() {
         driver.quit();
    }

}
