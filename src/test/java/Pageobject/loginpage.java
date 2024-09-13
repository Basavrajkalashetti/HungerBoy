package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
WebDriver ldriver;	

public loginpage(WebDriver rDriver)
{
	ldriver=rDriver;
	
	PageFactory.initElements(rDriver, this);
}

@FindBy(id="Email")
WebElement email;
@FindBy(id="password")WebElement password;
@FindBy(xpath="//button[@class='button-1 login-button']")WebElement loginbtn;

public void enteremail(String emailadd)
{
	email.sendKeys(emailadd);
	
}

public void password(String pwd)
{
	password.sendKeys(pwd);
}

public void clickonbutton()
{
	loginbtn.click();
}

}
