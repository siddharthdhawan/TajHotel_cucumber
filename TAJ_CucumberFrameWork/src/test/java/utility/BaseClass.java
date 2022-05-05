package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	ConfigRead cr=new ConfigRead();
	public String baseUrl=cr.getUrl();
	public static WebDriver driver;
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", cr.getDriverPath());
		driver=new ChromeDriver();
	}
	public void tearDown() {
		driver.quit();
	}

}
