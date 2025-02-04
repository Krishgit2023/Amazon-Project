package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutpage {
	
WebDriver driver;
	
public Checkoutpage(WebDriver driver) {
	this.driver=driver;
}

By addaddress = By.xpath("//span[@id='checkout-primary-continue-button-id']");


public void addaddress()
{
	driver.findElement(addaddress).click();
	
}


}
