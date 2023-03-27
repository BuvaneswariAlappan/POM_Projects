package pages;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class LoginPage  extends BaseClass
{

	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		return this;
	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		return this;
	}
	public  HomePage clickLoginButton() {
		driver.findElement(By.id("Login")).click();
		return  new HomePage();
	}

}
