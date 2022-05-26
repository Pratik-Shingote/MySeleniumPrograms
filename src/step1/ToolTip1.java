package step1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip1 {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions act=new Actions(driver);
		//act.moveToElement(driver.findElement(By.id("toolTipButton"))).perform();
		//String tooltext1=driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		//System.out.println("The tooltip1 text is: "+tooltext1);
		
		act.moveToElement(driver.findElement(By.id("toolTipTextField"))).perform();
		String tooltext2=driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		System.out.println("The tooltip2 text is: "+tooltext2);
	}

}
