package POMpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NopLoginPage {
	
	@FindBy(xpath="//a[@class='ico-register']")private WebElement Register;
	@FindBy(xpath="//a[@class='ico-login']")private WebElement Login;
	@FindBy(xpath="//span[@class='cart-label']")private WebElement ShoppingCart;
	@FindBy(xpath="//input[@id='small-searchterms']")private WebElement SearchBox;
	@FindBy(xpath="//input[@id='Email']")private WebElement UserName;
	@FindBy(xpath="//input[@id='Password']")private WebElement Pwd;
	@FindBy(xpath="//input[@id='newsletter-email']")private WebElement NewsLetter;
	@FindBy(xpath="//div[@class='footer-upper']")private WebElement FooterAllText;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public NopLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void RegisterE() throws Exception
	{
		Register.click();
		Assert.assertTrue(true,"click button is not present");
		Reporter.log("Click button is run");
		Thread.sleep(2000);
	}
	
	@Test
	public void LoginE() throws InterruptedException
	{
		Login.click();
		Assert.assertTrue(true,"Login button is not present");
		Reporter.log("Login button is run");
		Thread.sleep(2000);
	}
	

	public void  ShoppingCartE() throws Throwable
	{
		ShoppingCart.click();
		Assert.assertTrue(true,"ShoppingCart button is not present");
		Reporter.log("ShoppingCart button is run");
		Thread.sleep(2000);
	}
	

	public void SearchBoxE() throws InterruptedException
	{
		SearchBox.sendKeys("AjayRokade");
		Assert.assertNotNull(SearchBox, "SearchBox Test is null");
		Reporter.log("Search box is fill text");
		Thread.sleep(2000);
	}
	
	
	public void UseNameE() throws Exception
	{
		UserName.sendKeys("AjayRoakde");
		Assert.assertNotNull(UserName, "UserNameE Test is null");
		Reporter.log("UnserNameE box is fill text");
		Thread.sleep(2000);
	}
	
	
	
	public void PwdE() throws Exception
	{
		Pwd.sendKeys("Ajay@99224578");
		Assert.assertNotNull(Pwd, "Pwd Test is null");
		Reporter.log("Pwd box is fill text");
		Thread.sleep(2000);
	}
	
	
	public void NewsLetter() throws Exception
	{
		NewsLetter.sendKeys("ASdfdfjsldf@454878");
		Assert.assertNotNull(NewsLetter, "NewsLetter Box is not null");
		Reporter.log("NewsLetter box is fill text");
		
		Thread.sleep(2000);
	}
	
	
	
	public void FooterTextE() throws Exception
	{
		FooterAllText.getText();
		System.out.println("All Text in footer side of page is "+FooterAllText.getText());
	
		Assert.assertTrue(true,"All footer text is not present");
		Reporter.log("Text all is present in footer");
		Thread.sleep(2000);
	}
	
	

}
