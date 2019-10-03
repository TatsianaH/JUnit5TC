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
	void searchEmployeeName() {
        HomeP homePage = LoginP.open(driver)
                                     .validLogin("opensourcecms", "opensourcecms");
        assertTrue(homePage.getLoginPageConfirmation().contains("Welcome"));

        FramePage framePage = homePage.switchFramePage()
                                      .searchEmployee("John Lennon");
        assertTrue(framePage.getSearchResult().contains("No Records Found"));

        framePage.logout();
        assertTrue(homePage.getLoginPageConfirmation().contains("Welcome"));

        LoginP loginPage = homePage.logout();
        assertTrue(loginPage.getLogoutConfirmation().contains("LOGIN Panel"));
    }
}
