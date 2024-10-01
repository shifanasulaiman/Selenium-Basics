package action_class;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import webDriver_Browser.Chromedriver;

public class Mouse_Action 
{
	public void verify_RightClick()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions action=new Actions(driver);
		action.contextClick(rightclick).build().perform();
		//driver.close();
	}
	public void verify_mouseover()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");
		WebElement item=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		Actions mouseover=new Actions(driver);
		mouseover.moveToElement(item).build().perform();
	}
	public void drag_drop()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();	
				
	}
	public void verify_dragdropUsing_OffSet()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");
		WebElement dragFiled=driver.findElement(By.id("dragBox"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(dragFiled, 100, 150).build().perform();
     }

	public static void main(String[] args) 
	{
		Mouse_Action obj=new Mouse_Action();
		//obj.verify_RightClick();
		//obj.verify_mouseover();
		//obj.drag_drop();
		obj.verify_dragdropUsing_OffSet();

	}

}
