package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigRead {
	
public Properties prop;
	
	public ConfigRead() {
		File src=new File("./config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getDriverPath() {
		String dp=prop.getProperty("driverpath");
		return dp;
	}
	
	public String getUrl() {
		String url=prop.getProperty("url");
		return url;
	}
	public String getLogFileNmae() {
		String logname=prop.getProperty("logfilename");
		return logname;
	}
	
	public String getReportConfigPath() {
		String config=prop.getProperty("reportconfigpath");
		return config;
	}
	
	

}
