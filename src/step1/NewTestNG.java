package step1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestNG {
	
			@Test
			public void f() 
			{
				System.out.println("Welcome to TestNG");
			}
			
			@BeforeTest
			public void c()
			{
				System.out.println("Executes Before Test");
			}
			
			@AfterTest
			public void d()
			{
				System.out.println("Executes After Test");
			}
		}
