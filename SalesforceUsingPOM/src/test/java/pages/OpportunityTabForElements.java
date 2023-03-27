package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class OpportunityTabForElements extends BaseClass {

	public OpportunityTabForElements opportune() throws InterruptedException {

		driver.findElement(By.xpath("(//div[@class='tooltipTrigger tooltip-trigger uiTooltip']/div)[2]")).click();
		driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']/button")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(800);
		WebElement j = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", j);

		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
		WebElement opName = driver.findElement(By.xpath("(//input[@class='slds-input'])[4]"));
		opName.sendKeys("Buvaneswari Alappan from Test Leaf");
		Thread.sleep(800);


		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("03/27/2023");

		driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
		Thread.sleep(1200);

		driver.findElement(By.xpath("(//lightning-base-combobox-item[@class='slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain'])[4]")).click();

//		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();

		return this;


	}


}
