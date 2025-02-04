package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By cart = By.xpath("//div[@id='nav-cart-text-container']");
	By proceedtobuy = By.xpath("//input[@name='proceedToRetailCheckout']");


	public void addtocart()
	{
		driver.findElement(cart).click();
		
	}
	
	public void proceedtobuy()
	{
		driver.findElement(proceedtobuy).click();
		
		
	}

}
