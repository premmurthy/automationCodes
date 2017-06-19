package ProjectOne.Lead;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ProjectWrapper {

	ExtentReports extent;

	ExtentTest test;
	RemoteWebDriver driver;
	
	@BeforeClass

	//@BeforeTest

	public void startTest() {
		
		
		

		extent = new ExtentReports(System.getProperty("user.dir") + "/test-outfile/LeadValidationReport.html", true);

		extent.addSystemInfo("User Name", "MPrem").addSystemInfo("Host Name", "IndiaProperty")
				.addSystemInfo("Type Of Testing", "Sanity").addSystemInfo("Environment", "Production Site")
				.addSystemInfo("Author", "MPrem -QA");

		extent.loadConfig(
				new File(System.getProperty("user.dir") + "/src/main/java/ProjectOne/Lead/extent-config2.xml"));

	}

	@AfterMethod

	public void getResult(ITestResult result2) throws IOException {
		
		
try{
	
	
		
	
	if (result2.getStatus() == ITestResult.FAILURE) {

	
			test.log(LogStatus.FAIL, "Testcase  Fail" + "  " + result2.getName());
			test.log(LogStatus.FAIL, "Testcase Fail" + "  " + result2.getThrowable());
		}

		else if (result2.getStatus() == ITestResult.SKIP) {
			
			
			
			
			test.log(LogStatus.FAIL, "Testcase Fail" + "  " + result2.getName());
			test.log(LogStatus.FAIL, "Testcase Fail" + "  " + result2.getThrowable());

		}

		
		
		
		

		extent.endTest(test);
		
}
		catch(Exception e)
	    {
	        System.out.println("\nLog Message::@AfterMethod: Exception caught");
	        e.printStackTrace();
	    }
		
		
		
	}

	@AfterTest

	public void endReport() {
		// extent.endTest(test);
		// extent.endTest(test);
		
		
		extent.flush();
		// extent.endTest(test);
		// extent.close();
	}

}
