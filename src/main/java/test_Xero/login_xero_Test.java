package test_Xero;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.login_xeroPage;



public class login_xero_Test extends BaseTest{
	protected static Logger logger = LogManager.getLogger("");
	
	
	
	@Test
	public void LoginTestCase() {
		WebDriver driver=BaseTest.getDriver();
		login_xeroPage LP=new login_xeroPage(driver);
		Assert.assertTrue(LP.launchApp(driver, "https://www.xero.com/us/"));
	//	test.info("launched");
		
		logger.debug("launched");
	
	}










































}
