package com.qa.TestExcecution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.createDriver;
import com.qa.pages.login;

public class loginTest {


WebDriver driver;
	
	
	@BeforeMethod
	public void launch() {
		
		createDriver a= new createDriver();
		driver = a.generateDriver();
		
	}
	
	@Test
	
	public void tc_01 () throws Exception {
		
				
			login s= new login(driver);
		    s.myAccount();
			s.loginEmail("jawad123@gmail.com");
			s.loginPass("Jawad123");
			s.loginSubmit();
			
	
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
	}
	
	
	
	
	
	
	
	
}
