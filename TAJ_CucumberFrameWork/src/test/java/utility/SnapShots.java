package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SnapShots {
	
	WebDriver driver=BaseClass.driver;
	public String takeSnapShot(String Filename) {
		TakesScreenshot scrnshot=(TakesScreenshot) driver;
		
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy/HH/mm/ss");
		File src=scrnshot.getScreenshotAs(OutputType.FILE);
		String date=sdf.format(d);
		String timeStamp="./Screenshots/"+date.replaceAll("/","_")+"-"+Filename+".png";
		File dest=new File(timeStamp);
		try {
			FileUtils.copyFile(src, dest);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return timeStamp;
		
	}
}
