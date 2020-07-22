package Tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page.AfterLogoutFromMyPage;
import Page.FakeDataProvider;
import Page.Homepage;
import Page.MyHomepage;
import Page.Registration_page;
import Page.loginPage;
/*
 * Test case Expected:full cycle with no failures 
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
 * Test case Steps:1.1-register my your name uniqque address phone number and id 
 *                1.2-go to my account page  check list are working correctly
 *                1.3-logout from My account page
 *                1.4-press a signup button 
 *                1.5signup again 
 * Test goal:to check system  are working correctly->(happy scenario)        
 * Inital state:None
 * */
	
public class UserRegistrationrReadFrom2Darray extends TestBase
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



	@DataProvider(name="testData")
	/*function to get the data from
	 * parameter in: void
	 *parameter out:return 2  dimension array*/

	public Object[][] userData()
	{

		return  new  Object[][]
				{
			{"dina","lol","0122377002","1n99992@hotmail.com","hell@ofmkdsm","hellofmkdsm"},
			{"dina","lol","0122377002","1s199927@hotmail.com","hellofmkdsm","hellofmkdsm"}
				};

	}

	/*test happy scenario for Registration page*/
	@Test(priority=1,alwaysRun = true,dataProvider="testData")
	public void  UserRegistrationSucessfully (String firtname,String lastName,   
			String phone,String email,String Password,String confirmPassword) 
					throws InterruptedException
	{



		//send the driver to constructor //
		signupObject     =new Registration_page(driver);
		myHomeObject     =new MyHomepage(driver);
		loginObject      =new loginPage(driver);
		afterlogoutObject=new AfterLogoutFromMyPage(driver);



		//call the function userRegistration to add values in the text field  //
		signupObject.userRegistration(firtname,lastName, phone ,email , "sjkfvjncD", "sjkfvjncD");
	//     Assert.assertTrue(signupObject.sucessSignup.getText().contains("profile"));
	     Expected_Title_Aftersignup = driver.getTitle();
		/* check that it redirects automatically to your profile page */
		//	Assert.assertEquals(Actual_Title_Aftersignup,Expected_Title_Aftersignup);

		Thread.sleep(1200);
		/*choose from list (My Account page)->the profile*/
		myHomeObject.Profile();
		/*choose from list(My Account page)-> the Booking*/
		myHomeObject.Booking();
		/*choose from list(My Account page)-> the Whislist*/
		myHomeObject.Whislist();
		/*choose from list (My Account page)->the NewsLetter*/
		myHomeObject.NewsLetter();
		/*choose from drop down menu ->MyAccountPage */
		myHomeObject.openMyAccountPage();
		/*choose from drop down menu ->Logout*/
		myHomeObject.userLogout();
		//afterlogoutObject.UserLogin("dinaDid@hotmail.com", "hellofmkdsm");
		afterlogoutObject.signup();
		//	afterlogoutObject.ForgetPassword();


		/*login again to check that login is working correctly*/
		//loginObject.UserLogin("dinaDid@hotmail.com", "hellofmkdsm");

	}
	/*
	/*
	 * My Account page is opening and working correctly then try to log out
	 * parameterin:void
	 * parameter out:void
	 * 
	@Test(dependsOnMethods= {"UserRegistrationSucessfully"})
	public void mypage()
	{

		myHomeObject   =new MyHomepage(driver);
		myHomeObject.Profile();
		myHomeObject.Booking();
		myHomeObject.Whislist();
		myHomeObject.NewsLetter();
		myHomeObject.openMyAccountPage();
		myHomeObject.userLogout();





	}*/
}
