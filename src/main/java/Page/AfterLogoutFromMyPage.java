package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterLogoutFromMyPage extends loginPage
{
	/************************************************************************************************************
	 *Create constructor:constructor's name is equivalent to class Name
	 *parameter:webdriver 
	 *Super keyword:because i inherited from PageBase class
	 ***********************************************************************************************************/

	public AfterLogoutFromMyPage (WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(xpath="/html/body/div/div[1]/section/div/div[1]/div[2]/form/div[4]/div[1]/a" )
	WebElement SignupBtn;
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div[1]/div[2]/form/div[4]/div[3]/a" )
	WebElement ForgetPasswordBtn;
	
	
	
	public void signup()
	{
		
		clickButton(SignupBtn);
		
	}
	
	public void ForgetPassword()
	{
		
		clickButton(ForgetPasswordBtn);
		
	}

	
}
	
	
	


