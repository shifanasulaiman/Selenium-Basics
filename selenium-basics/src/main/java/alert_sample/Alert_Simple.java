package alert_sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Simple 
{
   public void verify_SimpleAlert()
   {
	   WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement simpleAlert=driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleAlert.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
   }
   public void confirm_Alert()
   {
	   WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement confirm_Alert=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirm_Alert.click();
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert text is:"+alert.getText());
		alert.accept();
		
   }
	public static void main(String[] args) 
	{
		Alert_Simple obj=new Alert_Simple();
		//obj.verify_SimpleAlert();
		obj.confirm_Alert();

	}

}
