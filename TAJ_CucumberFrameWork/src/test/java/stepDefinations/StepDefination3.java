package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObject.HomePage;
import pageObject.TajMagzinePage;
import utility.SnapShots;


public class StepDefination3 {
	
	HomePage homepage=new HomePage();
	TajMagzinePage tajmagzinepage=new TajMagzinePage();
	SnapShots snap;
	
	 @Then("^then click on taj magzine$")
	    public void then_click_on_taj_magzine() {
	        homepage.acceptCookies();
	        homepage.clickOnTajMagzine();
	    }

	 @And("^check the (.+) is present or not$")
	    public void check_the_is_present_or_not(String text) {
		 snap=new SnapShots();
	        String text1=tajmagzinepage.textVerify();
	        if(text1.equalsIgnoreCase(text)) {
	        	snap.takeSnapShot("text 3 passed");
	        } else {
	        	snap.takeSnapShot("test 3 failed");
	        }
	    }
}
