package step1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		
		System.out.println("Title of the webpage1 :" +driver.getTitle());
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
		
		System.out.println("Title of the webpage2 :" +driver.getTitle());
	}
}
