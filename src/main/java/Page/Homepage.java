package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends PageBase
{
	/************************************************************************************************************
	 *Create constructor:constructor's name is equivalent to class Name
	 *parameter:webdriver 
	 *Super keyword:because i inherited from PageBase class
	 ***********************************************************************************************************/
	public Homepage(WebDriver driver) 
	{
		super(driver);
		
	}

	/*
	 * Anything that is present on the web page is a WebElement such as text box, button,.. etc.
	 *  WebElement represents an HTML element
	
	
	@FindBy(css = "[type='button'][value='Next']")
	 WebElement button;
	
	@FindBy(linkText ="dropdown-item tr")
	WebElement RegisterLink;*/
	
	/* 
	 * Demo for using button with
	 *  use annotation to initialize the pagefactory form  the inherited class(pageBase) */
	@FindBy(xpath = "//*[@id=\"dropdownCurrency\"]")
	WebElement MyAccountdrl;
	
	
	
	public void RegisterPage()
	{
		
		select =new Select(MyAccountdrl);
		select.selectByVisibleText("Sign Up");
		
	}
	
}
