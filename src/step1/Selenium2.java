package step1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.edubridgeindia.com/");
		String gt=driver.getTitle();
		System.out.println("The title of the webpage is: "+gt);
		String cu=driver.getCurrentUrl();
		System.out.println("The current URL is: "+cu);
		String ps=driver.getPageSource();
		System.out.println("The page source is: "+ps.length());
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().minimize();
		driver.quit();
	}

}
