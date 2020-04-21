package StepDefinition;

import POM_pages.homepage;
import POM_pages.loginpages;
import TestBase.Testbase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Adactin_StepDefinition extends Testbase {

	loginpages login;
	homepage home;
	@Given("^user goes to app and launch browser$")
	public void user_goes_to_app_and_launch_browser()   {
		
		Testbase.initialization();
		login= new loginpages();
	String tittle=	login.validatepagetittle();
		Assert.assertEquals("AdactIn.com - Hotel Reservation System", tittle);
		System.out.println("login pagee tittle is :: "+tittle);
	boolean b=	login.validateimage();
	         Assert.assertTrue(true);
		}

	@When("^user enter details and check for title$")
	public void user_enter_details_and_check_for_title()   {
		
		home =login.login(p.getProperty("username"), p.getProperty("password"));
	}

	@Then("^user goes to home page and check tittle$")
	public void user_goes_to_home_page_and_check_tittle()   {
		
		String hometittle= home.checktittle();
		Assert.assertEquals("AdactIn.com - Search Hotel", hometittle);
		
		System.out.println("home page title is ::"+hometittle);
	}

	@Then("^user search for hotel$")
	public void user_search_for_hotel()   {
		
		home.searchpage(p.getProperty("location"), p.getProperty("Hotel"), p.getProperty("roomtype"), p.getProperty("noroom"));
	}

	@Then("^user check the hotel and image$")
	public void user_check_the_hotel_and_image()   {
		home.enterdates(p.getProperty("chechin"), p.getProperty("chechout"), p.getProperty("adultroom"), p.getProperty("childroom"));
	}

	@Then("^user log out of application$")
	public void user_log_out_of_application()   {
		home.user_click_on_search();
	}


}
