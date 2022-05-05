Feature: Verify the !5 percent discount

Scenario: Click on taj magzine and check test is present or not
	Given Intialize the browser with chrome
	And Navigate to "https://www.tajhotels.com/" site
	And verify under exclusive member 15% discount is present or not
	Then terminate the browser