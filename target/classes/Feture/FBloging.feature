Feature: Facebook login 

Scenario: Valid userman and Invalid password to login 

	Given user at facebook home page 
	When User enter valid username 
	And user enter invalid password 
	And user Click on login button 
	Then user will see red errror message 
	
	