package CoreBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ObjectUtilities {

	
public WebDriver setChrome()
{
System.setProperty("", "");
ChromeOptions options =new ChromeOptions();
options.setExperimentalOption("useAutomationExtension", false);
WebDriver webdriver=new ChromeDriver(options);
return webdriver;
}
}
