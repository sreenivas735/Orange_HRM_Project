package Test;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Orange.feature",
        glue = "Test",
        tags = "@loginpage",
        plugin = {"pretty", "html:target/orangehrm.html"}
)
public class TestRunner {
}
