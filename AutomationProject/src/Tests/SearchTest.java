package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Pages.SearchPage;
@Test
public class SearchTest {
	private static WebDriver driver;
	public static void Searchtest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajja.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mymbt.net/");
		System.out.println("Title is:" + driver.getTitle());
		ExtentReports er = new ExtentReports();
		// Creating an instance of ExtentHtmlReporter to specify the location and name of the HTML report
		ExtentSparkReporter esr = new ExtentSparkReporter(".\\test-output\\ExtentReports\\ExtentreportSearchTest.html");
		// Attaching the HTML report to the ExtentReports instance
		er.attachReporter(esr);
		// Creating an instance of ExtentTest to specify the test
		ExtentTest et = er.createTest("Verify Search Page");
		driver.manage().window().maximize();
		SearchPage sp = new SearchPage(driver);
		sp.typesearch();
		Thread.sleep(2000);
		sp.clickonsearch();
		Thread.sleep(2000);
		// Flushing the ExtentReports instance
		er.flush();
	}
}