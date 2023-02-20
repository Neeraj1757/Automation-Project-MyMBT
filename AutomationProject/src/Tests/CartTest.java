package Tests;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Pages.CartPage;
@Test
public class CartTest {
	private static WebDriver driver;
	public static void Carttest() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajja.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mymbt.net/");
		System.out.println("Title is:" + driver.getTitle());
		ExtentReports er = new ExtentReports();
		// Creating an instance of ExtentSparkReporter to specify the location and name of the HTML report.
		ExtentSparkReporter esr = new ExtentSparkReporter(".\\test-output\\ExtentReports\\ExtentreportCartTest.html");
		// Attaching the HTML report to the ExtentReports instance
		er.attachReporter(esr);
		// Creating an instance of ExtentTest to specify the test
		ExtentTest et = er.createTest("Verify Cart Page");
		driver.manage().window().maximize();
		CartPage cp = new CartPage(driver);
		cp.clickmonitor();
		Thread.sleep(2000);
		cp.clickadd();
		TakesScreenshot ss =(TakesScreenshot)driver;
		File fs = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fs, new File("./test-output/ScreenShots/s1.png"));
		System.out.println("Screenshot printed");
		// Flushing the ExtentReports instance
		er.flush();
	}
}