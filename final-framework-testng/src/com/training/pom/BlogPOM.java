package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogPOM {
private WebDriver driver; 
	
	public BlogPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(xpath="//div[@id='post-4916']/child::div/child::a")//the original one
	private WebElement readmorev;*/
	
	//p[text()='New Launch in Home']//following-sibling::a[@class='read-more']
	
	@FindBy(xpath="//p[text()='New Launch in Home']//following-sibling::a[@class='read-more']")
	private WebElement readmorev;
	
	
	@FindBy(xpath="//div[@class='blog-post single-post']/div/a/h3")
	private WebElement postdetailv;
	

	
	
	
	public void readMore() throws InterruptedException
	{
		//Thread.sleep(8000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		this.readmorev.click();
		
	}
	
	public void postDetails() throws InterruptedException
	{
		
		//Thread.sleep(8000);
		this.postdetailv.click();
		
	}
	
	
	
	
	
	
	
}
	