package step1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		driver.manage().window().maximize();
		
		/*Select drop=new Select(driver.findElement(By.id("mySelect")));
		drop.selectByIndex(2);*/
		
		WebElement drop=driver.findElement(By.id("mySelect"));
		Select dropaccess=new Select(drop);
		dropaccess.selectByVisibleText("Set to 50%");
		System.out.println(drop.getText());
		//dropaccess.selectByValue("100%");
		
	}
}
