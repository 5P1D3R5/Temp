package cucumber_BDD_Tests.pages;

import com.chromatech.automation.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentAdmissionPage {


@FindBy(xpath = "//input[@id='admission_no']")
public WebElement admissionNumberTextBox;

@FindBy(xpath = "//input[@id='firstname']")
public WebElement firstNameTextBox;

@FindBy(xpath = "//input[@id='lastname']")
public WebElement lastNameTextBox;

@FindBy(xpath = "//select[@id='class_id']")
public WebElement classDropDown;

@FindBy(xpath = "//select[@id='section_id']")
public WebElement sectionDropDown;

@FindBy(xpath = "//select[@name='gender']")
public WebElement genderDropDown;

@FindBy(xpath = "//input[@id='dob']")
public WebElement dateOfBirthTextBox;

@FindBy(xpath = "//input[@id='guardian_name']")
public WebElement guardianNameTextBox;

@FindBy(xpath = "//input[@id='guardian_phone']")
public WebElement guardianPhoneNumberTextBox;

public static WebElement dynamicGuardianTypeLocator(String guardianType){
   return WebDriverUtils.driver.findElement(By.xpath("//label[normalize-space()='"+ guardianType + "']"));
}

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);

    }

}
