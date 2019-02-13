import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//Test
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, tags = "@voiture", features = "src/test/java/features", plugin = {
"pretty", "html:target/cucumber" })
public class VoitureInvocationStepDefinitionTest {

}
