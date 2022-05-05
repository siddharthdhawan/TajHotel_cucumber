package pageObject;

import java.io.IOException;

import org.apache.logging.log4j.Logger;

import reusuable.WebDriverHelper;
import uiStore.HomeUi;
import utility.Logs;
import utility.ReadExcel;

public class HomePage {
	
	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public HomePage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	public void searchInput() throws IOException {
		helper.sendText(HomeUi.searchbox,ReadExcel.getCellDataString(1, 0));
		log.info("Succesfully sended text to search input box");
	}
	public void clickOnTajMahal() {
		helper.explicitWait(HomeUi.tajMahal, 50);
		helper.clickOn(HomeUi.tajMahal);
		log.info("clicked on taj mahal palace");
	}
	public void clickOnCloseChat() {
		helper.clickOn(HomeUi.closechat);
	}
	public void acceptCookies() {
		helper.clickOn(HomeUi.cookies);
	}
	public void clickOnTajMagzine() {
		helper.explicitWait(HomeUi.tajMagzine, 30);
		helper.clickOn(HomeUi.tajMagzine);
		log.info("Clciked on taj magzine");
	}
	public String getDiscount() {
		helper.explicitWait(HomeUi.member, 10);
		String text=helper.getText(HomeUi.member);
		log.info("getting discount offer");
		return text;
	}
}
