Feature: Facebook login 

Scenario: Valid userman and Invalid password to login 

	Given user at facebook home page 
	When user enter valid username "Adrial@gmail.com"
	And user enter invalid password "123456"
	And user Click on login button 
	Then user will see red error message
	
	