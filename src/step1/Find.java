package step1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.edubridgeindia.com/");
		
		List <WebElement> anchor=driver.findElements(By.tagName("a"));
		int total=anchor.size();
		System.out.println("The no of hyperlinks: "+total);
		
		List <WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("The total no of images: "+images.size());
		
		if(total<100)
		{
			System.out.println("Test case = Pass");
		}
		else
		{
			System.out.println("Test case = Fail");
		}
		
		for(WebElement i:anchor)
		{
			String tl=i.getText();
			System.out.println("The text of the link is: "+tl);
		}
		
		driver.findElement(By.partialLinkText("Exp")).click();
	}

}
