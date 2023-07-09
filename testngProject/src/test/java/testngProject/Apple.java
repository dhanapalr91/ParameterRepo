package testngProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Apple {

	public Logger log = LogManager.getLogger(Apple.class);
	public WebDriver driver;

	@Test(testName = "First Method")
	public void methodOne() {
		log.info("Method one");
		log.warn("Method one");
		log.error("Method one");
		log.fatal("Method one");
	
	}

	@Test
	public void testLoggerDebug() {
		log.info("Hello.. im in Debug method");
	}

	@Test
	public void testLoggerInfo() {
	//	Wait wt = new FluentWait
		log.info("Hello.. im in Info method");
	}

	@Test
	public void testLoggerWarn() {
		log.info("Hello.. im in Warn method");
	}

	@Test
	public void testLoggerError() {
		Assert.fail();
		log.info("Hello.. im in Error method");
	}

	@Test(dependsOnMethods = {"testLoggerError"})
	public void testLoggerFatal() {
		log.info("Hello.. im in Fatal method");
	}
}
