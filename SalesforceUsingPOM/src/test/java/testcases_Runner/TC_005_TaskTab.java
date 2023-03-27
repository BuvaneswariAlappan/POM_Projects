package testcases_Runner;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.LoginPage;


public class TC_005_TaskTab extends BaseClass {
	@Test(groups="Smoke")
	public void clickTaskTabTestCases() throws InterruptedException {
		LoginPage lp = new  LoginPage();
		lp.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.nineDots_Click()	
		.clickSales()
		.clickTaskTab();
		
		
	}
	

}
