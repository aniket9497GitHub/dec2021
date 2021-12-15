package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwitchTabCucumber 
{
	ChromeDriver driver;
	@Given("user open browser {string} with exe {string}")
	public void user_open_browser_with_exe(String string, String string2) 
	{
	    System.setProperty(string, string2);
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@Given("user enter url as {string}")
	public void user_enter_url_as(String string) 
	{
		driver.get("https://www.gmail.com");
	}

	@When("user click on help button")
	public void user_click_on_help_button() 
	{
		driver.findElement(By.xpath("//*[text()='Help']")).click();
	}

	@When("user switch to second tab")
	public void user_switch_to_second_tab() 
	{
		Set<String> all=driver.getWindowHandles();
		  Iterator<String> itr=all.iterator();
		  
		  itr.next();
		  String a=itr.next();
		  driver.switchTo().window(a);
	}

	@When("user click on Google Account button")
	public void user_click_on_google_account_button() 
	{
		 driver.findElement(By.xpath("//*[text()='Google Account']")).click();
	}

	@When("user switch on third tab")
	public void user_switch_on_third_tab() 
	{
		 Set<String> all1=driver.getWindowHandles();
		  Iterator<String> itr1=all1.iterator();
		  
		  itr1.next();
		  itr1.next();
		  String b=itr1.next();
		  driver.switchTo().window(b);
	}

	@Then("application shows focus on third tab of UI")
	public void application_shows_focus_on_third_tab_of_ui() 
	{
	   
	}
	
	
	
	
	
	
	
}
