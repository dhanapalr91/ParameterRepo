package Reporter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testngProject.Apple;

public class Reports implements ITestListener {

	public ExtentSparkReporter sparkReport;
	public ExtentReports extent;
	public ExtentTest test;
	Logger log = LogManager.getLogger(Reports.class);
	Apple ap = new Apple();
	
	public void onStart(ITestContext itc) {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		sparkReport = new ExtentSparkReporter("target/Spark"+dateName+".html");
		sparkReport.config().setReportName("Sample Extent Report");
		sparkReport.config().setTheme(Theme.STANDARD);
		sparkReport.config().setDocumentTitle("RA Repot");

		extent = new ExtentReports();
		extent.attachReporter(sparkReport);
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Env", "Qa");
	}

	@Override
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.INFO, "Test execution started");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Passed logger");
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed logger");
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Failed");
	}

	public void onFinish(ITestContext itc) {
		extent.flush();
	}
	
	 

}