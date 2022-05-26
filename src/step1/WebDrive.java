package step1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.gecko.driver","D:\\Selenium Learning\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		
		System.setProperty("webdriver.edge.driver","D:\\Selenium Learning\\edgedriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.edubridgeindia.com/");
	}

}
