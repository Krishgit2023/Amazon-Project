package testPage.MavenPageObject;
import TestData.HomePage_TestData;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import TestData.CommonData;
import objectRepository.LoginPage_Obj;
import objectRepository.HomePage_Obj;
import utilPack.BasePge;

public class Homepage extends BasePge {

	BasePge base;
	Assert asrt;

	public Homepage(WebDriver driver) {
		super(driver);
		base = new BasePge(driver);
	}


	// <summary>
	// Test Case Title : Add item to cart and reach till payment page(Amazon web page).
	// Automation ID : TC01_HomePage
	// </summary>
	public void TC01_HomePage() throws InterruptedException {
		
		Login login = new Login(driver);
		 LoginPage_Obj LoginPageObj = new LoginPage_Obj();
		 HomePage_TestData HomePageTestData = new HomePage_TestData();
		 HomePage_Obj HomePageObj = new HomePage_Obj();
		 CommonData CommonData = new CommonData();
		
		//Step 1: Login to the application
		login.loginToApplication(CommonData.UserName, CommonData.PassWord);
		
		//Step 2: Search item
		base.setData(LoginPageObj.Ele_Password("twotabsearchtextbox"),HomePageTestData.TC01_ProductName );
		base.buttonClick(HomePageObj.Btn_Search("nav-search-submit-text"));
		base.buttonClick(HomePageObj.Ele_Product());
		
		//Step 3: Add to cart
		Set<String> handles = driver.getWindowHandles();
		Iterator winsIterator = handles.iterator();
		String parentIdString = (String) winsIterator.next();
		String childIdString = (String) winsIterator.next();
		driver.switchTo().window(childIdString);
		
		base.buttonClick(LoginPageObj.Ele_Password("add-to-cart-button"));
		base.buttonClick(HomePageObj.Ele_Cart("nav-cart-text-container"));
		
		//Step 4: Checkout
		base.buttonClick(LoginPageObj.Ele_UserName("proceedToRetailCheckout"));
		base.buttonClick(HomePageObj.Btn_Search("checkout-primary-continue-button-id"));
		

	}

}