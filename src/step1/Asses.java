package step1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Learning\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium-apps.doselect.in/jquery-alertable/");
        driver.findElement(By.xpath("/html[1]/body[1]/button[5]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[2]/input[1]")).sendKeys("johndoe");
        driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[2]/input[2]")).sendKeys("foobar");
        driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[2]/label[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/button[2]")).click();
	}

}
