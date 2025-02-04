package testPage.MavenPageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import TestData.CommonData;
import objectRepository.LoginPage_Obj;
import utilPack.BasePge;


public class Login extends BasePge {

	BasePge base;
	Assert asrt;

	public Login(WebDriver driver) {
		super(driver);
		base = new BasePge(driver);
	}
	public void loginToApplication(String UserName, String Password) throws InterruptedException 
	{
		    LoginPage_Obj LoginPageObj = new LoginPage_Obj();

		    
		    base.buttonClick(LoginPageObj.Btn_Sigin("Hello, sign in"));
		    base.setData(LoginPageObj.Ele_UserName("email"), UserName);
		    base.buttonClick(LoginPageObj.Btn_ContinueButton("a-button-input"));
		    base.setData(LoginPageObj.Ele_Password("ap_password"), Password);
		    base.buttonClick(LoginPageObj.Ele_Password("signInSubmit"));
		 
					
	
	}
	
	

}
