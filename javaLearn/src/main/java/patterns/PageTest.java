package patterns;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {

	SingletonDriver instance;
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		instance = SingletonDriver.getInstance();
		driver = instance.getDriverInstance();
	}

	@Test
	public void test1() throws IOException {
		driver.get(instance.getPropsInstance().getUrl());
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
