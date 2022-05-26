package step1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClearTripProject {

	public static void main(String[] args){
		 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		
		driver.findElement(By.xpath("//p[text()='Round trip']")).click();
		WebElement from=driver.findElement(By.xpath("//*[contains(@class,'null')]"));
 		from.click();
 		from.sendKeys("Chennai");
 		WebElement chennai=driver.findElement(By.xpath("//p[contains(text(),'Chennai')]"));
 		//from.sendKeys("Mumbai");
 		//WebElement mumbai=driver.findElement(By.xpath("//p[contains(text(),'Mumbai')]"));
 		
 		Actions act=new Actions(driver);
 		act.moveToElement(chennai).perform();
 		chennai.click();
 		//act.moveToElement(mumbai).perform();
 		//mumbai.click();
 		
 		
 		WebElement to=driver.findElement(By.cssSelector("input[class$='8']"));
 		to.click();
 		to.sendKeys("New York");
 		WebElement newyork=driver.findElement(By.xpath("//p[contains(text(),'New York')]"));
 		act.moveToElement(newyork).perform();
 		newyork.click();
 		
 		
 		driver.findElement(By.cssSelector("div[class*='col-13'] button:nth-child(2)")).click();
 		List<WebElement>date=driver.findElements(By.xpath("//div[contains(text(),'31')]"));
 		
 		for(int i=0; i<date.size(); i++)
 		{
 			String text=date.get(i).getText();
 			if(text.equals("31"))
 			{
 				date.get(i).click();
 				break;
 			}
 		}
 		
 		
 		WebElement adults=driver.findElement(By.cssSelector("div[class='mb-4'] select[class$='5']"));
 		Select dropdown1=new Select(adults);
 		dropdown1.selectByVisibleText("2");
 		
 		WebElement children=driver.findElement(By.xpath("//div[3]//div[1]//select[1]"));
 		Select dropdown2=new Select(children);
 		dropdown2.selectByVisibleText("1");
 		
 		WebElement infants=driver.findElement(By.xpath("//div[5]//div[1]//select[1]"));
 		Select dropdown3=new Select(infants);
 		dropdown3.selectByVisibleText("1");
 		
 		driver.findElement(By.xpath("//strong[text()='More options:']")).click();
 		
 		WebElement classoftravel=driver.findElement(By.cssSelector("select[class*='default-select bc-neutral-100 bg-transparent pl-2']"));
 		Select dropdown4=new Select(classoftravel);
 		dropdown4.selectByValue("Premium Economy");
 		
 		WebElement textfiled=driver.findElement(By.xpath("//input[@placeholder='Airline name']"));
 		textfiled.click();
 		textfiled.sendKeys("Emirates");
 		WebElement emirates=driver.findElement(By.xpath("//p[text()='Emirates (EK)']"));
 		act.moveToElement(emirates).perform();
 		emirates.click();
 		
 		driver.findElement(By.xpath("//button[text()='Search flights']")).click();
 		
 			
	}

}
