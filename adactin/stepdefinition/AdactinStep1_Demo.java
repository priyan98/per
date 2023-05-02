package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.Base.BaseClass;
import com.adactin.runner.AdactinRunner1_Demo;
import com.pom.LogIn;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AdactinStep1_Demo extends BaseClass{
	public static WebDriver driver = AdactinRunner1_Demo.driver;
	 
    
    
	@Given("^User can able to launch the url$")
	public void user_can_able_to_launch_the_url() throws Throwable {
		geturl("https://adactinhotelapp.com/");
	}
     
	@When("^user enter to the user name in the textbox$")
	public void user_enter_to_the_user_name_in_the_textbox() throws Throwable {
    WebElement element = element("id", "username");
	    Input(element, "Sangeeth98");
	}

	@When("^User can able to the enter the password in the textbox$")
	public void user_can_able_to_the_enter_the_password_in_the_textbox() throws Throwable {
		WebElement element = element("id", "password");
		Input(element, "manamadurai");
	}

	@Then("^Usser can able to click the login and then mover to the next page$")
	public void usser_can_able_to_click_the_login_and_then_mover_to_the_next_page() throws Throwable {
		WebElement element = element("name", "login");
		element.click();
	}

	@Given("user can anble to launch the url")
	public void user_can_anble_to_launch_the_url() {
		geturl("https://adactinhotelapp.com/SearchHotel.php");
		}
	@When("user can able to select the location")
	public void user_can_able_to_select_the_location() {
		WebElement loaction = element("name", "location");
        dropdown("value", loaction, "Sydney");
	}
	@When("user can able to select the hotel")
	public void user_can_able_to_select_the_hotel() {
		WebElement hotel = element("id", "hotels");
		dropdown("value", hotel, "Hotel Sunshine");
	}
	@When("user can able to select the room type")
	public void user_can_able_to_select_the_room_type() {
		WebElement RoomType = element("id", "room_type");
		dropdown("value", RoomType, "Standard");
		}
	@When("user can able to select the number of room")
	public void user_can_able_to_select_the_number_of_room() {
		WebElement NOR = element("name", "room_nos");
		dropdown("value",NOR, "2");
	}
	@When("user can able to enter the check in date")
	public void user_can_able_to_enter_the_check_in_date() {
	WebElement CID = element("id", "datepick_in");
		Input(CID, "21/12/2022");

	}
	@When("user can able to enter the check out date")
	public void user_can_able_to_enter_the_check_out_date() {
		WebElement COD = element("id", "datepick_out");
		Input(COD, "24/12/2022");

	}
	@When("user can able to select the adults per room")
	public void user_can_able_to_select_the_adults_per_room() {
		WebElement APR = element("id", "adult_room");
		dropdown("value", APR , "2");
	}
	@When("user can able to select the children per room")
	public void user_can_able_to_select_the_children_per_room() {
		WebElement CPR = element("id", "child_room");
		dropdown("value",CPR, "2");
	}
	@Then("user can able to the click the search button and move the next page")
	public void user_can_able_to_the_click_the_search_button_and_move_the_next_page() {
		WebElement search = element("id", "Submit");
		click(search);
		
	}
	
	@Given("user can able to launch the url")
	public void user_can_able_to_launch_the_url1() {
		geturl("https://adactinhotelapp.com/SelectHotel.php");
	}
	@When("user can able to select the hoteloption")
	public void user_can_able_to_select_the_hoteloption() {
		WebElement select = element("id", "radiobutton_0");
		click(select);
		
	}
	@Then("user can click to the continue button and move to next page")
	public void user_can_click_to_the_continue_button_and_move_to_next_page() {
		WebElement BookNow = element("id", "continue");
		click(BookNow);
		}
	@Given("user can able to launch the url2")
	public void user_can_able_to_launch_the_url2() {
		geturl("https://adactinhotelapp.com/BookHotel.php");
	}

	@When("user can able to enter the firstname in the textbox")
	public void user_can_able_to_enter_the_firstname_in_the_textbox() {
		WebElement FN = element("name", "first_name");
		Input(FN, "sangeeth");  
	    
	}
	@When("user can able to enter the lastname in the textbox")
	public void user_can_able_to_enter_the_lastname_in_the_textbox() {
		WebElement LN = element("name", "last_name");
		Input(LN, "priyan");  
	    
	}
	@When("user ca able to enter the  billing adress in the box")
	public void user_ca_able_to_enter_the_billing_adress_in_the_box() {
	   WebElement Billing = element("name", "address");
	   Input(Billing, "215/a,manamadurai");
	    
	}
	@When("user can able to enter to the credit card number in the box")
	public void user_can_able_to_enter_to_the_credit_card_number_in_the_box() {
		WebElement CCN = element("name", "cc_num");
		   Input(CCN , "1234567890098765");
	    
	}
	@When("user can select the credit card type")
	public void user_can_select_the_credit_card_type() {
		WebElement CCT = element("name", "cc_type");
		dropdown("value", CCT, "AMEX");
	    
	}
	@When("user can able to select the expiry month")
	public void user_can_able_to_select_the_expiry_month() {
		WebElement EM = element("name", "cc_exp_month");
		dropdown("value", EM, "3");
	    
	}
	@When("user can able to select the expiry year")
	public void user_can_able_to_select_the_expiry_year() {
		WebElement EY = element("name", "cc_exp_year");
		dropdown("value", EY , "2022");
	}
	@When("user can able to enter the cvv number in the box")
	public void user_can_able_to_enter_the_cvv_number_in_the_box() {
		WebElement CCV = element("name", "cc_cvv");
		Input(CCV, "234");
	}
	@Then("user can able to enter the book now button and move on to the next page")
	public void user_can_able_to_enter_the_book_now_button_and_move_on_to_the_next_page() throws InterruptedException {
	 click(element("name", "book_now"));
		
	   
	}
	
	@Given("user can able to launch url")
	public void user_can_able_to_launch_url() {
		
	   
       
	}
	
	@When("user can able to click the logout button")
	public void user_can_able_to_click_the_logout_button() {
	    
	   
	}
	@Then("Navigate to the final page")
	public void navigate_to_the_final_page() {
	    
	   
	}
}		


