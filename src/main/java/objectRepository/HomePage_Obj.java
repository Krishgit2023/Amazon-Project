package objectRepository;
import org.openqa.selenium.By;

public class HomePage_Obj {	

	//Edt
	public By Btn_Search(String text) {return By.xpath("//span[@id='"+text+"']");}
	public By Ele_Product() {return By.linkText("Cadbury Dairy Milk Crackle Chocolate Bar, 36 Grams (Pack of 10)");}
	public By Ele_Cart(String text) {return By.xpath("//div[@id='"+text+"']");}
	
}	

