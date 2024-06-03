package patterns;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingletonDriver {

	private static SingletonDriver driverInstance = null;
	private WebDriver driver;
	private ConfigurationReader conRead;
	
	private SingletonDriver() {
		
	}
	
	public WebDriver getDriverInstance() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	public ConfigurationReader getPropsInstance() throws IOException {
		
		conRead = new ConfigurationReader();
		return conRead;
	}
	
	public static SingletonDriver getInstance() {
		
		if(driverInstance == null) {
			synchronized (SingletonDriver.class) {
				if(driverInstance == null) {
					driverInstance = new SingletonDriver();
				}
			}
			
		}
		return driverInstance;
	}
}
