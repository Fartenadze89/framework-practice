package tests.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.base.BasePage;
import utils.JsonUtils;
import utils.Utility;


public class BaseTest {

	private WebDriver driver;
	protected BasePage basePage;
	protected HomePage homePage;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void loadApplication() {
		driver.get(JsonUtils.getEnvData().getBaseURL());
		basePage = new BasePage();
		basePage.setDriver(driver);
		Utility.setDriver(BasePage.driver);
		homePage = new HomePage();
	}

	//need to fix it
//	@AfterMethod
//	public void takeFailedResultScreenshot(ITestResult testResult) {
//		if (ITestResult.FAILURE == testResult.getStatus()) {
//			TakesScreenshot screenshot = (TakesScreenshot) driver;
//			File source = screenshot.getScreenshotAs(OutputType.FILE);
//			File destination = new File(System.getProperty("user.dir") + "/resources/screenshots" +
//					java.time.LocalDate.now() + testResult.getName() + ".png");
//			try {
//				FileHandler.copy(source
//						, destination);
//			} catch (IOException e) {
//				throw new RuntimeException(e);
//			}
//			System.out.println("Screenshot Located At " + destination);
//		}
//	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
