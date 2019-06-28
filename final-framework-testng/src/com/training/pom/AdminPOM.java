//CREATED NEW PAGE CLASS BY MYSELF
package com.training.pom;

import java.util.concurrent.TimeUnit;//my own code

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPOM {
private WebDriver driver; 
	
	public AdminPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[text()='Users']")
	private WebElement usersv;

	@FindBy(xpath="//a[text()='Your Profile']")
	private WebElement profilev;

	/*@FindBy(xpath="//button[text()='Generate Password']")
	private WebElement  uppwd;

	@FindBy(id="pass1-text")
	private WebElement  pwdtext;

	@FindBy(id="pass1-text")
	private WebElement  pwd1text;*/

	@FindBy(xpath="//ul[@id='wp-admin-bar-top-secondary']/li/a")
	private WebElement loutmvuser;



	@FindBy(xpath="//li[@id='wp-admin-bar-logout']")
	private WebElement loutclick;






	public void userclick()
	{
		Actions a=new Actions(driver);
		a.moveToElement(this.usersv).build().perform();//QUESTIONS created for mouseover having questions on mousrovering other parts
		//this.usersv.click();

	}

	public void myprofileclick()//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(this.profilev).build().perform();//QUESTIONS created for mouseover having questions on mousrovering other parts
		this.profilev.click();

	}




	/*public void lastnameupdate(String lname) throws InterruptedException
	{
		this.lnamev.clear();

		this.lnamev.sendKeys(lname);
		Thread.sleep(9000);



	}
	public void phoneupdate(String phone) throws InterruptedException
	{
		this.phonev.clear();
		Thread.sleep(9000);
		this.phonev.sendKeys(phone);
		Thread.sleep(9000);


	}

	public void generatepwd(String p) throws InterruptedException
	{
		this.uppwd.click();

		this.pwdtext.clear();
		Thread.sleep(9000);
		this.pwdtext.sendKeys(p);
		Thread.sleep(9000);
		this.pwdtext.clear();
		this.pwdtext.sendKeys("admin@123");
		 
	}

	public void updatebuttonclick()
	{

		this.updatev.click();

	}*/

	public void logout()
	{
		Actions a=new Actions(driver);
		a.moveToElement(loutmvuser).build().perform();

		this.loutclick.click();
	}






}
