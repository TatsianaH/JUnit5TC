package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginP extends Base_HW{
	private static String URL = "https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login";
	//private String title = "https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login";
	
	
	@FindBy(id = "txtUsername")
	private WebElement username;

	@FindBy(id = "txtPassword")
	private WebElement password;

	@FindBy(id = "btnLogin")
	private WebElement loginBtn;
	
	public static LoginP open(WebDriver driver) {
		driver.get(URL);
		return PageFactory.initElements(driver, LoginP.class);
	}
	
	/*public LoginPage (WebDriver adriver) {
		adriver = driver;
		assertEquals(title, driver.getTitle(), "This is not a Home page");
		
	}*/
	
	public void submitLogin(String user, String pass) {
	username.sendKeys(user);
	password.sendKeys(pass);
	loginBtn.click();
	}
	
	public HomeP validLogin(String user, String pass) throws Exception {
		submitLogin(user, pass);
		return PageFactory.initElements(driver, HomeP.class);
		
	}
	
	public String getConfirmation() {
		return loginBtn.getText();
	}
}
