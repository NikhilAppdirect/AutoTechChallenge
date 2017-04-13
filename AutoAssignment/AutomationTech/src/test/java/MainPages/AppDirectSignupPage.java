package MainPages;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageChecker.SignupChecker;
import Utility.ReadFileFromProperty;
import Utility.Reporterlogtest;

public class AppDirectSignupPage {
	
	WebDriver driver;
	Reporterlogtest log;
	Properties properties;
	WebElement signup_text;
	WebElement signup_submit;
	WebDriverWait wait;
	ReadFileFromProperty readproperty;
	
	public AppDirectSignupPage(WebDriver driver) throws IOException 
	{
		this.driver=driver;
		this.log=new Reporterlogtest();
		readproperty = new ReadFileFromProperty();
		properties=readproperty.propertyFile("SignupPage.properties");
	}
	
	 public SignupChecker verifySignUpTitle() throws IOException 
	 {
		 return new SignupChecker(this.driver);
	 }
	 
	 private String randomEmail() {
	        String s = "";
	        double d;
	        for (int i = 1; i <= 4; i++) {
	            d = Math.random() * 10;
	            s = s + ((int)d);     
	        }
			return "NikhilTech" + s + "@appdirect.com";	    
	 } 
	 
	 public SignUpStatus finalSignupButtonClick() throws IOException {
		
		 signup_text=driver.findElement(By.name(properties.getProperty("SignupPageText")));
		 signup_text.sendKeys(randomEmail());  
		 driver.findElement(By.name(properties.getProperty("SignupPageSubmit"))).click(); 
		 return new SignUpStatus(driver);
	 }
 }

