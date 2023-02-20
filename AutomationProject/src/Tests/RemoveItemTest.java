package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Pages.CartPage;
@Test
public class RemoveItemTest {
	private static WebDriver driver;
	public static void Logintest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajja.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mymbt.net/");
		System.out.println("Title is:" + driver.getTitle());
		ExtentReports er = new ExtentReports();
		// Creating an instance of ExtentHtmlReporter to specify the location and name
		// of the HTML report
		ExtentSparkReporter esr = new ExtentSparkReporter(".\\test-output\\ExtentReports\\ExtentreportRemoveTest.html");
		// Attaching the HTML report to the ExtentReports instance
		er.attachReporter(esr);
		// Creating an instance of ExtentTest to specify the test
		ExtentTest et = er.createTest("Verify Removing items from cart");
		driver.manage().window().maximize();
		CartPage cp = new CartPage(driver);
		cp.clickmonitor();
		Thread.sleep(2000);
		cp.clickadd();
		Thread.sleep(6000);
		cp.clickcart();
		Thread.sleep(2000);
		cp.clickdelete();
		// Flushing the ExtentReports instance
		er.flush();	
	}
}