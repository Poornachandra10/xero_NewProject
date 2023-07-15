package test_Xero;

import java.lang.reflect.Method;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<WebDriver>();

	protected static ExtentReports extent = new ExtentReports();

	protected static ExtentHtmlReporter report =null;
	
	public static ExtentTest test=null;
	
	protected static Logger logger = LogManager.getLogger("");

	@BeforeMethod
	public static void setDriver(Method name) {
		WebDriver driver = BaseTest.getBrowserType("chrome", false);
		logger.debug("BaseTest : setDriver : driver configuration done");
		threadLocalDriver.set(driver);
		
		logger.debug("BaseTest: setDriver: test: obj created");
	}

	private static WebDriver getBrowserType(String browserName, boolean headless) {
		WebDriver driver = null;
		String browserType = browserName.toLowerCase();
		switch (browserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			if (headless) {
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--headless");
				driver = new ChromeDriver(co);
			} else {
				driver = new ChromeDriver();
			}
			break;
		case "safari":
			driver = new ChromeDriver();
			if (headless) {
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--headless");
				driver = new ChromeDriver(co);
			} else {
				driver = new ChromeDriver();
			}
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			if (headless) {
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--headless");
				driver = new ChromeDriver(co);
			} else {
				driver = new ChromeDriver();
			}

			break;
		default:
			System.out.println("Provide input either as Chrome or Safari");
			break;

		}

		return driver;
	}
	
	@BeforeSuite
	public void setUp() {
		logger.debug("BaseTest: setup: configuration started");
		String sFileNamePrefix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()); 
		String filePath= System.getProperty("user.dir")+"\\src\\test\\resources\\reports\\"+sFileNamePrefix+"_ZERO.html";
		
		report =new ExtentHtmlReporter(filePath);
		extent.attachReporter(report);
		logger.debug("Report configuration is success");
	}

	@AfterSuite
	public void teardown() {
		extent.flush();
	}


	@AfterMethod
	public void closeBrowser() {
		BaseTest.removeDriver();
	}

	
public static WebDriver getDriver() {
return threadLocalDriver.get();
}

public static void removeDriver() {
	BaseTest.getDriver().close();
	threadLocalDriver.remove();
}























}
