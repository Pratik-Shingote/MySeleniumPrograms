package step1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sbi.co.in/");
		driver.findElement(By.xpath("//header/section[@id='navigation-bar']/div[1]/div[2]/nav[1]/div[3]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Savings Accounts')]")).click();
		driver.findElement(By.xpath("//body/div[@id='wrapper']/section[@id='content']/div[@id='main-content']/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//header/section[@id='navigation-bar']/div[1]/div[2]/nav[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/fieldset[1]/div[1]/div[1]/input[1]")).sendKeys("debit card");
		driver.findElement(By.xpath("//header/section[@id='navigation-bar']/div[1]/div[2]/nav[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/fieldset[1]/div[1]/div[2]/button[1]/span[1]")).click();
 
	}

}
