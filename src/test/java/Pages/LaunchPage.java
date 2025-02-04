package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaunchPage {

	WebDriver driver;
	
	public LaunchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By signin = By.xpath("//span[contains(text(),'Hello, sign in')]");
	By username = By.xpath("//input[@name='email']");
	By continuebutton = By.xpath("//input[@class='a-button-input']");
	By password = By.xpath("//input[@name='password']");
	By signinbutton = By.xpath("//input[@id='signInSubmit']");
	
	public void signin()
	{
		driver.findElement(signin).click();
			
	}
	
	public void username(String userName)
	{
		driver.findElement(username).sendKeys(userName);
		driver.findElement(continuebutton).click();
		
	}
	
	public void password(String passWord)
	{
		driver.findElement(password).sendKeys(passWord);
		driver.findElement(signinbutton).click();
		
	}

}
