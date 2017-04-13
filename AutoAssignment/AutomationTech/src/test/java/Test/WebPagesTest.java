package Test;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import MainPages.AppDirectHomePage;
import MainPages.AppDirectLoginPage;
import MainPages.AppDirectSignupPage;
import MainPages.SignUpStatus;
import Utility.MultiBrowser;

public class WebPagesTest {

	Properties properties;
	AppDirectHomePage appdirecthomepage;
	AppDirectLoginPage appdirectloginpage;
	AppDirectSignupPage appdirectsignuppage;
	SignUpStatus signUpStatus;
	
	@BeforeTest
	public void initialization() throws Throwable {
		appdirecthomepage=new MultiBrowser().startbrowser();
	
	}
	
	@Test(priority=1)
	public void homepageTesting() throws Exception
	{	
		appdirectloginpage = appdirecthomepage
				.verifyHomePageTitle().checktitle()
				.loginButtonClick();
	}
	
	@Test(priority=2)
	public void loginpageTesting() throws Exception 
	{
		
		appdirectloginpage.verifyLoginTitle().waitVisibilityConditionByXpath().checktitle();
		appdirectloginpage.waitVisibilityConditionByXpath();
		appdirectsignuppage = appdirectloginpage
						.signuplinkButton();
				
				
	}
	@Test(priority=3)
	public void signuppagetesting() throws Exception 
	{	
		
		signUpStatus=appdirectsignuppage.verifySignUpTitle().checktitle().finalSignupButtonClick();		
		
	}
		
		
		@Test(priority=4)
		public void finalSignUpSuccess() throws IOException 
		{		
			signUpStatus.verifyValidEmailId();
		}
		
		@Test(dependsOnMethods ="finalSignUpSuccess")
		public void finalSignUpfailure() throws IOException
		{
			signUpStatus.verifyInvalidEmail();
		}
	
	}
	
	


