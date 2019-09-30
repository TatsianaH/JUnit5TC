package com.selenium;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class WithPO_HW {
	private WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() throws Exception {
		HomeP homePage = LoginP.open(driver).validLogin("opensourcecms", "opensourcecms");
		
		assertEquals("No Records Found", homePage.getRecordText("John Lennon"));
		
		assertEquals("Logout", homePage.getLoginConfirmation());
		LoginP loginPage = homePage.logout();
		assertEquals("LOGIN", loginPage.getConfirmation());
	

}
}
