package Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase 
{

	protected WebDriver driver;
	public Select  select;
	/************************************************************************************************************
	 *Create constructor:constructor's name is equivalent to class Name
	 *parameter:webdriver 
	 ***********************************************************************************************************/
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver,this);

	}
	
	

/*
 * Protected ->thus no one can access outside the page package 
 * Static -> i can access without  doing an object from a class ,coz,
 * Static is a method that belongs to a class rather than an instance of a class
 * Use in Button ->code be more readeable 
 * Paramter in:WebElement Button
 * Paramter out: Void
 */
	protected static void clickButton(WebElement Button)
	{

		Button.click();
	}
	/*
	 * Protected ->thus no one can access outside the page package 
	 * Static -> i can access without  doing an object from a class ,coz,
	 * Static is a method that belongs to a class rather than an instance of a class
	 * Use in textfield->more readable 
	 * Paramter in:WebElement textElement ,String ValueAddedInText
	 * Paramter out: Void
	 */
	protected static void setTextElementText(WebElement textElement ,String ValueAddedInText)
	{
		 textElement.sendKeys(ValueAddedInText);

	}
	
	/*this function gonna select from the list 
	 * parameter in: list and value of the index
	 * parameter out:void
	 */
	protected static void chooseFromlist( List<WebElement> MyList,int index)
	{
		
		
			MyList.get(index).click();
	}

	

/*
 * Protected ->thus no one can access outside the page package 
 * Static -> i can access without  doing an object from a class ,coz,
 * Static is a method that belongs to a class rather than an instance of a class
 * Paramter in:WebElement Button
 * Paramter out: Void
 */
	protected static void checkBox(WebElement Button)
	{

		if(!(Button.isSelected()))
		{
			Button.click();
		}
		
	}
}
