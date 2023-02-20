package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Pages.LoginPage;
@Test
public class LoginTest {
	private static WebDriver driver;
	public static void Logintest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajja.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mymbt.net/");
		System.out.println("Title is:" + driver.getTitle());
		ExtentReports er = new ExtentReports();
		// Creating an instance of ExtentHtmlReporter to specify the location and name
		// of the HTML report
		ExtentSparkReporter esr = new ExtentSparkReporter(".\\test-output\\ExtentReports\\ExtentreportLoginTest.html");
		// Attaching the HTML report to the ExtentReports instance
		er.attachReporter(esr);
		// Creating an instance of ExtentTest to specify the test
		ExtentTest et = er.createTest("Verify Login Page");
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		lp.clickprofileicon();
		Thread.sleep(2000);
		lp.enteremail();
		Thread.sleep(2000);
		lp.enterpass();
		Thread.sleep(2000);
		lp.clicklogin();
		// Flushing the ExtentReports instance
		er.flush();
	}
}