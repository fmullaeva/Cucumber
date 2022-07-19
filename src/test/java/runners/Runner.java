package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.espoCRM"
        ,glue = "steps"
        , tags = ""
        ,dryRun= false
        ,snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Runner {

}
