package objects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;
	
	protected Properties prop;
	
	
	public WebDriver initialize() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Prerna Pandey\\eclipse-workspace\\CartCucum\\resources\\data.properties");
		
		prop = new Properties();
		
		prop.load(fis);
		
		if(prop.getProperty("browser").contains("chrome")) {
			
			String value=prop.getProperty("webdriver.chrome.driver");
			
			System.setProperty("webdriver.chrome.driver", value);
			
			driver=new ChromeDriver();
			
		//	driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
			
		}
		
		return driver;
	}
	
}
