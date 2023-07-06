package POMpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClassWordpress {
	
	
	@FindBy(xpath="//input[@id='user_login']")private WebElement Userid;
	@FindBy(xpath="//input[@id='user_pass']")private WebElement PassWord;
	//@FindBy(xpath="//input[@id='wp-submit']")private WebElement ClickButton;
	
	 public PomClassWordpress(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void Login(String name)
	 {
		 Userid.sendKeys(name);
	 }
	 
	 public void Pass(String num)
	 {
		 PassWord.sendKeys(num);
		 
	 }
	 
/*	 public void button()
	 {
		 ClickButton.click();
		 
	 }
*/
}
