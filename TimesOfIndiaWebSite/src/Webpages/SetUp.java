package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;


public class SetUp {

	private static WebDriver driver;	
	public static WebDriver SelectBrowser(String browsername, String url){
		
		switch(browsername){
		case "FireFox" :
				driver= new FirefoxDriver();
				driver.get(url);
				driver.manage().window().maximize();
				Reporter.log("Url is sccessfull Lunached in Firefox Browser ");
				
		case "IE": 
			DesiredCapabilities capabilities= DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			String driverpath="";
			System.setProperty("webdriver.ie.driver",driverpath);
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		
		
		return driver;
		
		
		
	}
}
