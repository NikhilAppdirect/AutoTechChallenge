package PageChecker;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import MainPages.AppDirectLoginPage;
import Utility.ReadFileFromProperty;
import Utility.Reporterlogtest;

public class LoginPageChecker {


	 WebDriver driver;
	 Reporterlogtest log;
	 Properties properties;
	 WebDriverWait wait;
	 ReadFileFromProperty readproperty;

	 public LoginPageChecker(WebDriver driver) throws IOException {
		 this.driver = driver;
		 this.log=new Reporterlogtest();
			readproperty = new ReadFileFromProperty();
			properties=readproperty.propertyFile("LoginPage.properties");
	 }
	 public LoginPageChecker waitVisibilityConditionByXpath() throws IOException{
	        wait = new WebDriverWait(driver, 20);
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("LoginPageSignUpButton"))));
	       return new LoginPageChecker(driver); 
	    }
	 
	 public AppDirectLoginPage checktitle() throws IOException {
		 log.info("Verify If Appdirect LogInPage Title is same as required or not");
		 wait = new WebDriverWait(driver, 20);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("LoginPageSignUpButton"))));
	      Assert.assertEquals(driver.getTitle(),properties.getProperty("LoginPageTitle"));
		 return new AppDirectLoginPage(driver);
	 }
	 
	 
	 
	 
}

