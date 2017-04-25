package com.acttime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	public static WebDriver driver;
	
	public static WebDriver getBrowser(){
			if(Constants.browserNAme.equals("chrome")){
			  System.setProperty("webdriver.chrome.driver", 
			    		                         "C:\\sJar\\chromedriver.exe");
			       driver = new ChromeDriver();		       
			}else if(Constants.browserNAme.equals("firefox")){
				  driver = new FirefoxDriver();			  
			}else if(Constants.browserNAme.equals("ie")){
			
				   System.setProperty("webdriver.ie.driver", 
						                       "C:\\sJar\\IEDriverServer.exe");
				   driver = new InternetExplorerDriver();
			}
	return driver;
	}
}







