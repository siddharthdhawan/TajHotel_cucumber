package stepDefinations;



import java.io.IOException;

import cucumber.api.java.en.*;
import pageObject.HomePage;
import pageObject.TajMahalPage;
import utility.BaseClass;
import utility.SnapShots;




public class StepDefination1 extends BaseClass {
		
	BaseClass baseclass=new BaseClass();
	HomePage homepage=new HomePage();
	TajMahalPage tajmahalpage=new TajMahalPage();
	SnapShots snap;
	@Given("^Intialize the browser with chrome$")
	public void intialize_the_browser_with_chrome() {
		baseclass.setUp();
	 }

	@Then("^Read data from excel and send in search box$")
	public void read_data_from_excel_and_send_in_search_box() throws IOException{
		//homepage.clickOnCloseChat();
		homepage.acceptCookies();
		homepage.searchInput();
	}

	@Then("^From the dropdown click on Taj Mahal Palace Mumbai$")
	public void from_the_dropdown_click_on_taj_mahal_palace_mumbai() throws InterruptedException {
		Thread.sleep(3000);
	    homepage.clickOnTajMahal();
	}

	@Then("^terminate the browser$")
	public void terminate_the_browser() {
	     baseclass.tearDown();
	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String strArg1) {
		driver.get(strArg1);
		driver.manage().window().maximize();
	}

	@And("^Verify the overview heading (.+)$")
	public void verify_the_overview_heading(String text) {
		snap=new SnapShots();
		String text1=tajmahalpage.getOverviewHeading();
		if(text1.equalsIgnoreCase(text)) {
			snap.takeSnapShot("Test 1 passed");
		} else {
			snap.takeSnapShot("Test 1 failed");
		}
	}

}
