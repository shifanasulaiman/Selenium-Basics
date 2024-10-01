package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.tagName("textarea"));
		search.sendKeys("Java");
		WebElement aboutfield = driver.findElement(By.linkText("About"));
		aboutfield.click();
		WebElement storetext = driver.findElement(By.partialLinkText("Sto"));
		storetext.click();
		WebElement searchbar = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
		searchbar.sendKeys("Selenium");
		//driver.close();
	}

}
