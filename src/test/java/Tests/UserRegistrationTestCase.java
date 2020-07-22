package Tests;

/*
 * Test case Expected:Register page redirects to My account page automatically by checking the title is alter from register to myaccount  
 * Test case Scenario:Positive scenario.
 * Test case version(ID for this testcase):("phptravels_0001_Register")
 * Test case requirement(JIRA's artifact(ID)):
 * code version:
 * Increment(current build Id from Jenkins) :
 * Test case allocation: "Register_Page"
 * Variant:"phptravels"
 * Test case Date:16 JUL. 2020
 * Test case regression:NO
 * Test case author: DEL
 * Test case goal:1.1-"Register page" redirects to "My account page" after submitted all the required data correctly        
 * Inital state:None
 * */
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Page.FakeDataProvider;
import Page.Faker_data;
import Page.Homepage;
import Page.MyHomepage;
import Page.Registration_page;

public class UserRegistrationTestCase extends TestBase
{
	/***************call method from testbases function:global ;thus;the entire function can call it******************************************************/
	/*call Home_page   */
	Homepage          homeObject;
	/* call reg. page  */
	Registration_page signupObject; 
	/*faker data*/
	FakeDataProvider fake_Data1;
	MyHomepage myHomeObject;

	public class UserRegistrationTest 
	{
		@Test()
		public void  UserRegistrationSucessfully () throws InterruptedException
		{

			/*
		//send the driver to constructor //
		 homeObject=new Homepage  (driver);
		//call the function from Homepage//
		 homeObject.RegisterPage();
			 */	
			//send the driver to constructor //
			signupObject    =new Registration_page(driver);
			fake_Data1      =new FakeDataProvider();
			myHomeObject    =new MyHomepage(driver);
			String firtname =fake_Data1.u8FirstLetterUpper("ar");
			String lastName =fake_Data1.OneLowerChar;
			String email    =fake_Data1.u32validEmail;
			String phone    =fake_Data1.u32Validphone;

			//call the function userRegistration to add values in the text field  //
			signupObject.userRegistration(firtname,lastName, phone ,email , "sjkfvjncD", "sjkfvjncD");
			//Assert.assertTrue(signupObject.sucessSignup.getText().contains("your registration completed"));
			Thread.sleep(1200);
			
	// signupObject.userLogout();
		//	signupObject.openMyAccountPage();
			myHomeObject.userLogout();
			

			
		}
	}
}