package POM_pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Testbase;




	
	
	public class loginpages extends Testbase {
		
		@FindBy(name="username")
		WebElement username;
		@FindBy(name="password")
		WebElement Password;
		
		@FindBy(name="login")
		WebElement submit;
		
		@FindBy(xpath="//img[contains(@class,'logo')]")
		
		WebElement image;

		
		/// for contructor there is no voidd 
	public   loginpages(){
		
		PageFactory.initElements(wd, this);
		
	}
		public  String validatepagetittle() {
		return	wd.getTitle();
			
		}
		public  boolean validateimage() {
			return image.isDisplayed();
		}
		
		// after logging in it should land on home page so given Home_page class for home  page
		public  homepage login(String un, String pwd) {
			username.sendKeys(un);
			Password.sendKeys(pwd);
			submit.click();
			return new homepage();
		}

	}

