Feature: Verify the Overview Heading

Scenario Outline: From the result click on taj mahal and verify overview heading
	Given Intialize the browser with chrome
	And Navigate to "https://www.tajhotels.com/" site
	Then Read data from excel and send in search box
	Then From the dropdown click on Taj Mahal Palace Mumbai
	And Verify the overview heading <text>
	Then terminate the browser
	
	Examples:
	|text				 |
	|The Taj Mahal Palace|