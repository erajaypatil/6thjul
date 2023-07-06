package POMpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMOrangeHRM {
	
	
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement UName;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement UPassWord;
    @FindBy(xpath="//button[@type='submit']")private WebElement Button;
    @FindBy(xpath="//button[@title='Assign Leave']//*[name()='svg']//*[name()='g' and contains(@fill,'currentCol')]//*[name()='path' and contains(@class,'cls-1')]")private WebElement assignLeave;
	
	
	public POMOrangeHRM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void userName()
	{
		UName.sendKeys("Admin");
	}
	
	public void password1()
	{
		UPassWord.sendKeys("Admin123");
	}
	
	public void ButttonClick1()
	{
		Button.click();
		
	}
	
	public void assign()
	{
		assignLeave.click();
	}
}
