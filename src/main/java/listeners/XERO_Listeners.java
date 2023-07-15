package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import test_Xero.BaseTest;

public class XERO_Listeners extends BaseTest implements ITestListener{

	@Override
public void onTestStart(ITestResult result) {
System.out.println("Test Started");
}

	@Override
	public void onTestSuccess(ITestResult result) {
		BaseTest.test.pass(result.getName()+" Passed");
		BaseTest.test.pass(MarkupHelper.createLabel(result.getName()+" passed", ExtentColor.GREEN));
	}
	
	@Override
	public void onTestFailure(ITestResult result) {

	BaseTest.test.fail(result.getName()+" failed");
	BaseTest.test.fail(MarkupHelper.createLabel(result.getName()+" failed", ExtentColor.RED));
	
	}
	
	
	
	
	
}