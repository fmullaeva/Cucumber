package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.com.espocrm.HomePage;
import utils.ConfigReader;
import utils.Driver;
import utils.ElementUtils;
import utils.JSExecutorUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static utils.Driver.getReference;
import static utils.ElementUtils.elementClickable;

public class HomePageStep {
    HomePage homePage;
    WebDriver driver = Driver.getDriver("chrome");

    @Given("user is on espoCRM")
        public void userIsOnEspoCRM () {
            driver = getReference();
            homePage = new HomePage(driver);
            driver.get(ConfigReader.getProperty("espoCRMUrl"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

    @When("user logs in to HomePage")
    public void userLogsInToHomePage() {
        homePage.logInButton.click();
        JSExecutorUtils.jsClick(driver,homePage.logInButton);


    }

    @Then("user validates menu labels")
    public void userValidatesMenuLabels(List<String> table)
     {
         Assert.assertEquals(table,ElementUtils.getTexts(homePage.labels));

    }



    @When("the user open the Accounts")
    public void theUserOpenTheAccounts() {
        for (WebElement tab:homePage.labels){
            System.out.println(tab.getText());
            if (tab.getText().equalsIgnoreCase("Accounts")){
                tab.click();
            }
        }
    }

    @And("the user clicks the Create Account button")
    public void theUserClicksTheCreateAccountButton() {
            homePage.createAccount.click();
    }

    @And("the user fills name as {string}")
    public void theUserFillsNameAs(String arg0) {
        homePage.name.sendKeys(arg0);
    }
}