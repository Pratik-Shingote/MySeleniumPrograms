package step1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testhtmlform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/BCA/Software%20Testing%20Notes/HTML%20Assignments/Attendence%20Report.html");
		
		driver.findElement(By.id("fst")).sendKeys("Pratik");
		driver.findElement(By.id("lst")).sendKeys("Shingote");
		
		driver.findElement(By.id("p")).click();
		
		driver.findElement(By.id("att")).click();
		driver.findElement(By.id("res")).click();
		
		WebElement s=driver.findElement(By.id("cl"));
		
		Select sel=new Select(s);
		sel.selectByIndex(0);
		sel.selectByIndex(2);
					
	}

}

