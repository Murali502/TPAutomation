package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import CoreBasics.initialization;

public class Verify_create_flow_Export implements initialization {
static ExtentReports report;
static ExtentTest logger;
	
	
	public static void Create ()
	{
		WebDriver webdriver=obj.setChrome();
		try {
			report=ExtentManager.Instance();
		}
		
	}
}
