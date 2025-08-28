#Feature: Free CRM Login Feature
Feature: Free CRM Application Test


Scenario: Validate Free CRM Home Page Test

Given user opens browser
Then user is on login page
#Then user clicks signup button
#Then user signup into website
Then user clicks login button
Then user logs into website
#Then validate home page title


#without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "naveenk" and "test@123"
#Then user clicks on login button
#Then user is on home page


#with Examples Keyword
#Scenario Outline: Free CRM Login Test Scenario

#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "<username>" and "<password>"
#Then user clicks on login button
#Then user is on home page
#Then Close the browser


#Examples:
#	| username | password |
#	| naveenk  | test@123 |
#	|  tom     | test456  |
#