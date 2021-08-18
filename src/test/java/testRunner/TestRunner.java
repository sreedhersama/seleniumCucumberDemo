package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//Sama//IdeaProjects//seleniumCucumber//Features//GreenlotLoginLogo.feature",
        glue = "stepDefinations"
)

public class TestRunner {
}
