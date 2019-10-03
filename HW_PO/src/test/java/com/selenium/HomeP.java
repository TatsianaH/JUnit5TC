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
	 @FindBy(id = "option-menu")
	    private WebElement confirmLogin;

	    @FindBy(id = "rightMenu")
	    private WebElement iframe;

	    @FindBy(xpath = "//a[contains(text(),'Logout')]")
	    private WebElement logoutButton;

	    //constructor
	    public HomeP(WebDriver adriver) {
	        driver = adriver;
	        assertEquals(title, driver.getTitle(), "This is not the Home Page");
	    }

	    //services
	    public LoginP logout() {
	        clickElement(logoutButton);
	        return PageFactory.initElements(driver, LoginP.class);
	    }

	    public FramePage switchFramePage() {
	        driver.switchTo().frame(iframe);
	        return PageFactory.initElements(driver, FramePage.class);
	    }

	    public String getLoginPageConfirmation(){
	        return confirmLogin.getText();
	    }


}
