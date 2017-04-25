package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePAge {
	
	@FindBy(linkText="Projects & Customers")
	private WebElement projectAndCustLnk;
	
	@FindBy(linkText="Reports")
	private WebElement reportLnk;
	
	@FindBy(linkText="Users")
	private WebElement userLnk;
	
	
	public void navigateToPRojectAndCustomerPage(){
		projectAndCustLnk.click();
	}
	public void navigateToReportPage(){
		reportLnk.click();
	}
	public void navigateToUserPage(){
		userLnk.click();
	}
}
