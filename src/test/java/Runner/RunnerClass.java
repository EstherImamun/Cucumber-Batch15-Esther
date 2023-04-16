package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "Steps",
        dryRun = false,
        tags="@runner1",
        plugin={"pretty"}



)
public class RunnerClass {
}
