package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminPOM;
import com.training.pom.LoginPOM;
import com.training.pom.Lost_password;
import com.training.pom.ProfilePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;



public class RETC_013 {


	private WebDriver driver;
	private LoginPOM loginPOM;
	private AdminPOM adminPOM;
	private ProfilePOM profilePOM;
	private ScreenShot screenShot;


	private String baseUrl;


	private Lost_password lpwd;
	private static Properties properties;
	
	



	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		adminPOM = new AdminPOM(driver); //my own code 
		profilePOM=new ProfilePOM(driver);
		//lpwd=new Lost_password(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}	

	
	

		@Test
		public void Test_RETC_013() throws InterruptedException {
		loginPOM.mLogInClick();//calling my own defined LOGIN/REGISTER METHOD of LoginPOM.java class
		loginPOM.sendUserName("admin");
		//loginPOM.sendPassword("admin@123");
		loginPOM.sendPassword("adminuser@12345");
		loginPOM.clickLoginBtn(); 

		adminPOM.userclick();//calling  METHODS of AdminPOM.java class
		Thread.sleep(8000);
		adminPOM.myprofileclick();//calling  METHODS of AdminPOM.java class

		profilePOM.lastnameupdate("manzoor10");
		profilePOM.phoneupdate("9455234288");
		profilePOM.updatebuttonclick();
		Thread.sleep(8000);
		String expected="Profile updated.";
		String actual=profilePOM.update_message();
		Assert.assertEquals(actual, expected);
		screenShot.captureScreenShot("Test_RETC_013");
		}
	}

