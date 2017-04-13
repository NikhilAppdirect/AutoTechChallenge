package MainPages;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.ReadFileFromProperty;
import Utility.Reporterlogtest;


public class SignUpStatus {
	WebDriver driver;
	Properties properties;
	WebElement element;
	WebDriverWait wait;
	Reporterlogtest log;
	ReadFileFromProperty readproperty;
	SignUpStatus signUpStatus;
	
	public SignUpStatus(WebDriver driver) throws IOException{
			this.driver=driver;		
			readproperty = new ReadFileFromProperty();
			properties=readproperty.propertyFile("SignupPage.properties");
		
	}
	
	public void verifyValidEmailId() throws IOException
		 {
		wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(properties.getProperty("SignUpStatusClass"))));
		        element = driver.findElement(By.cssSelector(properties.getProperty("SignUpStatusClass")));
		        Assert.assertTrue(element.isDisplayed());
				Reporter.log("Signup successfully Executed...Check your mail for Further processor");
		
		 }
	

	public void verifyInvalidEmail(){
			
			
			driver.navigate().back();
			driver.findElement(By.xpath(properties.getProperty("LoginPageSignUpButton"))).click();
			 driver.findElement(By.xpath(properties.getProperty("reSignUp"))).sendKeys(properties.getProperty("regEmail"));
		    driver.findElement(By.xpath("//*[@id='id14']")).click();
		    Reporter.log("Entered Email-id is Already Registered..!!");
	}
	}



