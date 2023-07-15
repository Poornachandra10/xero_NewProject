package test_Xero;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.File_Constants;
import file_Utils.Properties_files_Utils;
import pages.login_xeroPage;

public class login_xero_Test extends BaseTest {
	protected static Logger logger = LogManager.getLogger("");

	@Test
	public void Navigate_to_XERO_Testcase_01() throws IOException {
		WebDriver driver = BaseTest.getDriver();
		
		login_xeroPage LP= new login_xeroPage(driver);
		
		Assert.assertTrue(LP.launchApp(driver, "https://login.xero.com/identity/user/login"));
		
		
		//test.info("launched xero application");
		logger.debug("launched xero application");
		
//		LP.pressLoginFirstPage(driver);
//
//		logger.debug("press login button to proceedto login page");
		
		LP.enterUserName(driver, Properties_files_Utils.readListData(File_Constants.LOGIN_DETAILS_FILE_PATH, "xero.userName"));
	   
		logger.debug("entering user name");
		
		LP.enterPassWord(driver,Properties_files_Utils.readListData(File_Constants.LOGIN_DETAILS_FILE_PATH, "xero.passWord"));

		logger.debug("entering password");
		
		LP.pressLoginButton(driver);
		
		logger.debug("clicked login");
	}

}
