package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage extends Base_HW {
	
	private String title = "OrangeHRM";
	
	@FindBy(id = "empsearch_employee_name_empName")
	private WebElement employeeName;
	@FindBy(id = "searchBtn")
	private WebElement searchBtn;
	@FindBy(tagName = "td")
	private WebElement record;
	
	public FramePage(WebDriver adriver) {
        driver = adriver;
        assertEquals(title, driver.getTitle(), "This is not the Frame Page");
    }
	
	 public HomeP logout() {
	        driver.switchTo().defaultContent();
	        return PageFactory.initElements(driver, HomeP.class);
	    }
	 public void search(String name) {
	        employeeName.sendKeys(name);
	        clickElement(searchBtn);
	    }

	    public FramePage searchEmployee (String name) {
	        search(name);
	        return this;
	    }

	    public String getSearchResult() {
	        return record.getText();
	    }

}
