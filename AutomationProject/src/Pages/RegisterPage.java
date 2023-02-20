package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class RegisterPage {
	//Declaring variables globally
	public static WebDriver driver;
	//Applying constructor
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	//Locators
	static By profileicon = By.xpath("/html/body/div[2]/footer/div[2]/div/div[1]/div/div[2]/div/ul/li[1]/a");
	static By createacc = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div[3]/div[2]/div[2]/div/div/a");
	static By fname = By.id("firstname");
	static By lname = By.id("lastname");
	static By number = By.id("customer_number");
	static By email = By.id("email_address");
	static By password = By.id("password");
	static By cpass = By.xpath("//*[@id=\"password-confirmation\"]");
	static By signup = By.xpath("//*[@id=\"form-validate\"]/div[2]/div[1]/button/span");
	//Methods
	public static void clickprofileicon() {
		driver.findElement(profileicon).click();
	}
	public static void clickcreateacc() {
		driver.findElement(createacc).click();
	}
	public static void firstname() {
		driver.findElement(fname).sendKeys("Syed");
	}
	public static void lastname() {
		driver.findElement(lname).sendKeys("Ibrahim");
	}
	public static void mno() {
		driver.findElement(number).sendKeys("9978666669");
	}
	public static void enteremail() {
		driver.findElement(email).sendKeys("SyedSIM's7@gmail.com");
	}
	public static void enterpass() {
		driver.findElement(password).sendKeys("Syed@123%#");
	}
	public static void confirmpass() {
		driver.findElement(cpass).sendKeys("Syed@123%#");
	}
	public static void clicksignup() {
		driver.findElement(signup).click();
	}
}