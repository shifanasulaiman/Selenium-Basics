package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Main 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		List <WebElement> frameTag=driver.findElements(By.tagName("iframe"));
		int iframe=frameTag.size();
		System.out.println("Number of iFrame Tags:"+iframe);
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("frame1");
		WebElement frame_1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame_1);
		WebElement frame_heading=driver.findElement(By.id("sampleHeading"));
		String getFrameheading=frame_heading.getText();
		System.out.println(getFrameheading);
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
        driver.close();
	}

}
