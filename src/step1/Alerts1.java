package step1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//For accept the Alert 
		driver.findElement(By.cssSelector("#alertButton")).click();
		driver.switchTo().alert().accept();
		
		//For Cancel the Alert
		driver.findElement(By.cssSelector("#confirmButton")).click();
		Alert al1=driver.switchTo().alert();
		al1.dismiss();
		
		//For wait to alert get active then accept the Alert
		driver.findElement(By.cssSelector("#timerAlertButton")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al2=driver.switchTo().alert();
		al2.accept();
		
		//For type the text in Alert text box and accept the Alert
		driver.findElement(By.cssSelector("#promtButton")).click();
		Alert s1=driver.switchTo().alert();
		s1.sendKeys("My Name Is PRATIK");
		String str=s1.getText();
		System.out.println("Alert text is: "+str);
		s1.accept();
		
		driver.close();
	}

}

