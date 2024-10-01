package multiple_window_handling;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window_Handling {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
        String parentWindow_handle=driver.getWindowHandle();
        System.out.println("Parent window handle ID:"+parentWindow_handle);
        WebElement clickLink=driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickLink.click();
        Set <String> window_handles=driver.getWindowHandles();
        System.out.println("Windoe handle ID's are:"+window_handles);
        Iterator <String> window_Handle_iterator=window_handles.iterator();
        while(window_Handle_iterator.hasNext())
        {
        	String currentWindowHandleId=window_Handle_iterator.next();
        	if(!currentWindowHandleId.equals(parentWindow_handle))
        	{
        		driver.switchTo().window(currentWindowHandleId);
        		WebElement emailID=driver.findElement(By.xpath("//input[@name='emailid']"));
        		emailID.sendKeys("shifana@gmail.com");
        		WebElement submit=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        		submit.click();
        		//driver.switchTo().defaultContent();
        	}
        }
        driver.quit();
	}

}
