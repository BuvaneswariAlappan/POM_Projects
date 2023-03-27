package pages;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class ConfirmRedirect_Page extends BaseClass {
	
	public CreateAndPublishMobileAppPage clickConfirmRedirectPage_ConfirmButton() {
		driver.findElement(By.xpath("//button[@onclick='goAhead()']")).click();
		return new CreateAndPublishMobileAppPage();
	}

	public void clickConfirmRedirectPage_CancelButton() {
		driver.findElement(By.xpath("//button[@onclick='cancel()']")).click();
		driver.close();
	}

}
