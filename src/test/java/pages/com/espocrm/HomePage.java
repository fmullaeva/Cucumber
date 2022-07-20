package pages.com.espocrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "btn-login")
    public WebElement logInButton;
    @FindBy(xpath = "(//ul[@class='n] ")
    public List<WebElement> input;
    @FindBy(xpath = "(//ul[@class='nav navbar-nav tabs']/li/a)[position()<last()] ")
    public List<WebElement> labels;
    @FindBy(xpath = "//a[@class='btn btn-default btn-xs-wide action']")
    public WebElement createAccount;

    @FindBy(xpath = "//input[@data-name='name']")
    public WebElement name;



}
