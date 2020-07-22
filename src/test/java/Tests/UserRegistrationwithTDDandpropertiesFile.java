package Tests;

import org.testng.annotations.Test;
import Data.LoadProperties;
import Page.AfterLogoutFromMyPage;
import Page.FakeDataProvider;
import Page.Homepage;
import Page.MyHomepage;
import Page.Registration_page;
import Page.loginPage;

/*
 * Test case Expected:the system should not accept that firstname and lastname  start with lowercase letter
 * Test case Scenario:Positive scenario.
 * Test case version(ID for this testcase):("phptravels_0002_Register")
 * Test case requirement(JIRA's artifact(ID)):
 * code version:
 * Increment(current build Id from Jenkins) :
 * Test case allocation: "Register_Page"
 * Variant:"phptravels"
 * Test case Date:14 JUL. 2020
 * Test case regression:NO
 * Test case author: DEL
 * Test case goal:to check that the firstname and lastname must start with capital letter and not the same 
 * Inital state:None
 * */
public class UserRegistrationwithTDDandpropertiesFile extends TestBase
{

	/*

	/***************call method from testbases function:global ;thus;the entire function can call it******************************************************/
	/*Declare -> Home_page   */
	Homepage          homeObject;
	/* Declare -> reg. page  */
	Registration_page signupObject; 
	/*Declare -> My account page*/
	MyHomepage        myHomeObject;
	/*Declare ->FakeDataProvider */
	FakeDataProvider  fake_Data1;
	/*Declare ->Login */
	loginPage loginObject;

	AfterLogoutFromMyPage afterlogoutObject;


	String firtname=LoadProperties.userData.getProperty("firtname");
	String lastName=LoadProperties.userData.getProperty("lastName");
	String phone=LoadProperties.userData.getProperty("phone");
	String email=LoadProperties.userData.getProperty("email");
	String password=LoadProperties.userData.getProperty("password");
	String confirmpassword=LoadProperties.userData.getProperty("confirmPassword");


	@Test()
	public  void UserRegistrationSucessfully()
	{
		//send the driver to constructor //
		signupObject     =new Registration_page(driver);
		myHomeObject     =new MyHomepage(driver);
		loginObject      =new loginPage(driver);
		//call the function userRegistration to add v
	
		signupObject.userRegistration(firtname,lastName, phone ,email , password, confirmpassword);
		//Assert.assertTrue(signupObject.sucessSignup.getText().contains("profile"));


	}

}
