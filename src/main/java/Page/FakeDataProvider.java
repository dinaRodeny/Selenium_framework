package Page;

public class FakeDataProvider extends Faker_data 
{
	/*First letter upper in the word-> language*/
	String language_FirstLetterCapital="ENG";
	
	
	/*choose the language and return the value to generate a ->word gonna start with capital letter. */
	public String u32FirstLetCapital =u8FirstLetterUpper( language_FirstLetterCapital);

	/*call the one lowerchar to generate a word with one lower case letter*/
	public String OneLowerChar       = u8OneLetter_Lowercase();
	public String u32Invalidphone    = fakePhoneno();
	public String u32Validphone      = Phoneno_start01();
	public String u32specialCharater = u8Opecialchar();
	public String u32validEmail      = u8OneLetter_Email();
	

}