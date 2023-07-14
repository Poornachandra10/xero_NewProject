package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class login_xeroPage {

	public login_xeroPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
//@FindBy()
//public WebElement ;
	
	
	public boolean launchApp(WebDriver driver, String sURL) {
	boolean isAppLaunched=false;
	driver.get(sURL);
	String actualURL=driver.getCurrentUrl();
	
	if(actualURL.equals(sURL)) {
		isAppLaunched=true;
	}
	return isAppLaunched;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
