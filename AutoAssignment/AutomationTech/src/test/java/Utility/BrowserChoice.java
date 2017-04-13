package Utility;

import java.io.IOException;
import java.util.Properties;

public class BrowserChoice {
	
	
			public String BrowserSelection() throws IOException {
			        
			        String browser = System.getProperty("browser");
			        
			        ReadFileFromProperty read = new ReadFileFromProperty();
			        Properties pr = read.propertyFile("Setup.properties");
			        
			        if(browser == null) {
			            browser = pr.getProperty("browser");
			        }
			        return browser;
			    }
}
