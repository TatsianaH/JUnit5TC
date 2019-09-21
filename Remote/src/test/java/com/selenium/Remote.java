package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

class Remote {
private RemoteWebDriver driver;

@BeforeEach
void setUp() throws MalformedURLException {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setBrowserName("chrome");
	driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), capabilities);
	//127.0.0.1 local ip address for each computer by default, localhost:4444 enter to address bar
	
	driver.manage().window().maximize();	
}
@AfterEach
void tearDown() throws Exception {
	driver.quit();
}

@Test
	void test() {
		driver.get("http://book.theautomatedtester.co.uk/");
		assertTrue(driver.getTitle().contains("Selenium"));
	}

}
