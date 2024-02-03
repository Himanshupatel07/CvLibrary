import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\CvLibrary.feature",
        tags="@Smoke",
        glue={"steps","hook"},
        plugin = {"pretty","json:target/cucumber-reports/reports.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports/reports2.html"}
)
//push Krutika's code


public class Runner {
}
