package step1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ErailProject {

	public static void main(String[] args) {
		  
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		Actions act=new Actions(driver);
		
		WebElement from=driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		from.click();
		from.clear();
		from.sendKeys("Pune Jn");
		act.moveToElement(from).perform();
		driver.findElement(By.xpath("//div[@title='Pune Jn']//div[1]")).click();
		
		
		WebElement to=driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		to.click();
		to.clear();
		to.sendKeys("Delhi");
		act.moveToElement(to).perform();
		driver.findElement(By.xpath("//div[@title='Delhi']//div[1]")).click();
		
		driver.findElement(By.id("buttonFromTo")).click();
		
		List <WebElement> trainnames=driver.findElements(By.xpath("//td[@style=';']"));
		
		for(WebElement trainlist:trainnames)
		{
			System.out.println(trainlist.getText());
		}
		
	}
}
