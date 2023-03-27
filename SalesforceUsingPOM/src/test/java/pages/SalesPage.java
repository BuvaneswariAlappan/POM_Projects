package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class SalesPage extends BaseClass {


	public OpportunitiesTabPage clickOpportunities() throws InterruptedException { 

		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1)) ;
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", opp);
		return new OpportunitiesTabPage(); 
	}

	public LeadsTabPage clickLeadsTab() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1)) ; 
		WebElement leads = driver.findElement(By.xpath("//span[text()='Leads']"));
		driver.executeScript("arguments[0].click();", leads);		
		return new LeadsTabPage(); 
	}
	public ContractTabPage clickContractsTab() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1)) ; 
		WebElement contracts = driver.findElement(By.xpath("//a[@href='/lightning/o/Contract/home']/span[@class='slds-truncate']"));
		driver.executeScript("arguments[0].click();", contracts);		
		return new ContractTabPage(); 
	}

	public TaskTabPage clickTaskTab() {
		WebElement clickTask = driver.findElement(By.xpath("//a[@href='/lightning/o/Task/home']/span[@class='slds-truncate']"));
		driver.executeScript("arguments[0].click();", clickTask);
		return new TaskTabPage();

	}

}
