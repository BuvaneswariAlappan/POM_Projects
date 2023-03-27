package pages;

import java.time.Duration;

import baseclass.BaseClass;

public class TaskTabPage extends BaseClass {
	
	public TaskTabPage clickTaskTab() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		return this;
	}

}
