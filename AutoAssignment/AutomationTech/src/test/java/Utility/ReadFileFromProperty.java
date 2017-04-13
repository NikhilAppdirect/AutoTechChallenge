package Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFileFromProperty {
	
	Properties properties;
   public Properties propertyFile(String fileName) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fileInput = new FileInputStream(new File(fileName));
        Properties properties = new Properties();
        properties.load(fileInput);
        return properties;
	}
	}


