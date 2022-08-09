package tests;

import java.io.IOException;

import org.junit.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.ExcelData;
import data.TestBase;
import pages.RegisterPage;
import pages.WelcomeHomePage;

public class RegisterPageTest extends TestBase{
	
	
	WelcomeHomePage wh;
	RegisterPage rp;
	ExcelData ed;
	
	public RegisterPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
	 initialization();
	 wh = new WelcomeHomePage();
	 rp = new RegisterPage();
	// ed =  new ExcelData();
	 wh.ClickOnRegisterii();
	}
	
	@Test
	public void RegisterUser() {
		
		rp.RegisterUserWithName("Bhadresh", " ");
		rp.EnterEmailandClick("Btnawab@gmail.com", "Btnawab@pmail.com");
		System.out.println(rp.RPtextt());

		Assert.assertEquals(rp.RPtextt(), "Register with British Council");		
		
	}	
		
		@AfterMethod 
		public void TearDown() {
			driver.quit();
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
