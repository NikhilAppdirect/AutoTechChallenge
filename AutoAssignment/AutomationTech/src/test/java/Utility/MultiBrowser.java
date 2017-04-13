package Utility;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import Exception.FileNotFound;
import MainPages.AppDirectHomePage;

public class MultiBrowser {

		WebDriver driver;
		Properties properties;
		ReadFileFromProperty readproperty;
		
		public MultiBrowser() throws IOException {
			
			readproperty = new ReadFileFromProperty();
			properties=readproperty.propertyFile("Setup.properties");
			String browserName=new BrowserChoice().BrowserSelection();
			
			if(browserName.equals("Chrome"))
			{	
				System.setProperty("webdriver.chrome.driver", "/Users/nikhil.gupta/Downloads/chromedriver/");
				driver =  new ChromeDriver();
			}
			else if(browserName.equals("firefox"))
			{	
				System.setProperty("webdriver.gecko.driver","geckodriver");
				driver = new FirefoxDriver();
			}
			else if(browserName.equals("Safari"))
			{
				driver = new SafariDriver();
			}
			driver.navigate().to(properties.getProperty("url"));
		}
		public AppDirectHomePage startbrowser() throws IOException, FileNotFound{
			driver.navigate().to(properties.getProperty("url"));
			
			return  new AppDirectHomePage(driver);
		}
		
}
