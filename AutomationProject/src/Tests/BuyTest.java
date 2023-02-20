package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Pages.BuyPage;
import Pages.LoginPage;
import Pages.WishlistPage;
import Pages.CartPage;
@Test
public class BuyTest {
	private static WebDriver driver;

	public static void Buytest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajja.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mymbt.net/");
		System.out.println("Title is:" + driver.getTitle());
		ExtentReports er = new ExtentReports();
		// Creating an instance of ExtentHtmlReporter to specify the location and name of the HTML report
		ExtentSparkReporter esr = new ExtentSparkReporter(".\\test-output\\ExtentReports\\ExtentreportBuyTest.html");
		// Attaching the HTML report to the ExtentReports instance
		er.attachReporter(esr);
		// Creating an instance of ExtentTest to specify the test
		ExtentTest et = er.createTest("Verify Buy Page");

		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		BuyPage bp = new BuyPage(driver);
		WishlistPage wp = new WishlistPage(driver);
		CartPage cp = new CartPage(driver);
		lp.clickprofileicon();
		Thread.sleep(2000);
		lp.enteremail();
		Thread.sleep(2000);
		lp.enterpass();
		Thread.sleep(2000);
		lp.clicklogin();
		Thread.sleep(2000);
		wp.clickhome();
		Thread.sleep(4000);
		cp.clickmonitor();
		Thread.sleep(4000);
		cp.clickadd();
		Thread.sleep(1000);
		bp.clickcart();
		Thread.sleep(2000);
		bp.clickbuy();
		Thread.sleep(2000);
		bp.clickshipping();
		Thread.sleep(2000);
		bp.clicknext();
		Thread.sleep(2000);
		bp.clickcod();
		// Flushing the ExtentReports instance
		er.flush();
	}
}