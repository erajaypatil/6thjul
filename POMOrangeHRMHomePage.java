package POMpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMOrangeHRMHomePage {
	
	
	@FindBy(xpath="//img[@alt='client brand banner']")private WebElement OrangeText;
	
	
	public POMOrangeHRMHomePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void TextOrange(String UserName11)
	{
		String ActaulText = OrangeText.getText();
		String ExpectedText = UserName11;
		
		
		{
			
		}
	}

}
