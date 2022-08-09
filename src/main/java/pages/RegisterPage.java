package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import data.TestBase;

public class RegisterPage extends TestBase {
	
	
	@FindBy (xpath ="//div[contains(text(),'This field is required.')]")
	public WebElement EmptyFiledErr;
	@FindBy (xpath = "(//div[@for = 'fieldForm'])[2]/div")
	public WebElement SurnameErr;
	
	@FindBy (name ="firstName")
	public WebElement FirstName;
	
	@FindBy (name ="surname")
	public WebElement Surname;
	
	@FindBy (id ="day-expire-date")
	public WebElement Day;
	
	@FindBy (xpath = "//div[@class='col-xs-5']//select")
	public WebElement Month;
	
	@FindBy (xpath ="//input[@placeholder='Year']")
	public WebElement Year;

	@FindBy (id ="email")
	public WebElement Email;
	
	@FindBy (id ="confirmEmail")
	public WebElement ConfirmEmail;
	
	@FindBy (id ="password_regMyself")
	public WebElement Password;
	
	@FindBy (xpath = "//button[@type='button']")
	public WebElement RegisterBtn;
	
	@FindBy (xpath ="//h1[contains(text(),'Register with British Council')]")
	public WebElement RPtext;
	
	public RegisterPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String RPtextt() {
		
		return RPtext.getText();
	}
	public boolean EmptyFiledErr() {
		return EmptyFiledErr.isDisplayed();
	}
	public void SurErrMsg() {
		
		SurnameErr.getText();
		
	}
	
	public void RegisterUserWithName(String FName, String Sname) {
		
	FirstName.sendKeys(FName);
	Surname.sendKeys(Sname);

	}
	
	public void EnterEmailandClick(String E, String CE) {
		Email.sendKeys(E);
		ConfirmEmail.sendKeys(CE);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	

