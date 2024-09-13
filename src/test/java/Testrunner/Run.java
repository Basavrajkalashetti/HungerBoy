package Testrunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="//Features/Loginfeature.feature",
		glue="Stepdef",
        dryRun=true,
        monochrome=true,
        plugin={"pretty"}
		)

public class Run {
	
	// class will be empty.

}
