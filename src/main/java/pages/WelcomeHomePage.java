package pages;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import data.TestBase;



public class WelcomeHomePage extends TestBase {

	//PageFactory or OR Means O
	
	@FindBy (xpath ="//a[contains(text(),'Register')]")
	public WebElement RegisterLink;	
	
	@FindBy (linkText ="Log in")
	public WebElement LoginLink;
	
	@FindBy (linkText ="Agent login")
	 WebElement AgentLoginLink;
	
	@FindBy (linkText ="British Council")
	 WebElement BritishCouncilLogo;
	
	@FindBy (xpath ="//span[contains(text(),'Book IELTS')]")
	 WebElement IELTSLogo;

	//Initializing PageObjects

		public WelcomeHomePage() {
       PageFactory.initElements(driver, this);
	}
	//Actions :
	public RegisterPage ClickOnRegisterii() {
		RegisterLink.click();
		return new RegisterPage();
	}
	
	public LoginPage ClickOnLogin() {
		LoginLink.click();
		return new LoginPage();
	}
	
	public AgentLoginPage ClickOnAgentLogin() {
		AgentLoginLink.click();
		return new AgentLoginPage();
	}
	
	public boolean BritshLogoDisplayed() {
		return BritishCouncilLogo.isDisplayed();
	}
	
	public boolean IELTSLogoDispalyed() {
		return IELTSLogo.isDisplayed();
	}
	
	public void Quit() {
		driver.quit();
	}
	
	
	
	
	
	

	
	
	
	
	
	
	

}
