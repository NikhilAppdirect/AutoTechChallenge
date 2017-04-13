package PageChecker;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Exception.FileNotFound;
import MainPages.AppDirectHomePage;
import Utility.ReadFileFromProperty;
import Utility.Reporterlogtest;

public class HomePageChecker {

	 WebDriver driver;
	 Reporterlogtest log;
	 Properties properties;
	 ReadFileFromProperty readproperty;

	 public HomePageChecker(WebDriver driver) throws IOException {
		 this.driver = driver;
		 this.log=new Reporterlogtest();
			readproperty = new ReadFileFromProperty();
			properties=readproperty.propertyFile("HomePage.properties");
	 }
	 
	 public AppDirectHomePage checktitle() throws IOException, FileNotFound {
		 log.info("Verify If Appdirect HomePage Title is same as required or not");
	     Assert.assertEquals(driver.getTitle(), properties.getProperty("HomePageTitle"));
		 return new AppDirectHomePage(driver); 
		 
	 }
}

