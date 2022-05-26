package step1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		String s=driver.findElement(By.xpath("//tbody/tr[5]/td[1]/font[1]")).getText();
		String st=driver.findElement(By.xpath("//b[contains(text(),'$213')]")).getText();
		System.out.println(s);
		System.out.println(st);
		
		driver.findElement(By.xpath("//a[@href='reservation.php']")).click();
		String str=driver.findElement(By.xpath("//b[text()='Passengers:']")).getText();
		System.out.println(str);
	}

}
