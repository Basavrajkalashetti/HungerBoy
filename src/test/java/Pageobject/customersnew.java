package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class customersnew {
	
	WebDriver driver;
	
	public customersnew(WebDriver  rdriver)
	{
		driver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}

}

