package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class WishlistPage {
	//Applying constructor
	public WishlistPage(WebDriver driver) {
		this.driver = driver;
	}
	//Declaring variables globally
	public static WebDriver driver;
	//Locators
	static By home = By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/div[2]/div[1]/div[2]/ul/li[2]/a");
	static By cpu = By.xpath("/html/body/div[2]/section[3]/div/div[3]/div/span/a");
	static By addwish = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div/div[3]/div/div[1]/div/div[2]/div/div/div/div[3]/a[1]");
	static By openwishlist = By.xpath("/html/body/div[3]/header/div[2]/div/div/div/div/div[2]/div[2]/div[1]/li/a/i");
	static By delete = By.xpath("/html/body/div[2]/section/div[3]/div/div[2]/form/div[1]/div/div/div/div/div/div[4]/div[3]/div[2]/a");
	
	//Methods
	public static void clickhome() {
		driver.findElement(home).click();
	}
	
	public static void clickcpu() {
		driver.findElement(cpu).click();
	}

	public static void addtowish() {
		driver.findElement(addwish).click();
	}
	public static void clickwishlist() {
		driver.findElement(openwishlist).click();
	}

	public static void deletewishlist() {
		driver.findElement(delete).click();
	}
}