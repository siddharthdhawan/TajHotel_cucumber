package stepDefinations;

import cucumber.api.java.en.And;
import pageObject.HomePage;
import pageObject.TajMahalPage;
import utility.SnapShots;

public class StepDefination2 {
	HomePage homepage=new HomePage();
	SnapShots snap;
	
	  @And("^verify under exclusive member 15% discount is present or not$")
	    public void verify_under_exclusive_member_15_discount_is_present_or_not() {
		  snap=new SnapShots();
	       homepage.acceptCookies();
	       String text=homepage.getDiscount();
	       if(text.equalsIgnoreCase("Exclusive Member Rewards")) {
	    	   snap.takeSnapShot("No offer as not registered(TEST 2)");
	       } else {
	    	   snap.takeSnapShot("unable to find");
	       }
	    }


}
