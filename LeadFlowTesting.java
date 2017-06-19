/**
 * 
 */
package ProjectOne.Lead;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author Temp
 *
 */
public class LeadFlowTesting extends GenericWrappers2 {

	// ExtentReports report;
	// ExtentTest logger;

	// main class -IPLead.LeadProject.LeadFlow
	WebDriver driver;

	@Test

	public void launch() throws InterruptedException {
		// report=new ExtentReports("D:/DSR/Leads/LearnAutomation.html");

		// logger=report.startTest("Launch Browser", "Verify whether the crome
		// browser launched");
		// logger.log(LogStatus.INFO, "Browser started ");

		invokeApp("chrome", "http://www.indiaproperty.com/");

		// logger.log(LogStatus.INFO, "Application is up and running");

		// ***************
		clickByXpathCityClose("//*[@id='modalcity-close']");

		clickByXpathClickSelectCity("//div[@class='select-city']/a");

		enterByIdCityEntryCityTextBox("searchval", "Alangudi");

		clickByClassNamesCitySelectFromList("ui-menu-item");

		clickByIdHomePageSearchButton("home-searchbtn");
		getAttributeValueOfListingsByXpath(
				"//div[@class='propety-item property-item-grid anchor-block']/child::div[1]");

		enterById("strname", "marvin");
		enterById("stremail", "marvin2@mailinator.com");
		enterById("mobileno", "8997808662");
		clickById("agent-enquiry-submit");
		Thread.sleep(10000);
		verifypopup();

		openNewTab("window.open('http://onboarding.indiaproperty.com/','_blank');", 2);

		enterById("username", "premkumar.m@indiaproperty.com");
		enterById("pass", "Elshaddaikr22");
		clickById("send");

		Thread.sleep(3000);
		openNewTab2("window.open(' http://onboarding.indiaproperty.com/customervalidation/1649545','_blank');", 3);
		sysDate();

		onbTableFreshenq("//table[@id='freshleadlists']//following-sibling::tr/td//a[@class='mediumtxt clr1']");

		onbTableDuplicateEnq("//table[@id='duplicateleadlists']//following-sibling::tr/td//a[@class='mediumtxt clr1']");

		onbTableCombined();

		onbTableDate("//table[@id='freshleadlists']//following-sibling::tr/td[10]");

		onbTableDateDuplicate("//table[@id='duplicateleadlists']//following-sibling::tr/td[8]");

		onbTableDateCombined();
		leadValidation();

		// ***********************************************************************
		/*
		 * 
		 * clickByXpathClickSelectCity("//div[@class='select-city']/a");
		 * enterByIdCityEntryCityTextBox("searchval", "Alangudi");
		 * clickByClassNamesCitySelectFromList("ui-menu-item");
		 * 
		 * clickByIdHomePageSearchButton("home-searchbtn");
		 * 
		 * 
		 * 
		 * getAttributeValueOfListingsByXpath("//div[@class='propety-item property-item-grid anchor-block']/child::div[1]"
		 * );
		 * 
		 * // enterById("strname", "Babu"); // enterById("stremail",
		 * "premmarvin16@gmail.com"); // enterById("mobileno", "9962325407");
		 * 
		 * 
		 * enterById("strname", "melvin"); enterById("stremail",
		 * "melvinm@mailinator.com"); enterById("mobileno", "8607650978");
		 * clickById("agent-enquiry-submit"); Thread.sleep(10000);
		 * verifypopup();
		 * 
		 * // verifypopup(); //isPresent(); // alreadyenqpopup();
		 * //alreadyenqpopup(
		 * "/p[@class='cor-grn']","//h2[@class='modal-title h1 text-center font-light']"
		 * );
		 * 
		 * openNewTab(
		 * "window.open('http://onboarding.indiaproperty.com/','_blank');",2);
		 * 
		 * enterById("username", "premkumar.m@indiaproperty.com");
		 * enterById("pass", "Elshaddaikr22"); clickById("send");
		 * Thread.sleep(3000); // openNewTab(
		 * "window.open('http://onboarding.indiaproperty.com/leads/768072','_blank');"
		 * ,3); //
		 * openNewTab("window.open(' http://onboarding.indiaproperty.com/customervalidation/1641391','_blank');"
		 * ,3);
		 * openNewTab("window.open(' http://onboarding.indiaproperty.com/customervalidation/1642084','_blank');"
		 * ,3);
		 * 
		 * //
		 * openNewTab("window.open(' http://onboarding.indiaproperty.com/customervalidation/1635296','_blank');"
		 * ,3); //
		 * openNewTab("window.open(' http://onboarding.indiaproperty.com/customervalidation/768072','_blank');"
		 * ,3);
		 * 
		 * // http://onboarding.indiaproperty.com/leads/1635296
		 * 
		 * 
		 * sysDate();
		 * 
		 * //onbTable("//a[@class='mediumtxt clr1']");
		 * 
		 * 
		 * onbTableFreshenq("//table[@id='freshleadlists']//following-sibling::tr/td//a[@class='mediumtxt clr1']"
		 * );
		 * 
		 * 
		 * onbTableDuplicateEnq("//table[@id='duplicateleadlists']//following-sibling::tr/td//a[@class='mediumtxt clr1']"
		 * );
		 * 
		 * onbTableCombined();
		 * 
		 * 
		 * 
		 * //onbTable("//table[@id='freshleadlists']//following-sibling::tr/td")
		 * ;
		 * 
		 * //onbTableDate("//a[@class='mediumtxt clr1']/following::td[7]");
		 * 
		 * onbTableDate(
		 * "//table[@id='freshleadlists']//following-sibling::tr/td[10]");
		 * 
		 * onbTableDateDuplicate(
		 * "//table[@id='duplicateleadlists']//following-sibling::tr/td[8]");
		 * 
		 * onbTableDateCombined();
		 * 
		 * //onbTableDate("//a[@href='javascript:;']/following::td[1]"); //
		 * onbTableDate("//a[@class='mediumtxt clr1']/following::td[6]");
		 * //a[@class='mediumtxt clr1']/following::td[6]
		 * 
		 * 
		 * //a[@class='mediumtxt clr1']/following::td/following::td[6]
		 * 
		 * //
		 * onbTableDateForRejectedLead("//a[@class='mediumtxt clr1']/following::td/following::td[6]"
		 * );
		 * 
		 * //onbTableDateCombine(); //a[@href='javascript:;']/following::td[1]
		 * leadValidation();
		 * 
		 * 
		 */

	}

}
