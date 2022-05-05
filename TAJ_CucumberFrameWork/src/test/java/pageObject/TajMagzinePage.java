package pageObject;

import org.apache.logging.log4j.Logger;

import reusuable.WebDriverHelper;
import uiStore.TajMagzineUi;
import utility.Logs;

public class TajMagzinePage {
	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public TajMagzinePage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	public String textVerify() {
		String text=helper.getText(TajMagzineUi.checkText);
		log.info("searching text");
		return text;
	}
}
