package POMpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	
	
	
	
//	@FindBy(xpath="//a[@class='ico-login']")private WebElement logi;
	
	@FindBy(xpath="//span[@class='wishlist-label']")private WebElement wishlis;
	
	@FindBy(xpath="//span[@class='cart-label']")private WebElement cart;
	
	@FindBy(xpath="//input[@id='small-searchterms']")private WebElement searchBox;
	
	@FindBy(xpath="//input[@class='email']")private WebElement emai;
	
	@FindBy(xpath="//input[@id='Password']")private WebElement pass;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")private WebElement loginButton;
	
	@FindBy(xpath="//h2[normalize-space()='About login / registration']")private WebElement Text;
	
	@FindBy(xpath="//div[@class='footer-upper']")private WebElement footerpage;
	
	@FindBy(xpath="//a[@class='ico-register']")private WebElement regester;
	
	
	
	

	
	
	public PomClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
/*	public void login()
	{
		logi.click();
	}
	
	*/
	public void wishlist()
	{
		wishlis.click();	
	}
	
	public void cart1()
	{
		cart.click();
	}
	
	public void SearchBox()
	{
		searchBox.sendKeys("Ajay Roakde Software Test Engineer");
	}
	
	public void EmailName()
	{
		emai.sendKeys("AjayRoakde001@gmail.com");
	}

	
	public void password()
	{
		pass.sendKeys("Ajay@9922451245");
	}
	
	public void LoginButton()
	{
		loginButton.click();
	}
	
	public void GetText()
	{
		Text.getText();
		System.out.println("Text is " +Text);
	}
	
	public void footer()
	{
		footerpage.getSize();
		footerpage.getText();
		System.out.println(footerpage.getText());
		System.out.println(footerpage.getSize());
	}
	
	public void reg()
	{
		regester.click();
		
	}
	
	
	
	
	
}
