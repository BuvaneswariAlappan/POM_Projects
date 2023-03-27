package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class LeadsTabPage extends BaseClass {
	
	public LeadsTabPage clickNewLeadButton() throws InterruptedException {
		
		WebElement clickNewLeadButton = driver.findElement(By.xpath("//div[text()='New' and @title='New']"));
		clickNewLeadButton.click();
		WebElement nameSalutation = driver.findElement(By.xpath("//button[@name='salutation']"));
		nameSalutation.sendKeys("Ms");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Buvi");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Alappan");
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("ABcd");
//		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
			
		return this; 
	}
	
	public LeadsTabPage clickCloseButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon slds-modal__close closeIcon slds-button_icon-bare slds-button_icon-inverse']/lightning-primitive-icon[1]")).click();
		return this;
	}
	
	public ContractTabPage clickContractsTab() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1)) ; 
		WebElement contracts = driver.findElement(By.xpath("//a[@href='/lightning/o/Contract/home']/span[@class='slds-truncate']"));
		driver.executeScript("arguments[0].click();", contracts);		
		return new ContractTabPage(); 
	}
	
	
	
	
}
