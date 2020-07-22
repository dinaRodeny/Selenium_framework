package Page;
import java.util.Locale;
import java.util.regex.Pattern;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class Faker_data 
{
	/*language for first uppercase->Happy scenario */
	Faker fakeData = new Faker(new Locale("ENG"));

	static /*language for the entire text field*/
	FakeValuesService fakeValuesService = new FakeValuesService( new Locale("en-GB"), new RandomService());
	

	/*
	 *Generate a random letter
	 * paramter in:N/A
	 * paramter output:String
	 */


	public String u8OneLetter_Lowercase()
	{
		return fakeValuesService.regexify("[a-z]");


	}

	/*
	 *Generate a random string 
	 * paramter in:N/A
	 * paramter output:String
	 */

	public String u8FirstLetterUpper(String language_upper)
	{
		/*language for first uppercase->Happy scenario: for example "ENG" */ 
		Faker fakeData = new Faker(new Locale(language_upper));
		return fakeData.name().firstName();	
	}


	/*
	 *Generate a random string that conatins special charater
	 * paramter in:N/A
	 * paramter output:String
	 */

	public String u8Opecialchar()
	{
		return fakeValuesService.regexify("[a-z0-9._%+-]+[a-z0-9.-]+\\@[a-z]{10,30}");



	}
	/*
	 *Generate a random string that conatins a valid email
	 * paramter in:N/A
	 * paramter output:String
	 */

	public String u8OneLetter_Email()
	{
		/*
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern1 = Pattern.compile(regex);
		return  pattern1.toString() ;
		 */
		return fakeData.internet().emailAddress();

	}

	/*
	 *Phone number start with 01 and 12 digits thus, it matches the phone numbers in egypt 
	 * paramter in:N/A
	 * paramter output:String
	 */
	public String Phoneno_start01()
	{

		return fakeValuesService.regexify("[0][1][1-9]{9}");
	}


	/*
	 *Generate a random number with a rondam digits
	 * paramter in:N/A
	 * paramter output:String
	 */
	public String fakePhoneno()
	{

		return	fakeValuesService.regexify("(?=\\d{10,11}$)0[128]\\d{8,9}");

	}




}
