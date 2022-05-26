package step1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMClass {

			WebDriver driver;
			
			public POMClass(WebDriver driver)
			{
				this.driver=driver;
			}
			
			By fname = By.id("firstName");
			By sname = By.id("lastName");
			By email = By.id("userEmail");
			
			public void testform()
			{
				driver.findElement(fname).sendKeys("Pratik");
				driver.findElement(sname).sendKeys("Shingote");
				driver.findElement(email).sendKeys("pratik.shingote@gmail.com");

			}
			
}
