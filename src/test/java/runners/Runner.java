package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepdefinitions" ,
        features = "src/test/resources/features/secnarioOutline.feature",
        //tags = "@samsung",
        //tag = "@samsung" if i want by tag
        dryRun = false
)
public class Runner {

}
