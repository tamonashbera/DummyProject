package Academy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class validateNavigationBar extends Base{
	
		@BeforeClass
		public void initialize() throws IOException {
			driver = initializeDriver();
			
			driver.get(prop.getProperty("url"));
			
		} 

		@Test
		
		public void basePageNavigation( ) throws IOException {
			
			LandingPage lp = new LandingPage(driver);
			
			AssertJUnit.assertTrue(lp.getNavigationBar().isDisplayed());
			
		}
		
		
		@AfterClass
		public void tearDown() {
			driver.close();
		}
		


}
