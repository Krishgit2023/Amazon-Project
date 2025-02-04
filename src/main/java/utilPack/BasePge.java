package utilPack;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import com.sun.tools.javac.util.List;

public class BasePge {
	protected WebDriver driver;
	WebElement webElement;
	List<WebElement> webElements;
	Assert asrt;
	JavascriptExecutor js;
	Select select;
	String data;
	int exitVal;
	public BasePge(WebDriver driver) {
		this.driver=driver;	
	}


	/// <summary>
	/// To click an element with given timeout
	/// </summary>

	public void buttonClick(By locator) {
		WebDriverWait wait = getWait();
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		webElement =driver.findElement(locator);
		highLighterMethod(driver, webElement); 
		webElement.click();
	}

	/// <summary>
	/// To enter value to an element with given timeout
	/// </summary>
	public void setData(By locator, String text) {
		WebDriverWait wait = getWait();
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		webElement =driver.findElement(locator);
		highLighterMethod(driver, webElement); 
		webElement.clear();
		webElement.sendKeys(text);


	}



	/// <summary>
	/// Fluent wait
	/// </summary>
	public WebDriverWait getWait() {   //explicit wait

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		//	wait.pollingEvery(250,TimeUnit.MILLISECONDS);                //WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.ignoring(NoSuchElementException.class);                 // wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return wait;

	}

	

	/// <summary>
	/// Method that highLights elements
	/// </summary>
	public void highLighterMethod(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String bgColor = element.getCssValue("backgroundColor");
		js.executeScript("arguments[0].setAttribute('style', 'background: "+bgColor+"; border: 2px solid red;');", element);

	}


}








