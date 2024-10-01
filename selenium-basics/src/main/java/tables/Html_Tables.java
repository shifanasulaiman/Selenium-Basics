package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_Tables {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices/nse");
		WebElement showmore=driver.findElement(By.id("showMoreLess"));
        showmore.click();
        //get the full table:
        WebElement table_data=driver.findElement(By.xpath("//table[@id='dataTable']"));
        System.out.println(table_data.getText());
        WebElement single_row=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));  // from the table fetch one row
        System.out.println(single_row.getText());
        List <WebElement> row=table_data.findElements(By.tagName("tr"));
        int rowCount=row.size();
        for(int i=0;i<rowCount;i++)
        {
        	List <WebElement> column=row.get(i).findElements(By.tagName("td"));
        	int columncount=column.size();
        	for(int j=0;j<columncount;j++)
        	{
        		String celldata=column.get(j).getText();
        		if(celldata.equals("NIFTY BANK"))
        		{
        			System.out.println("Last thread is : "+column.get(1).getText());
        		}
        		
        	}
        }
        driver.close();
        
	}
}

