package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import data.TestBase;
import pages.WelcomeHomePage;

public class WelcomeHomePageTest extends TestBase{

	WelcomeHomePage wh;
	public WelcomeHomePageTest() {
		super();
	}
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
	 initialization();
	 wh = new WelcomeHomePage();
	 
	}
	
	@Test
	public void ClickOnRegisterButton() {
		wh.ClickOnRegisterii();
	}
	
	@Test
	public void Title() {
		String Title = driver.getTitle();
		Assert.assertEquals("IELTS Registration", Title);
	}

	@Test
	public void ClickOnLogin() {
		wh.ClickOnLogin();
	}
	
	@Test
	public void ClickOnAgentlogin() {
		wh.ClickOnAgentLogin();
	}
	@Test
	public void VerifyingBClogo() {
		Assert.assertTrue(wh.BritshLogoDisplayed(), "BritishCounsilLogoNotDisplayed");
		
	}
	
	@Test
	public void VerifyingIELTSlogo() {
		Assert.assertTrue(wh.IELTSLogoDispalyed(), "IELTSLogoNotDisplayed");
		
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
