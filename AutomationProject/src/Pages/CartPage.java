package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CartPage {
	//Applying constructor
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	//Declaring variables globally
	public static WebDriver driver;
	//Locators
	static By monitor = By.xpath("/html/body/div[2]/section[2]/div/div[1]/div[6]/div/a/img");
	static By add = By.xpath("//*[@id=\"product-item-info_3029\"]/div[4]/form/button");
	static By opencart = By.xpath("/html/body/div[2]/footer/div[2]/div/div[1]/div/div[2]/div/ul/li[3]/a");
	static By delete = By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[5]/div/a[2]");
	//Methods
	public static void clickmonitor() {
		driver.findElement(monitor).click();
	}
	public static void clickadd() {
		driver.findElement(add).click();
	}
	public static void clickcart() {
		driver.findElement(opencart).click();
	}
	public static void clickdelete() {
		driver.findElement(delete).click();
	}
}