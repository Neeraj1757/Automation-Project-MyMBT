package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
	//Applying constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//Declaring variables globally
	public static WebDriver driver;
	//Locators
	static By profileicon = By.xpath("/html/body/div[2]/footer/div[2]/div/div[1]/div/div[2]/div/ul/li[1]/a");
	static By email = By.id("email");
	static By password = By.id("pass");
	static By signin = By.xpath("//*[@id=\"send2\"]/span");
	static By profile = By.xpath("//*[@id=\"UserDrop\"]/i/span[3]");
	static By logout = By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/div[2]/div[2]/div[3]/a/i/span[3]");
	//Methods
	public static void clickprofileicon() {
		driver.findElement(profileicon).click();
	}
	public static void enteremail() {
		driver.findElement(email).sendKeys("rebelraj396@gmail.com");
	}
	public static void enterpass() {
		driver.findElement(password).sendKeys("Neeraj@1757");
	}
	public static void clicklogin() {
		driver.findElement(signin).click();
	}
	public static void clickprofile() {
		driver.findElement(profile).click();
	}
	public static void clicklogout() {
		driver.findElement(logout).click();
	}
}