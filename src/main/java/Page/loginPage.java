package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage extends PageBase
{
	/************************************************************************************************************
	 *Create constructor:constructor's name is equivalent to class Name
	 *parameter:webdriver 
	 *Super keyword:because i inherited from PageBase class
	 ***********************************************************************************************************/

	public loginPage(WebDriver driver)
	{
		super(driver);
		
	}
		@FindBy(xpath= "/html/body/div/div[1]/section/div/div[1]/div[2]/form/button")
		WebElement emailTxtBox ; 

		@FindBy(how = How.NAME, using ="password" )
		WebElement passwordTxtBox ; 
		
		@FindBy(xpath="/html/body/div/div[1]/section/div/div[1]/div[2]/form/div[3]/div[3]/label" )
		WebElement RemembermeCheckBox ; 

		@FindBy(xpath="/html/body/div/div[1]/section/div/div[1]/div[2]/form/button")
		WebElement loginBtn ; 
		
		public void UserLogin(String email , String password) 
		{
			setTextElementText(emailTxtBox, email);
			setTextElementText(passwordTxtBox, password);
			checkBox          (RemembermeCheckBox);
			clickButton       (loginBtn);
		}
}
