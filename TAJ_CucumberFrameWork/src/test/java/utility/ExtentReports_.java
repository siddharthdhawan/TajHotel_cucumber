package utility;

public class ExtentReports_ {
	
	ConfigRead cr=new ConfigRead();
	public String extentConfig() {
		String configpath=cr.getReportConfigPath();
		return configpath;
	}

}
