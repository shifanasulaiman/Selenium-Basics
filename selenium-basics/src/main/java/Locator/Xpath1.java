package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args)
	{
	
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement gender = driver.findElement(By.xpath("//input[@value='FeMale']")); // tagname[@attribute='value']
		gender.click();
		//driver.close();

	}

}
