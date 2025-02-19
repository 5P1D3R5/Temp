package cucumber_BDD_Tests.pages;

import com.chromatech.automation.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage {
@FindBy(xpath = "//input[@placeholder='Username']")
public WebElement usernameTextbox;

@FindBy(xpath = "//input[@placeholder='Password']")
public WebElement passwordTextBox;

@FindBy(xpath = "//button[normalize-space()='Sign In']")
public WebElement signInButton;



public LoginPage() {
    PageFactory.initElements(WebDriverUtils.driver, this);

}

}
