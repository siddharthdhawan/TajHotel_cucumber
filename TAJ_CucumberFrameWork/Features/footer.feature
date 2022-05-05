Feature: Verify the text

Scenario Outline: Click on taj magzine and check test is present or not
	Given Intialize the browser with chrome
	And Navigate to "https://www.tajhotels.com/" site
	Then then click on taj magzine
	And check the <text> is present or not
	Then terminate the browser
	
	Examples: 
	|text|
	|PICKLE STORIES FROM MY LIFE|
