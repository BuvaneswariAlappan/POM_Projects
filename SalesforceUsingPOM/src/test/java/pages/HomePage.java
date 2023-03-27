package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class HomePage extends BaseClass {
	
	
	public HomePage nineDots_Click() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		 
		return this;
	}
	
	
	public SalesPage clickSales() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sales']")).click();
		
//		driver.findElement(By.xpath("//a[@href='/lightning/app/06m5g000003LaxBAAS']/div[@class='slds-size_small']")).click();
		return new SalesPage();  
	}
	
	
	
}
