package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CartPage;
import Pages.Checkoutpage;
import Pages.LaunchPage;
import Pages.SearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_Amazon {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	driver.get("https://www.amazon.in/");
	}
	
	
	
	
	@Test
	public void LoginOperation() {
		LaunchPage page = new LaunchPage(driver);
		page.signin();
		page.username("Testkrishna50@gmail.com");
		page.password("Tester@1234");
		SearchPage searchPage = new SearchPage(driver);
		searchPage.searchproduct("dairymilk");
		searchPage.productselection();
		searchPage.addtocart();
		CartPage cartPage = new CartPage(driver);
		cartPage.addtocart();
		cartPage.proceedtobuy();
		Checkoutpage checkoutpage = new Checkoutpage(driver) ;
		checkoutpage.addaddress();

	}
	
	
	
	/*@AfterTest
	public void aftertest() {
		driver.quit();
	}*/

}
