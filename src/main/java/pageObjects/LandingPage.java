package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By login = By.xpath("//span[contains(text(),\"Login\")]");
	
	By navigationBar = By.xpath("//ul[@class=\"nav navbar-nav navbar-right\"]");
	
	
	public WebElement getLogin() {
		return driver.findElement(login);
		
	}
	
	public WebElement getNavigationBar() {
		return driver.findElement(navigationBar);
		
	}

}
