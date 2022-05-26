package step1;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IWait {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  // previously it is used in selenium 3
		
		driver.findElement(By.linkText("Signin")).click();
		driver.quit();
	}

}
