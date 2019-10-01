package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeP extends Base_HW {
	private String title = "OrangeHRM";

	// elements
	@FindBy(id = "empsearch_employee_name_empName")
	private WebElement employeeName;
	@FindBy(id = "searchBtn")
	private WebElement searchBtn;
	@FindBy(tagName = "td")
	private WebElement record;
	@FindBy(xpath = "//div[@id='option-menu-bar']//li[3]//a[1]")
	private WebElement logoutLink;

//constructor
	public HomeP(WebDriver adriver) {
		adriver = driver;
		assertEquals(title, driver.getTitle(), "This is not a Home page");
	}

//services	
	public void enterName(String name) throws Exception {
		//clickElement(element);
		employeeName.sendKeys(name);
		searchBtn.click();
	}

	public String getRecordText(String name) throws Exception {

		enterName( name);
		return record.getText();
	}

	public String getLoginConfirmation() {
		return logoutLink.getText();
	}

	public LoginP logout() {
		logoutLink.click();
		return PageFactory.initElements(driver, LoginP.class);
	}

}
