package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginP extends Base_HW {
	private static String URL = "https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login";

//elements	
	@FindBy(id = "txtUsername")
	private WebElement username;

	@FindBy(id = "txtPassword")
	private WebElement password;

	@FindBy(id = "btnLogin")
	private WebElement loginBtn;

	@FindBy(id = "logInPanelHeading")
	private WebElement confirmLogout;

	@FindBy(id = "spanMessage")
	private WebElement errorMessage;

//constructor
	public LoginP(WebDriver adriver) {
		driver = adriver;
	}

//services
	public static LoginP open(WebDriver driver) {
		driver.get(URL);
		return PageFactory.initElements(driver, LoginP.class);
	}

	public void submitLogin(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		clickElement(loginBtn);
	}

	public HomeP validLogin(String user, String pass) {
		submitLogin(user, pass);
		return PageFactory.initElements(driver, HomeP.class);
	}

	public LoginP invalidLogin(String user, String pass) {
		submitLogin(user, pass);
		return this;
	}

	public String getLogoutConfirmation() {
		return confirmLogout.getText();
	}

	public String getErrorMessage() {
		return errorMessage.getText();
	}

}
