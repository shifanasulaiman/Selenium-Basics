package webelement_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Commands {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register"); //demo site
		WebElement gender=driver.findElement(By.id("gender-female"));
		gender.click();
		WebElement firstname=driver.findElement(By.id("FirstName"));
        firstname.sendKeys("shifana");
        WebElement lastname = driver.findElement(By.id("LastName"));
		lastname.sendKeys("sulaiman");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("shifa@gmail.com");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("123456");
		WebElement compassword = driver.findElement(By.id("ConfirmPassword"));
		compassword.sendKeys("123456");
		WebElement button= driver.findElement(By.id("register-button"));
		button.click();
		WebElement firstname1=driver.findElement(By.id("FirstName"));
		firstname1.clear(); // clear the value
		String firstname2=driver.findElement(By.id("FirstName")).getAttribute("class");
		System.out.println(firstname2);
		WebElement sub_button=driver.findElement(By.id("newsletter-subscribe-button"));
		System.out.println(sub_button.getCssValue("display")); 
		System.out.println(sub_button.getSize());
		WebElement search=driver.findElement(By.id("small-searchterms"));
		System.out.println(search.getTagName());
		WebElement conpass=driver.findElement(By.xpath("//label[@for='ConfirmPassword']"));
		System.out.println(conpass.getText());
		driver.close();
    
	}

}
