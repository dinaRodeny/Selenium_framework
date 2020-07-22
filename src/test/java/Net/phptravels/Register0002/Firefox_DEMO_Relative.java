package Net.phptravels.Register0002;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_DEMO_Relative
{
	// Declaration for Title to check that we are in the register page
    public static String  Expected_Title ="Register";
	public static String  Actual_Title   = "";
    // Declaration for URLs
	public static String Expected_URL ="https://www.phptravels.net/register";
	public static String  Actual_URL  ="";
	public static String Firefox_Path=System.getProperty("user.dir")+ "\\STD_Types\\geckodriver.exe";
	
	public static void main(String[] args) 
	{
		
		// Declaration for the driver:Chrome
		System.setProperty("webdriver.gecko.driver",Firefox_Path);
		WebDriver driver =new FirefoxDriver();
    // open https://www.phptravels.net/register
		driver.navigate().to(Expected_URL);
		
   //Resize current window to the set  max. dimension
		driver.manage().window().maximize();
      
   // get the actual value of the title
		 Actual_Title  = driver.getTitle();
		
/*
* compare the actual Title of the page with the expected one and print
* the result as "Passed" or "Failed"
*/

 	     if ( Actual_Title .contentEquals(Expected_Title))
 	       {
 	           System.out.println("Passed_01!");
 	       } 
 	     else 
 	       {
 	           System.out.println("Failed_01");
 	       }
		
// get the actual value of the URL
		Actual_URL = driver.getCurrentUrl();			
//Expected_URL.replace("http://","").replace("http:// www.","").replace("","");

/*
* compare the actual URL of the page with the expected one and print
* the result as "Passed" or "Failed"
*/
 
	        if (Actual_URL.contentEquals(Expected_URL))
	        {
	            System.out.println("Passed_02!");
	        } 
	        else 
	        {
	            System.out.println("Failed_02");
	        }
	      //Refresh the page after finishing the test cases
	        driver.navigate().refresh();
	        driver.quit();
	        
	}

}
