package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",// Specifiy path from Content Root,features option will establish connection with features file(s).
        glue = "steps" //specify path from Source Root, glue will establish connection with step defitions.
)





public class TestRunner {
    //path for my feature files
    //path for my step definitions
    //@smoke,@regression
    //run only login.feature
}

