package stepdefinitions.Homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class cucumber01Hw2 {
    public static WebDriver driver;
    WebDriverWait wait;
    @Given("I going to the webpage")
    public void i_going_to_the_webpage() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver , Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
    }
    @When("I click on the start button and waite")
    public void i_click_on_the_start_button_and_waite()  {
        driver.findElement(By.id("button00")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button01")));
    }
    @When("I click on the 0ne button and waite")
    public void i_click_on_the_0ne_button_and_waite()  {
        driver.findElement(By.id("button01")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button02")));
    }
    @When("I click on the Two button and waite")
    public void i_click_on_the_two_button_and_waite() {
        driver.findElement(By.id("button02")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button03")));
    }
    @When("I click on the Three button")
    public void i_click_on_the_three_button() {
        driver.findElement(By.id("button03")).click();

    }
    @Then("All Buttons Clicked are shown in the page")
    public void all_buttons_clicked_are_shown_in_the_page() {
        WebElement ms = driver.findElement(By.id("buttonmessage"));
        Assert.assertTrue(ms.isDisplayed());
    }
}
