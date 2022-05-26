package step1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		System.out.println("Title of the webpage: "+driver.getTitle());
		driver.findElement(By.id("firstName")).sendKeys("Pratik");
		driver.findElement(By.id("lastName")).sendKeys("Shingote");
		driver.findElement(By.id("userEmail")).sendKeys("pratik.shingote@gmail.com");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9922204181");
		driver.findElement(By.xpath("//label[text()='Sports']")).click();
		driver.findElement(By.xpath("//label[text()='Music']")).click();
		WebElement s=driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
		s.click();
		Select se=new Select(s);
		se.selectByIndex(1);
		
	}

}
