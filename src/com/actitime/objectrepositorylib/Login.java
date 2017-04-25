package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.Browser;
import com.acttime.genericlib.Constants;
import com.acttime.genericlib.WebDriverCommonLib;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

public class Login extends WebDriverCommonLib{
	
	
	@FindBy(name="username")
	private WebElement userNAmeEdt;
	
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	/**
	 * login to application with admin credentails
	 */
	public void loginToAPP(){
		Browser.driver.get(Constants.url);
		waitForPageToLoad();
		userNAmeEdt.sendKeys(Constants.username);
		passwordEdt.sendKeys(Constants.password);
		loginBtn.click();
	}
	/**
	 * login to app with user defined credentials
	 * @param url
	 * @param userNAme
	 * @param PAssword
	 */
	public void loginToAPP(String url , String userNAme , String PAssword){
		Browser.driver.get(url);
		waitForPageToLoad();
		userNAmeEdt.sendKeys(userNAme);
		passwordEdt.sendKeys(PAssword);
		loginBtn.click();
	}

}
