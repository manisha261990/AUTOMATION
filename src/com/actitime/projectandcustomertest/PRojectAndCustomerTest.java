package com.actitime.projectandcustomertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.objectrepositorylib.ActiveCustomerAndProject;
import com.actitime.objectrepositorylib.Common;
import com.actitime.objectrepositorylib.CreateNEwCustomer;
import com.actitime.objectrepositorylib.HomePAge;
import com.actitime.objectrepositorylib.Login;
import com.acttime.genericlib.Browser;
import com.acttime.genericlib.ExcelLib;


/**
 * 
 * @author deepak
 *
 */
@Listeners(com.acttime.genericlib.SampleList.class)
public class PRojectAndCustomerTest {
	/*create object generic classes */
	ExcelLib elib;
	WebDriver driver;
    Login loginPage;
    Common comPage;
    HomePAge homeP;
    ActiveCustomerAndProject activePage;
    CreateNEwCustomer createNewCurPage;
	@BeforeClass
	public void configBeforeclass(){
		   elib = new ExcelLib();
	   /*launch browser*/
		   Reporter.log("launch browser");
		
		   driver = Browser.getBrowser();
		  loginPage = PageFactory.initElements(driver, Login.class);
		  comPage = PageFactory.initElements(driver, Common.class);
		 homeP = PageFactory.initElements(driver, HomePAge.class);
		 activePage = PageFactory.initElements(driver, ActiveCustomerAndProject.class);
		 createNewCurPage = PageFactory.initElements(driver, CreateNEwCustomer.class);
	}
	
	@BeforeMethod
	public void configBeforeMtd(){
         /* step 1 : login to APP */
		Reporter.log("login to application");/* INSTEAD OF SOP USE REPORT.LOG */
		loginPage.loginToAPP();
	}
	
	
	
	@Test
	public void createCustomerTest() throws Throwable{
    /*read data */
		Reporter.log("read data");
		String customerNAme  = elib.getExcelData("Sheet1", 1, 2);
		String expMsg  = elib.getExcelData("Sheet1", 1, 3);		

   /* step 2 : navigate to PRoject & customer */
		Reporter.log("navigate to PRoject & customer ");
		homeP.navigateToPRojectAndCustomerPage();
    /*step 3 : navigate to Active Project & customer page */
		Reporter.log("navigate to Active Project & customer page");
		activePage.navigateToCreateNewCustomerPage();
	/*step 4 : create customer */
		Reporter.log("create customer");
		createNewCurPage.createCustomer(customerNAme);
	/*step 5 : verify customer */
		Reporter.log("verify customer");
		String actMsg = activePage.getCustomerSucMsg().getText();
		boolean status = actMsg.contains(expMsg);
		Assert.assertTrue(status);
			
	}
	
	
	@Test
	public void modifyCustomerTest() throws Throwable{
		 /*read data */
		String customerNAme  = elib.getExcelData("Sheet1", 2, 2);
		String expMsg  = elib.getExcelData("Sheet1", 2, 3);
		
		      /*step 2 : navigate to PRoject & customer */
				Reporter.log("navigate to PRoject & customer ");
				homeP.navigateToPRojectAndCustomerPage();
		    /*step 3 : navigate to Active Project & customer page*/ 
				Reporter.log("navigate to Active Project & customer page");
				activePage.navigateToCreateNewCustomerPage();
			/*step 4 : create customer */
				Reporter.log("create customer");
				createNewCurPage.createCustomer(customerNAme);
			/*step 5 : verify customer */
	
	}
	
	@AfterMethod
	public void configAfterMtd(){
		/*step 6 : logout */
		comPage.logout();
	}
	
	@AfterClass
	public void afterclass(){
		driver.quit();
	}
	


}
