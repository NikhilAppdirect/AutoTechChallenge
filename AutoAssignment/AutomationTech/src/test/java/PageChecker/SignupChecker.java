package PageChecker;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MainPages.AppDirectSignupPage;
import Utility.ReadFileFromProperty;
import Utility.Reporterlogtest;

public class SignupChecker {


	 WebDriver driver;
	 Reporterlogtest log;
	 Properties properties;
	 ReadFileFromProperty readproperty;

	 public SignupChecker(WebDriver driver) throws IOException {
		 this.driver = driver;
		 this.log=new Reporterlogtest();
			readproperty = new ReadFileFromProperty();
			properties=readproperty.propertyFile("SignupPage.properties");
	 }
	 
	public AppDirectSignupPage checktitle() throws IOException {
		 log.info("Verify If Appdirect SignUpPage Title is same as required or not");
	     Assert.assertEquals(driver.getTitle(), properties.getProperty("SignupPageTitle"));
		 return new AppDirectSignupPage(driver);
	 }
}
