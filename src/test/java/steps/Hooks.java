package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static utils.Driver.getDriver;

public class Hooks {
    WebDriver driver;
    @Before
    public void setUp(Scenario scenario){
        driver = getDriver("chrome");
        System.out.println(scenario.getName() +" starting");
    }
    @After()
    public void tearDown(Scenario scenario){
        System.out.println(scenario.getName()+" finished");
        // driver.close();
    }

}
