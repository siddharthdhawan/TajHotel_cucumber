package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utility.ExtentReports_;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
		glue="stepDefinations",
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/cucumber-reports/report.html"})
public class TestExecution {
	
	public  static ExtentReports_ reports=new ExtentReports_();
	@AfterClass
	public static void writeExtentReport() {
		try {
			Reporter.loadXMLConfig(new File(reports.extentConfig()));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
