package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
	
		try {
		prop = new Properties();
		FileInputStream ie = new FileInputStream(
					"C:\\Users\\bhadr\\Desktop\\Seleniumworkspace\\BritishCounsilFramework\\src\\main\\java\\data\\Details.properties");
		prop.load(ie);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		}
	public static void initialization() {
		 String Browser = prop.getProperty("Browser");
		 System.out.println(Browser);
		 if(Browser.equals("FireFox")) {
		 	System.setProperty("webdriver.gecko.driver", "C:\\Users\\bhadr\\OneDrive\\Desktop\\Seleniumjars/geckodriver.exe");
			driver =new FirefoxDriver();
		 }else  {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhadr\\OneDrive\\Desktop\\Seleniumjars/chromedriver.exe");
			driver =new ChromeDriver();
	}
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
	}

	}

