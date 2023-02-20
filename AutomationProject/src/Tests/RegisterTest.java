package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Pages.RegisterPage;
@Test
public class RegisterTest {
	private static WebDriver driver;
	public static void Registertest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajja.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mymbt.net/");
		System.out.println("Title is:" + driver.getTitle());
		ExtentReports er = new ExtentReports();
		// Creating an instance of ExtentHtmlReporter to specify the location and name
		// of the HTML report
		ExtentSparkReporter esr = new ExtentSparkReporter(
				".\\test-output\\ExtentReports\\ExtentreportRegisterTest.html");
		// Attaching the HTML report to the ExtentReports instance
		er.attachReporter(esr);
		// Creating an instance of ExtentTest to specify the test
		ExtentTest et = er.createTest("Verify Register Page");
		driver.manage().window().maximize();
		RegisterPage rp = new RegisterPage(driver);
		rp.clickprofileicon();
		Thread.sleep(2000);
		rp.clickcreateacc();
		Thread.sleep(2000);
		rp.firstname();
		Thread.sleep(2000);
		rp.lastname();
		Thread.sleep(2000);
		rp.mno();
		Thread.sleep(2000);
		rp.enteremail();
		Thread.sleep(2000);
		rp.enterpass();
		Thread.sleep(2000);
		rp.confirmpass();
		Thread.sleep(2000);
		rp.clicksignup();
		// Flushing the ExtentReports instance
				er.flush();
	}
}