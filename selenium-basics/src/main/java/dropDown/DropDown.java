package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(dropdown1);
		select.selectByIndex(2);
		WebElement dropdown2=driver.findElement(By.id("dropdowm-menu-2"));
		Select select1=new Select(dropdown2);
		select1.selectByValue("maven");
		WebElement dropdown3=driver.findElement(By.id("dropdowm-menu-3"));
		Select select2=new Select(dropdown3);
		select2.selectByVisibleText("CSS");
		driver.close();

	}
}
