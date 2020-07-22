package Tests;

import static org.testng.Assert.assertTrue;

import java.nio.channels.NetworkChannel;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.paulhammant.ngwebdriver.NgWebDriver;


public class TestBase
{
	/*
	 * static coz we need it to be attached to the class not to the method from it
	 * you don't have to do an instance 
	 * for example: Assume we have a class called "user" and contain object called webdriver
	 * without Static keyword:
	 * user x=new user();
	 * then  user.webdriver
	 * with static :user 
	 * user.webdriver->without doing an instance from class 
	 * */

	public static WebDriver driver;
	/*website ->driver gonna open it*/
	public String Expected_URL ="https://www.phptravels.net/register";
	/*Actual title in register page*/
	public String Actual_Title_Aftersignup="My Account";
	public String Expected_Title_Aftersignup="";

	 
	
	@BeforeSuite
	public void webdriver()
	{
		/**************************open the chrome driver**************************************************/
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\STD_Types\\chromedriver.exe");
		driver= new ChromeDriver();
	   JavascriptExecutor jsDriver =(JavascriptExecutor) driver;
	   NgWebDriver ngdriver =new NgWebDriver(jsDriver );

		/***************************Maximize the size of the window*****************************************/
		driver.manage().window().maximize();

		/**************************open https://www.phptravels.net/register*********************************/

		driver.get(Expected_URL);
		ngdriver.waitForAngularRequestsToFinish();
		
	}

	/*
	 * N.B:Use the annotation "@AfterClass" ->system will quick after the first page 
	 * thus,Driver will not run in all "java" classes (all classes inside the main file )
	 * :error gonna appear:Driver is not available in your  memory 
	 * Use the annotation:"@AfterSuite"
	 * 
	 * */
	@AfterSuite
	public void stopDRiver()
	{


		driver.quit();

	}
}
