package pac;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.acttime.genericlib.Browser;
import com.acttime.genericlib.Constants;
import com.acttime.genericlib.WebDriverCommonLib;

public class SampleTest {
	
	
	@Test
	public void sampleTest() throws IOException{
		WebDriver driver = Browser.getBrowser();
		driver.get(Constants.url);

		
	}

}








