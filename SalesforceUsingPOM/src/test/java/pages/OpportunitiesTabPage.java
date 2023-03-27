package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class OpportunitiesTabPage extends BaseClass {
	
	public OpportunitiesTabPage clickNewOpportunities_Button() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
		WebElement opName = driver.findElement(By.xpath("(//input[@class='slds-input'])[4]"));
		opName.sendKeys("Checking POM by Buvaneswari Alappan");
		Thread.sleep(800);


		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("03/27/2023");

		driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
		Thread.sleep(1200);

		driver.findElement(By.xpath("(//lightning-base-combobox-item[@class='slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain'])[4]")).click();

//		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		Thread.sleep(1000);
		return this;
	}

}
