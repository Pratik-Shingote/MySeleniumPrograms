package step1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		
		driver.findElement(By.id("checkBox1")).click();
		
		WebElement drop1=driver.findElement(By.id("drop1"));
		WebElement drop2=driver.findElement(By.id("drop2"));
		WebElement logo=driver.findElement(By.id("logo"));
		
		Actions act=new Actions(driver);
		act.click(logo).perform();
		act.dragAndDrop(logo,drop1).perform();
		act.dragAndDrop(logo,drop2).perform();
	}

}
                     //not executing