package stepdefinitions.Homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class cucumber01Hw1 {

    WebDriver driver;

    @Given("user goes to google page")
    public void user_goes_to_google_page() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("user search for {string}")
    public void user_search_for(String string) {
        driver.findElement(By.name("q")).sendKeys(string+ Keys.ENTER);
    }
    @Then("test the page title contains the word {string}")
    public void test_the_page_title_contains_the_word(String string) {
       driver.getTitle();
        System.out.println("string = " + string);
    }
    @Then("close the page")
    public void close_the_page() {
        driver.close();
    }


}
