//CREATED NEW PAGE CLASS BY MYSELF
package com.training.pom;

import java.util.concurrent.TimeUnit;//my own code

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	
	
	

	/*@FindBy(xpath="//li[@id='menu-comments']/child::a/div[3]")
	private WebElement commentclk;
*/
	
	@FindBy(xpath="//li[@class='wp-not-current-submenu menu-top menu-icon-comments']/a")
	private WebElement commentclk;
	
	@FindBy(xpath="//li[@id='menu-posts']")
	private WebElement postclick;
	
	
	

	@FindBy(xpath="//li[@id='menu-posts']/ul/li[3]/a")
	private WebElement newpostv2
	;
	
	@FindBy(xpath="//input[@id='title']")//new title
	private WebElement posttitlev;
	
	@FindBy(xpath="	//textarea[@id='content']")
	private WebElement textareav;
	

	
	@FindBy(xpath="//input[@id='publish']")
	private WebElement publishv;
	
	
	

	@FindBy(xpath="//div[@id='message']/p/a")
	private WebElement viewmsg;
	
	
	
	@FindBy(xpath="//div[@class='wp-menu-image dashicons-before dashicons-admin-multisite']")
	private WebElement propertyclv;
	
	@FindBy(xpath="	//a[text()='Regions']")
	private WebElement regionclv;
	
	
	@FindBy(xpath="//input[@id='tag-name']")
	private WebElement regionnamev;
	

	
	@FindBy(xpath="//input[@id='tag-slug']")
	private WebElement 	tag_slugv;
	

	
	
	@FindBy(xpath="//select[@id='parent']")
	private WebElement 	selectv;
	
	
	@FindBy(xpath="//textarea[@id='tag-description']")
	private WebElement 	textdescv;
	
	
	
	
	@FindBy(xpath="//input[@id='submit']")
	private WebElement 	addregionclv;
	
	
	
	

	@FindBy(xpath="//li[@id='menu-posts-property']/ul/li[3]/a")
	private WebElement 	addnewv;
	
	
	
	
	

	@FindBy(xpath="//input[@name='post_title']")
	private WebElement 	postv;
	
	@FindBy(xpath="//textarea[@id='content']//input[@name='post_title']")
	private WebElement 	titlev;
	
	
	
	
	
	@FindBy(xpath="//li[@id='region-408']/label/input")
	private WebElement 	checkb1;

	

	@FindBy(xpath="//li[@id='region-408']/ul/li[3]/label/input")
	private WebElement 	checkb2;
	


	//input[@id='publish']
	
	@FindBy(xpath="//input[@id='publish']")
	private WebElement 	regionpub;
	

	
	
	@FindBy(xpath="//a[text()='View post']")
	private WebElement 	viewrecl;


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
	
	public void commentClick()//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		this.commentclk.click();

	}
	
	public void postClick()//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		this.postclick.click();
	}

	public void addnewpostClick()//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		this.postv.click();
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


	public void addnewtitleClick()//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		this.posttitlev.click();
		this.posttitlev.sendKeys("John building description");//new title
	}

	public void textareaClick()//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		this.textareav.sendKeys("John building details find here");
		this.textareav.sendKeys("John A building is best identified during preplanning, but there are distinct features that will help firefighters identify the building type as they pull up on scene. There are also several diagnostic techniques that ladder companies can use when they’re up close and personal with a building.");
	}
	
	public void publishClick() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		Thread.sleep(4000);
		this.publishv.click();
		System.out.println("clicked");
	}
	
	public void viewMSGClick() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		this.viewmsg.click();
		Thread.sleep(3000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");*/
	}
	
	
	public void propertyclickfun() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		this.propertyclv.click();
		Thread.sleep(3000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");*/
	}
	
	
	
	public void regionclickfun() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		this.regionclv.click();
		Thread.sleep(3000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");*/
		this.regionclv.click();
	}
	
	
	
	public void regiontextfunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		this.regionnamev.sendKeys("region title of silk board");
		Thread.sleep(3000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");*/
		this.tag_slugv.sendKeys("slug text silk board");
	}
	
	public void selectvfunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		Thread.sleep(3000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");*/
		Select s=new Select(selectv);
		//s.selectByIndex(12);
		s.selectByVisibleText("Villas");
		
		
	}
	
	public String regionreturn() {
		return selectv.getAttribute("value");
	}
	
	

	public void textdescvfunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		Thread.sleep(3000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");*/
		this.textdescv.sendKeys("full text description Villas");
	}
	

	
	
	
	public void addregionclvfunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		Thread.sleep(3000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");*/
		this.addregionclv.click();
		}
	
	
	
	public void addnewvfunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		Thread.sleep(3000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");*/
		this.addnewv.click();
		}
	
	
	public void titlefunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		Thread.sleep(3000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");*/
		this.posttitlev.sendKeys("title next Villas");
		}
	

	
	
	public void textareafunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		Thread.sleep(3000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");*/
		this.textareav.sendKeys("hello bangalore textarea for next Villas");
		}
	

	
	
	
	
	public void checkboxfunc1() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		String regionxpathbefore="//*[contains(text(),' ";
		String regionxpathafter="')]//input";
		String regionxpath=regionxpathbefore+regionreturn()+regionxpathafter;
		
		//this.posttitlev.click();
		Thread.sleep(6000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");*/
		//this.checkb1.click();
		driver.findElement(By.xpath(regionxpath)).click();
		
		}
	
	public void checkboxfunc2() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		Thread.sleep(6000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		this.checkb2.click();
		}
	
	
	
	public void regionpublishfunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		Thread.sleep(6000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-4000)");
		this.regionpub.click();
		}
	
	
	
	public void viewmsgfunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		Thread.sleep(3000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");*/
		this.viewrecl.click();
		}
	
	
}
