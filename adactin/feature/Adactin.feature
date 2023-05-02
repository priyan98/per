Feature: Hotel room booking 
@sangee
Scenario: Login page 
	Given User can able to launch the url 
	When user enter to the user name in the textbox 
	And  User can able to the enter the password in the textbox 
	Then Usser can able to click the login and then mover to the next page
	 
@somke	
Scenario: Search Hotel 
	Given user can anble to launch the url 
	When user can able to select the location 
	And user can able to select the hotel 
	And  user can able to select the room type 
	And user can able to select the number of room 
	And user can able to enter the check in date 
	And user can able to enter the check out date 
	And user can able to select the adults per room 
	And user can able to select the children per room 
	Then user can able to the click the search button and move the next page 
	
Scenario: Select Hotel 
	Given user can able to launch the url 
	When user can able to select the hoteloption 
	Then  user can click to the continue button and move to next page 
	
Scenario: Book A Hotel 
	Given user can able to launch the url2 
	When user can able to enter the firstname in the textbox 
	And  user can able to enter the lastname in the textbox 
	And  user ca able to enter the  billing adress in the box 
	And  user can able to enter to the credit card number in the box 
	And user can select the credit card type 
	And user can able to select the expiry month 
	And user can able to select the expiry year 
	And user can able to enter the cvv number in the box 
	Then user can able to enter the book now button and move on to the next page 
	@smoke
	Scenario: logout Fun
	    Given user can able to launch url
	    When user can able to click the logout button
	    Then Navigate to the final page
	
        