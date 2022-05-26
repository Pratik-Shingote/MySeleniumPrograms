package step1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableLeafGroundProject {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		WebElement table=driver.findElement(By.xpath("//tbody"));
		
		
		List <WebElement> rows=table.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("No. of rows present in table : "+rows.size());
		
		
		List <WebElement> cols=table.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("No. of columns present in table : "+cols.size());
		
		
		List <WebElement> progress=driver.findElements(By.xpath("//tr[@class='even']/descendant::font"));
		
		for(WebElement progresslist:progress)
		{
			System.out.println(progresslist.getText());
		}
		
		
		WebElement checkbox=driver.findElement(By.name("vital"));
		checkbox.click();
		
		//System.out.println("Checkbox is selected: "+checkbox.isSelected());
		
		if(checkbox.isSelected())
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("PLEASE! Select the checkbox");
		}	
		
	}

}
