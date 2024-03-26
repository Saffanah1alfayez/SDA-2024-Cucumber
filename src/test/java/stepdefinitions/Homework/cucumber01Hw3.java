package stepdefinitions.Homework;

import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class cucumber01Hw3 {

    /*
Go to https://testpages.eviltester.com/styled/validation/input-validation.html
Fill form and submit
Do this with 3 scenarios
Use background and scenario outline
 */
    WebDriver driver;
    @Given("User go to the page")
    public void user_go_to_the_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
    }
    @When("User enter {string} as a first name")
    public void user_enter_as_a_first_name(String firstName) {
        driver.findElement(By.id("firstname")).sendKeys(firstName);

    }
    @When("User enter {string} as  last name")
    public void user_enter_as_last_name(String lastName) {
        driver.findElement(By.id("surname")).sendKeys(lastName);


    }
    @When("User enter {string} as age")
    public void user_enter_as_age(String age) {
        driver.findElement(By.id("age")).sendKeys(age);

    }
    @When("User select country {string}")
    public void user_select_country(String country) {
        WebElement countrySelect = driver.findElement(By.id("country"));
        Select select = new Select(countrySelect);
        select.selectByVisibleText(country);

    }
    @When("User write {string} as note")
    public void user_write_as_note(String note) {
        driver.findElement(By.id("notes")).sendKeys(note);
    }
    @Then("User click submit")
    public void user_click_submit() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

}
