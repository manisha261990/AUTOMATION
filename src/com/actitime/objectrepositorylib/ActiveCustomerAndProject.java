package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveCustomerAndProject {

	
	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//input[@value='Create New Project']")
	private WebElement createProjectBtn;
	
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement customerSucMsg;
	
	
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getCustomerSucMsg() {
		return customerSucMsg;
	}

	public void navigateToCreateNewCustomerPage(){
		createCustomerBtn.click();
	}
	
	public void navigateToCreateNewProjectPage(){
		createProjectBtn.click();
	}
	
	
}
