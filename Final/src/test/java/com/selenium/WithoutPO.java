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

class WithoutPO extends Base{
	
	//private WebDriver driver;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();
}

	
	@BeforeEach
	void setUp() {

		driver = new ChromeDriver();// FirefoxDriver() можно тоже для другого браузера
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}

	@AfterEach
	void tearDown() {
		driver.quit();
	}

	@Test
	void test() {
		driver.findElement(By.id("username")).sendKeys("Tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		//driver.findElement(By.className("radius")).click();
		WebElement button = driver.findElement(By.className("radius"));//explicit wait
		clickElement(button);
	}

}
