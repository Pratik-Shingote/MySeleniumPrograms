package step1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.edubridgeindia.com/");
		
		WebElement gs=driver.findElement(By.linkText("Login"));
		System.out.println("Size of the window: "+driver.manage().window().getSize());
		
		Dimension dm=gs.getSize();
		Point po=gs.getLocation();
		
		System.out.println("Dimension of the element: "+dm);
		System.out.println("Exact location of the element(Point): "+po);
	}
	
}

