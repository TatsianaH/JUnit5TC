package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class WithoutPO extends Base {

	// private WebDriver driver;

	/*
	 * @BeforeAll static void setUpBeforeClass() throws Exception {
	 * WebDriverManager.chromedriver().setup(); }
	 */

	@BeforeEach
	void setUp() {

		driver = new ChromeDriver();// FirefoxDriver() можно тоже для другого браузера
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}

	@AfterEach
	void tearDown() {
		driver.quit();
	}

	@Test
	void loginLogout() {
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
// implicit wait		
		// driver.findElement(By.className("radius")).click();

// explicit wait		
//		WebElement button = driver.findElement(By.className("radius"));//explicit wait
//		clickElement(button);

//code refact		
		clickElement(By.className("radius"));

		WebElement confirmLogin = driver.findElement(By.id("flash"));
		assertTrue(confirmLogin.getText().contains("You logged into"));
		
		clickElement(By.cssSelector(".button.secondary.radius"));
		
		WebElement confirmLogout = driver.findElement(By.id("flash"));
		assertTrue(confirmLogout.getText().contains("You logged out"));
	}
	
	

}
