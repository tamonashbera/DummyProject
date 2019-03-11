package Academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public Properties prop;
	WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
	
	prop = new Properties();
	FileInputStream fis=new FileInputStream("//Users//Tamonash//Java Tutorial//DummyProject//src//main//java//Academy//data.properties");
	
	prop.load(fis);
	
	String browser=prop.getProperty("browser");
	
	driver = null;
	
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "//Users//Tamonash//Java Tutorial//DummyProject//src//main//java//Resources//chromedriver46");
		driver = new ChromeDriver();
	}
	
	else if (browser.equals("firefox")) {
		driver = new FirefoxDriver();
		
	}
	
	else if (browser.equals("IE")) {
		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
	
	}

}
