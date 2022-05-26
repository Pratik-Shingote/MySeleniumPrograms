package step1;

import java.time.Duration;

//import java.util.concurrent.TimeUnit;       //import file for TimeUnit old syntax

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	//Previously this syntax used in selenium 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   /*Updated syntax selenium 4 & above verison, it will execute when 
																				any one element takes time to finding the location*/
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("identifierId")).sendKeys("pratik.shingote@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	}

}
