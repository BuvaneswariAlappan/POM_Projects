package testcases_Runner;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.LoginPage;

public class TC_004_ClickContractTab extends BaseClass {
	
	@Test(groups="Sanity")
	public void LoginPageData() throws InterruptedException {
		LoginPage lp = new LoginPage();
		lp.enterUserName().enterPassword().clickLoginButton()
		.nineDots_Click()		
		.clickSales()
		.clickContractsTab();

}
}
