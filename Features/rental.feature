Feature: Test Rental with valid Credentials
	Scenario: Test Rental With Valid credentials
						Given open chrome and start application
						When I enter valid email and valid password
						And I click rental
						Then Rental is success