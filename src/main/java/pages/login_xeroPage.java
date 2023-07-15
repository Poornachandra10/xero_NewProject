package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import file_Utils.Common_Utils;

public class login_xeroPage {

	public login_xeroPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Log in']")
	public WebElement loginFirstPage;

	@FindBy(xpath = "//*[@id='xl-form-email']")
	public WebElement userName;

	@FindBy(xpath = "//*[@id='xl-form-password']")
	public WebElement password;

	@FindBy(xpath = "//*[@id='xl-form-submit']")
	public WebElement Login;

	@FindBy(xpath = "//*[@id=\"xl-form\"]/ul/li[1]/a")
	public WebElement forgetPassword;

	@FindBy(xpath = "//*[@id='Email']")
	public WebElement forgetPasswordEmail;

	@FindBy(xpath = "//*[@id='submit-reset-password']")
	public WebElement forgetPasswordLinkButton;

	@FindBy(xpath="//*[@id=\"stepper-inline-standard-panel\"]/div/div[1]/button[2]")
	public WebElement clickNotNow;

	// @FindBy()
	// public WebElement ;
	
	
	public void pressLoginFirstPage(WebDriver driver) {
		Common_Utils.waitForElement(driver, loginFirstPage);
		if(loginFirstPage.isDisplayed()) {
			loginFirstPage.click();
		}else {
			System.out.println("login button is not visible");
		}
	}

	/**
	 * @param driver
	 * @param sURL
	 * passing the xero website url and running in chrome browser
	 * @return
	 */
	public boolean launchApp(WebDriver driver, String sURL) {
		boolean isAppLaunched = false;
		driver.get(sURL);
		String actualURL = driver.getCurrentUrl();

		if (actualURL.equals(sURL)) {
			System.out.println("XERO Application launched");
			isAppLaunched = true;
		}
		return isAppLaunched;
	}
	
	
	
	/**
	 * @param driver
	 * @param username
	 * passing username 
	 */
	public void enterUserName(WebDriver driver, String username) {
		Common_Utils.waitForElement(driver, userName);
		if(userName.isDisplayed()) {
			userName.clear();
			
			userName.sendKeys(username);
			}else {
				System.out.println("UserName WebElement is not visible");
			}
		
	}
	
	/**
	 * @param driver
	 * @param pass
	 * passing the password
	 */
	public void enterPassWord(WebDriver driver, String pass) {
		Common_Utils.waitForElement(driver, password);
		if(password.isDisplayed()) {
			password.clear();
			
			password.sendKeys(pass);
		}else {
			System.out.println("Password WebElement is not visible");
		}
	}
	
	/**
	 * @param driver
	 * click the login button
	 */
	public void pressLoginButton(WebDriver driver) {
		Common_Utils.waitForElement(driver, Login);
		if(Login.isDisplayed()) {
			Login.click();
		}else {
			System.out.println("Login button element is not visible");
		}
	}
	

	/**
	 * @param driver
	 * @param forgetPass
	 * Pressforget password button 
	 */
	public void pressForgetPassWord(WebDriver driver, String forgetPass) {
		Common_Utils.waitForElement(driver, forgetPassword);
		if(forgetPassword.isDisplayed()) {
			forgetPassword.click();
		}else {
			System.out.println("ForgetPassword WebElement is not visible");
		}
	}
	
	
	public void sendForgetPasswordEmail(WebDriver driver, String forget) {
		Common_Utils.waitForElement(driver, forgetPasswordEmail);
		if(forgetPasswordEmail.isDisplayed()) {
			forgetPasswordEmail.clear();
			forgetPasswordEmail.sendKeys(forget);
		}else {
			System.out.println("Reset your password link Element is not visible");
		}
	}
	
	
	public void pressForgetPasswordLinkButton(WebDriver driver) {
		Common_Utils.waitForElement(driver, forgetPasswordLinkButton);
		if(forgetPasswordLinkButton.isDisplayed()) {
			forgetPasswordLinkButton.click();
		}else {
			System.out.println("click send Link Button");
		}
	}
	
//	public boolean isHomePageDisplayed(WebDriver driver) {
//		return 
//	}
	
	
	//to check home page is visible or not
	//https://go.xero.com/app/!-8bfQ/dashboard
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



