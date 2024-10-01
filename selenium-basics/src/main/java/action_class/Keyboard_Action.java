package action_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Action 
{
 public void verify_Keyboard_Event() throws AWTException
 {
	 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		Robot keyboard=new Robot();
		keyboard.keyPress(KeyEvent.VK_CONTROL);
		keyboard.keyPress(KeyEvent.VK_T);
		keyboard.keyRelease(KeyEvent.VK_CONTROL);
		keyboard.keyRelease(KeyEvent.VK_T);
		driver.close();
		
 }
	public static void main(String[] args) throws AWTException 
	{
		Keyboard_Action obj=new Keyboard_Action();
		obj.verify_Keyboard_Event();
		

	}

}
