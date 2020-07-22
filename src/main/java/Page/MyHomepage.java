package Page;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class MyHomepage extends PageBase
{

	/************************************************************************************************************
	 *Create constructor:constructor's name is equivalent to class Name
	 *parameter:webdriver :Driver
	 *Super keyword:because i inherited from PageBase class
	 **********************************************************************************************************/
	public  MyHomepage(WebDriver driver)
	{
		super(driver);
		
	}

	@FindBy(xpath="/html/body/div/header/div[1]/div/div/div[2]/div/ul/li[3]/div/a")
	public WebElement dropdownList;
	
	
	@FindBy(xpath="/html/body/div/header/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]")
	public WebElement dropdownList01;
	
	@FindBy(xpath="/html/body/div/header/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]")
	public WebElement dropdownList02;

	
	@FindAll({
	    @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[1]/a"),
	    @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"),
	    @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[3]/a"),
	    @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[4]/a")
	})
	private List<WebElement> MyHomeList;


	/* drop down menu to go to My account page
	 * Paramter in: void
	 * paramter out: void
	 */
	 
	public void openMyAccountPage()
	{
		clickButton(dropdownList);
		clickButton(dropdownList01);
	
	
	}
	
	/*
	 * drop down menu to go to Logout page
	 * Paramter in: void
	 * paramter out: void
	 */
	 
	public void userLogout() 
	{
		
		clickButton(dropdownList);
		clickButton(dropdownList02);
			
	}
	/*
	 * List menu to go to my profile page
	 * Paramter in: void
	 * paramter out: void
	 */
	 
	public void Booking()
	{
		chooseFromlist(MyHomeList,0);
	}
	
	public void Profile()
	{
		chooseFromlist(MyHomeList,1);
	}
	
	public void Whislist()
	{
		chooseFromlist(MyHomeList,2);
	}
	public void NewsLetter()
	{
		chooseFromlist(MyHomeList,3);
	}
	
}
