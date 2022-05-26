package step1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessPOMTestForm {

				public static void main(String[] args) {
					System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.get("https://demoqa.com/automation-practice-form");
					
					POMClass pom=new POMClass(driver);
					
					pom.testform();
				}
	
	
}
