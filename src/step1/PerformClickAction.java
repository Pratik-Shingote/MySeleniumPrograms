package step1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformClickAction {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
		Actions action=new Actions(driver);   
		
		//Action performed for Double click button
		WebElement doubleclickbutton=driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(doubleclickbutton).perform();
		System.out.println("You have done a double click");
		
		/*driver.switchTo().alert().accept();
		System.out.println("Double click alert accepted");   */
		
		//Action performed for Double click button
		WebElement rightclickbutton=driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightclickbutton).perform();
		System.out.println("You have done a right click");
		/*driver.switchTo().alert().accept();
		System.out.println("Right click alert accepted");   */
		
		//Action performed for click button
		WebElement clickbutton=driver.findElement(By.xpath("//button[text()='Click Me']"));
		action.click(clickbutton).perform();
		System.out.println("You have done a dynamic click");
		
		
	}

}
