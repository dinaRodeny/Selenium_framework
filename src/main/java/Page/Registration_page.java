package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularButtonText;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.ByAngularExactBinding;

/*
 * inherit from pageBase
 */
/*Angular functions
@ByAngularBinding.FindBy(..)
@ByAngularButtonText.FindBy(..)
@ByAngularButtonText.FindBy(..)
@ByAngularCssContainingText.FindBy(..)
@ByAngularExactBinding.FindBy(..)
@ByAngularModel.FindBy(..)
@ByAngularOptions.FindBy(..)
@ByAngularPartialButtonText.FindBy(..)
@ByAngularRepeater.FindBy(..)
@ByAngularRepeaterCell.FindBy(..)
@ByAngularRepeaterColumn.FindBy(..)
@ByAngularRepeaterRow.FindBy(..)
* */
public class Registration_page extends PageBase
{

	
	/************************************************************************************************************
	 *Create constructor:constructor's name is equivalent to class Name
	 *parameter:webdriver 
	 *Super keyword:because i inherited from PageBase class
	 ***********************************************************************************************************/

	public Registration_page(WebDriver driver)
	{
		super(driver);
		
	}
	
	/*************************************************************************************/
	/*  use annotation to initialize the pagefactory form  the inherited class(pageBase) */
	/*************************************************************************************/
	
	/* First Name annotation*/
	/*
     //@ByAngularModel.FindBy(rootSelector = "firstname", model = "First Name")
	//@ByAngularModel.FindBy(model = "First Name")
      @ByAngularCssContainingText.FindBy(cssSelector ="input[name='firstname']", searchText = "First Name")
	*/
	//@FindBy(how = How.NAME, using = "firstname")
	//@ByAngularCssContainingText.FindBy(cssSelector ="input[name='firstname']", searchText = "First Name")
	//@ByAngularButtonText.FindBy(buttonText = "First Name")
	//@ByAngularModel.FindBy(model = "text")
	//@ByAngularExactBinding.FindBy(exactBinding = "firstname")
	//@ByAngularModel.FindBy(model ="firstname")
	@FindBy(how = How.NAME, using = "firstname")
	WebElement fnTxtBox;
	
	/* Last Name annotation*/
	@FindBy(how = How.NAME, using = "lastname")
	WebElement lnTxtBox;
	
	/*Phone number annotation*/
	@FindBy(how = How.NAME, using = "phone")
	WebElement phoneTxtBox;
	
	/* Email annotation*/
	@FindBy(how = How.NAME, using = "email")
	WebElement emailTxtBox;
	
	
	/* password annotation*/
	@FindBy(how = How.NAME, using = "password")
	WebElement passwordTxtBox;
	
	
	/* confirm password annotation*/
	@FindBy(how = How.NAME, using = "confirmpassword")
	WebElement confirmpasswordpTxtBox;
	
	/* signup button*/
	@ByAngularButtonText.FindBy(buttonText = "Sign Up")
    WebElement registerBtn;


	
	
	@FindBy(xpath="/html/body/div/header/div[1]/div/div/div[2]/div/ul/li[3]/div/a")
	public WebElement dropdownList;
	
	
	@FindBy(xpath="/html/body/div/header/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]")
	public WebElement dropdownList01;
	
	@FindBy(xpath="/html/body/div/header/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]")
	public WebElement dropdownList02;

	
	/*public function -> so i can access it from another page*/
	public void userRegistration(String firstName,String lastName,String phoneNumber,String email,String password,String confirmPassword )
	{
		
		/*
		 *  Make code more readable:I will remove":fnTxtBox.sendKeys(firstName);
		 * send 2 parameters for setTextElementText:fnTxtBox and firstName
		 *setTextElementText this function is inherited from pageBase class 
		 */
		setTextElementText(fnTxtBox,firstName);

		/*
		 * Make code more readable:I will remove":lnTxtBox.sendKeys(lastName);
		 * send 2 parameters for setTextElementText:lnTxtBox and lastName
		 *setTextElementText this function is inherited from pageBase class 
		 */
		setTextElementText(lnTxtBox,lastName);
		/*
		 *  Make code more readable:I will remove":phoneTxtBox.sendKeys(phoneNumber);
		 * send 2 parameters for setTextElementText:phoneTxtBox and phoneNumber
		 *setTextElementText this function is inherited from pageBase class 
		 */
		setTextElementText(phoneTxtBox,phoneNumber);
		/*
		 *  Make code more readable:I will remove":emailTxtBox.sendKeys(email);
		 * send 2 parameters for setTextElementText:emailTxtBox and email
		 *setTextElementText this function is inherited from pageBase class 
		 */
		setTextElementText(emailTxtBox,email);
		/*
		 * Make code more readable:I will remove":phoneTxtBox.sendKeys(phoneNumber);
		 * send 2 parameters for setTextElementText:phoneTxtBox and phoneNumber
		 *setTextElementText this function is inherited from pageBase class 
		 */
		setTextElementText(passwordTxtBox,password);
		/*
		 * Make code more readable:I will remove":confirmpasswordpTxtBox.sendKeys(confirmPassword);
		 * send 2 parameters for setTextElementText:confirmpasswordpTxtBox and confirmPassword
		 *setTextElementText this function is inherited from pageBase class 
		 */
		setTextElementText(confirmpasswordpTxtBox,confirmPassword);
		
		/*
		 * Make code more readable:I will remove":registerBtnx.click();
		 * send 1 parameter forclickButton:registerBtn
		 *setTextElementText this function is inherited from pageBase class 
		 */
		clickButton(registerBtn);

			
	}
	/*
	 * drop down menu to go to My account page
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
	
	

}
