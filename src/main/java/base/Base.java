package base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Base {
 
	
	public static WebDriver driver;
	public static Properties properties;
	public static Logger Logger;
	private String userDir = System.getProperty("user.dir");
	private String pathToProperty = "\\resources\\InputData\\projectProperty.properties";
	private String ppfile = userDir+pathToProperty;
	
	
	// create a constructor method for base class
public Base (){
	
	try {
	BufferedReader reader;
	
	reader = new BufferedReader(new FileReader(ppfile));
	properties = new Properties();
	
	try {
		properties.load(reader);
		reader.close();
	} catch (FileNotFoundException e) {
		  e.printStackTrace();
		
	}
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
		
	public static String getBrowserName() {
		
		String browserName = properties.getProperty("browser");
		return browserName;
	}
	public static String getURL() {
		String url = properties.getProperty("url");
		return url;
		
	}
	
	public static long getPageLoad() {
		String pageLoad = properties.getProperty("pagelaod");
		// java.lan.Long.parseLong
		return Long.parseLong(pageLoad);
	}
	public static long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("ImplicitlyWait");
		return Long.parseLong(implicitlyWait);
		
	}
	public static void initialize () {
		driver.get(getURL());
		
	}
	public static void tearDown () {
		driver.quit();
	}
	}

