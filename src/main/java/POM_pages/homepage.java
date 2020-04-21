package POM_pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.Testbase;


public class homepage extends Testbase {

		
		    public   homepage(){

		    	PageFactory.initElements(wd, this);

		    	}
		    	    
		    	    public String checktittle() {
		    			
		    	    	return	wd.getTitle();
		    	    	}


	    public void searchpage( String loc, String hotel,String room, String roomno)
		   {
			   Select select= new Select(wd.findElement(By.name("location")));
			    select.selectByVisibleText(loc);
			    Select select1= new Select(wd.findElement(By.name("hotels")));
			    select1.selectByVisibleText(hotel);
			    Select select3= new Select(wd.findElement(By.name("room_type")));
			    select3.selectByVisibleText(room);
			    Select select4= new Select(wd.findElement(By.name("room_nos")));
			    select4.selectByVisibleText(roomno);
		   }
	    
	    public void enterdates(String in,String out, String adult, String child) {
			   wd.findElement(By.name("datepick_in")).sendKeys(in);
			   wd.findElement(By.name("datepick_out")).sendKeys(out);
			   Select select5= new Select(wd.findElement(By.name("adult_room")));
			    select5.selectByVisibleText(adult);
			    Select select6= new Select(wd.findElement(By.name("child_room")));
			    select6.selectByVisibleText(child);
			    
		   }
	
	
	    public void user_click_on_search()   {
			
			   wd.findElement(By.name("Submit")).click();

		}


	
	
}

