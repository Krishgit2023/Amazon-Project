package objectRepository;

import org.openqa.selenium.By;

public class LoginPage_Obj {
	//Btn	
	public By Btn_Sigin(String text) { return By.xpath("//span[contains(text(),'"+text+"')]"); }
	public By Btn_SingnIn(String id) {return By.xpath("//button[@id='"+id+"']");}
	public By Btn_ContinueButton(String text) { return By.xpath("//input[@class='"+text+"']"); }

	//Ele
	public By Ele_UserName(String username) {return By.xpath("//input[@name='"+username+"']");}
	public By Ele_Password(String text) {return By.xpath("//input[@id='"+text+"']");}
	
	
	
	
	
	

}
