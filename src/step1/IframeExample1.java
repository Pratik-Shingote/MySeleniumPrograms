package step1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample1 {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/PRATIK/OneDrive/Desktop/iFrames.html");
		
		System.out.println("Title of the webpage is :"+driver.getTitle());
		
		List<WebElement>noofiframes=driver.findElements(By.tagName("iframe"));
		System.out.println("No of iFrames present in webpage are: "+noofiframes.size());
		
		//driver.switchTo().frame(0);             //by index value
		driver.switchTo().frame("form");
		driver.findElement(By.id("fst")).sendKeys("Pratik");
		driver.findElement(By.name("last-name")).sendKeys("Shingote");
		
		driver.switchTo().defaultContent();
		
		//String text1=driver.findElement(By.tagName("h2")).getText();
		//System.out.println("Header of the webpage is: "+text1);
		
		WebElement text=driver.findElement(By.tagName("h2"));
		System.out.println("Header of the webpage is: "+text.getText());
		
		driver.switchTo().frame(1);
		WebElement tabletext=driver.findElement(By.tagName("th"));
		System.out.println("Table text is: "+tabletext.getText());
			
	}
	
}
