package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshots
{
	private WebDriver driver;

	@BeforeEach
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void getScreenshotOfVisibleArea() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), 
				new File("VisibleArea.png"));
	}
	
	@Test
	public void getScreenshotOfEntireArea() throws IOException
	{
		Screenshot entirePage = new AShot()
				.shootingStrategy(ShootingStrategies.viewportPasting(1000)) // scroll 1000 milliseconds
				.takeScreenshot(driver);
		ImageIO.write(entirePage.getImage(), "png", new File("EntireArea.png"));
	}
	
	@AfterEach
	public void tearDown()
	{
		driver.quit();
	}
}