package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNEwCustomer {

	
	@FindBy(name="name")
	private WebElement custNAmeEdt;
	
	@FindBy(name="description")
	private WebElement custDec;
	
	@FindBy(xpath="//input[@value='Create Customer']")
	private WebElement createCustBtn;
	
	public void createCustomer(String customerNAme){
		custNAmeEdt.sendKeys(customerNAme);
		createCustBtn.click();
		
	}
	public void createCustomer(String customerNAme, String description){
		custNAmeEdt.sendKeys(customerNAme);
		custDec.sendKeys(description);
		createCustBtn.click();
		
	}
	
	
}
