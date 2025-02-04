package testScenario.AmazonHomepage;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import TestData.CommonData;
import testPage.MavenPageObject.Login;
import testPage.MavenPageObject.Homepage;
import utilPack.BaseTest;

public class AmazonHomepage_Test extends BaseTest 

{	
	@Test()
	public void TC01_HomePageTest() throws Exception 
	{	
		Homepage homepage = new Homepage(getDriver());	
		homepage.TC01_HomePage();	
	}
	
	
}