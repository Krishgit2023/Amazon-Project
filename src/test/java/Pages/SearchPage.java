package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By searchproduct = By.xpath("//input[@id='twotabsearchtextbox']");
	By searchbutton = By.xpath("//span[@id='nav-search-submit-text']");
	By productselection = By.linkText("Cadbury Dairy Milk Crackle Chocolate Bar, 36 Grams (Pack of 10)");
	By addtocart = By.xpath("//input[@id='add-to-cart-button']");
	
	
	
	
	
	public void searchproduct(String productName)
	{
		driver.findElement(searchproduct).sendKeys(productName);
		driver.findElement(searchbutton).click();
		
	}
	
	public void productselection()
	{
		driver.findElement(productselection).click();
		
		
	}
	
	public void addtocart()
	{
		Set<String> handles = driver.getWindowHandles();
		Iterator winsIterator = handles.iterator();
		String parentIdString = (String) winsIterator.next();
		String childIdString = (String) winsIterator.next();
		driver.switchTo().window(childIdString);
		
		driver.findElement(addtocart).click();

	}
	
	

}
