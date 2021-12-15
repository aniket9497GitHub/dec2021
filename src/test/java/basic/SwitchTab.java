package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTab 
{
  public static void main(String[]args)
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\PerfectLearn\\Automation Support\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  //openApp
	  driver.get("https://www.gmail.com");
	  //click on help
	  driver.findElement(By.xpath("//*[text()='Help']")).click();
	  //switch on 2nd tab
	  Set<String> all=driver.getWindowHandles();
	  Iterator<String> itr=all.iterator();
	  
	  itr.next();
	  String a=itr.next();
	  driver.switchTo().window(a);
	  //click on google account
	  driver.findElement(By.xpath("//*[text()='Google Account']")).click();
	  //switch on 3rd tab
	  Set<String> all1=driver.getWindowHandles();
	  Iterator<String> itr1=all1.iterator();
	  
	  itr1.next();
	  itr1.next();
	  String b=itr1.next();
	  driver.switchTo().window(b);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
