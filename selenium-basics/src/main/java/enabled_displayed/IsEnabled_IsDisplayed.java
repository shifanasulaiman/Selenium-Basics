package enabled_displayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_IsDisplayed 
{
public void verify_IsSelected()
{
	boolean isSelected;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	WebElement gender=driver.findElement(By.id("gender-female"));
	isSelected=gender.isSelected();
	System.out.println("Gender button before selected:"+isSelected);
	gender.click();
	isSelected=gender.isSelected();
	System.out.println("Gender button after selected:"+isSelected);
}
public void verify_isEnabled()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	WebElement sub_button=driver.findElement(By.id("newsletter-subscribe-button"));
	boolean sub_button_enabled=sub_button.isEnabled();
	System.out.println("Subscription button is enabled:"+sub_button_enabled);
	driver.close();
	
	
}
public void verify_isDisplayed()
{WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
WebElement vote_button=driver.findElement(By.id("vote-poll-1"));
boolean vote_button_displayed=vote_button.isDisplayed();
System.out.println("Vote button is displayed:"+vote_button_displayed);
driver.close();
	
}
public static void main(String args[])
{
	IsEnabled_IsDisplayed obj=new IsEnabled_IsDisplayed();
	//obj.verify_IsSelected();
	//obj.verify_isEnabled();
	obj.verify_isDisplayed();
}
}
