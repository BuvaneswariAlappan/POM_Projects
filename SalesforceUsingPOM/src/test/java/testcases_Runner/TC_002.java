package testcases_Runner;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.LoginPage;
import pages.OpportunityTabForElements;

public class TC_002 extends BaseClass {

	@Test(groups="Sanity")
	public void LoginPageData() throws InterruptedException {
		LoginPage lp = new LoginPage();
		OpportunityTabForElements opObj = new OpportunityTabForElements();
		lp.enterUserName().enterPassword().clickLoginButton();
		opObj.opportune();
}
}
