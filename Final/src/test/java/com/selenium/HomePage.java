package com.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
private String title  = "The Internet";

//elements

@FindBy(id = "flash")
private WebElement confirmLogin;

@FindBy(css = ".button.secondary.radius")
private WebElement buttonLogout;

//constructor

public HomePage(WebDriver adriver) {
	driver = adriver;
	assertEquals(title, driver.getTitle(), "This is not the Home Page");
}

//services

public LoginPage logout() {
	clickElement(buttonLogout);
	return PageFactory.initElements(driver, LoginPage.class);
}

public String getLoginConfirmation () {
	return confirmLogin.getText();
}

}
