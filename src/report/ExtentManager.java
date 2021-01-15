package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import CoreBasics.initialization;

public class ExtentManager implements initialization {

private static ExtentReports extent;
public static String Reportname;
public static String Reportpath;

public static ExtentReports Instance()
{
if(extent==null)
createInstance("./testreport/TestReport.html");
return extent;
}
	
public static ExtentReports createInstance(String filename)
{
	Reportpath=filename;
	ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(filename);
	
	return extent;
}
}
