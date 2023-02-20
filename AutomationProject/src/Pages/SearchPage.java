package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SearchPage {
	//Applying constructor
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	//Declaring variables globally
	public static WebDriver driver;
	//Locators
	static By search = By.id("search");
	static By clicksearch= By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button");
	//Methods
	public static void typesearch() {
		driver.findElement(search).sendKeys("PROCESSOR");
	}
	public static void clickonsearch() {
		driver.findElement(clicksearch).click();
	}
}