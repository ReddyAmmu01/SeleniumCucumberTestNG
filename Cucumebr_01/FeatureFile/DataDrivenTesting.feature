@UATTestingDataDriven
Feature: youtube channel
Scenario Outline: You Tube Channel Name for Data Driven Testing 
	Given Open the browser and enter the URL
	When search the Selenium Tutorial "<SearchString>"
	And Click on Channel
	Then Validation Channel Name
	Examples:
	|SearchString|
	|Selenium by Bakkappa -N|
	|selenium By Naveen AutomationLAB|
	|Data sceinece for Latest- AI|
	 