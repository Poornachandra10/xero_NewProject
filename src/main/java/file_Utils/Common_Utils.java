package file_Utils;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Wait_Constants;

public class Common_Utils {
public static void waitForElement(WebDriver driver, WebElement element) {
	
	WebDriverWait wait =new WebDriverWait(driver, Wait_Constants.WAIT_FOR_ELEMENT_TO_LOAD);
	wait.until(ExpectedConditions.elementToBeClickable(element));
	
}


}
