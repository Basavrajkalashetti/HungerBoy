package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobject.loginpage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Stepdef extends Baseclass{
	

	@Given("User Launch chrome browser")
	public void user_launch_chrome_browser() {
	
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		 lgn=new loginpage(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		
		driver.get(url);

	}

	@When("User enters Email as {emailadd} and Password as {pwd}")
	public void user_enters_email_as_and_password_as(String emailadd, String pwd) {
		
		lgn.enteremail(emailadd);
		lgn.password(pwd);
		

	}

	@When("click on Login")
	public void click_on_login() {
		lgn.clickonbutton();

	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		
	String actualTitle=driver.getTitle();
	if(actualTitle.equals(expectedTitle))
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	}

	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {

	}

	@Then("close browser")
	public void close_browser() {

	}




}
