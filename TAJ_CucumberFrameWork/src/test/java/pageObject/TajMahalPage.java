package pageObject;

import org.apache.logging.log4j.Logger;

import reusuable.WebDriverHelper;
import uiStore.TajMahalUi;
import utility.Logs;

public class TajMahalPage {
	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public TajMahalPage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public String getOverviewHeading() {
		String text=helper.getText(TajMahalUi.overviewHeading);
		log.info("Successfully get the overview heading");
		return text;
	}
}
