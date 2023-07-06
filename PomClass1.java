package POMpack;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PomClass1 {
	
	@FindBy(xpath="//input[@id='small-searchterms']")private WebElement serach;
	
	@FindBy(xpath="//input[@id='gender-male']")private WebElement male;
	
	@FindBy(xpath="//input[@id='gender-female']")private WebElement female;
	
	@FindBy(xpath="//input[@id='FirstName']")private WebElement firstName;
	
	@FindBy(xpath="//input[@id='LastName']")private WebElement LastName;
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']")private WebElement day;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")private WebElement month;
	
	@FindBy(xpath="//select[@name='DateOfBirthYear']")private WebElement year;
	
	@FindBy(xpath="//input[@id='Email']")private WebElement emaillll;
	
	@FindBy(xpath="//input[@id='Company']")private WebElement cpmapnyserach;
	
	@FindBy(xpath="//input[@id='Password']")private WebElement passw;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")private WebElement conform;
	
	

	
	
	public PomClass1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ser()
	{
		serach.sendKeys("hello");
	}
	
	
	public void Male()
	{
		
		male.click();
	}
	
	
	public void Female1()
	{
		female.click();
	}
	
	
	public void FirstName1()
	{
		firstName.sendKeys("AjaRokade");
	}
	
	
	public void LastName1()
	{
		LastName.sendKeys("hellodsfjhdskj");
	}
	
	
	public void Day1()
	{
		Select s=new Select(day);
		s.selectByIndex(8);
	}
	
	public void Month()
	{
		Select s1=new Select(month);
		s1.selectByVisibleText("June");
	}
	
	
	public void years()
	{
	    Select s2=new Select(year);
	    s2.selectByValue("1992");
	}
	
	public void emails()
	{
		emaillll.sendKeys("hellosdjkfsd545882121");
	}
	
	public void comapnay()
	{
		cpmapnyserach.sendKeys("hellosdfjdshkjfh");
	}
	
	public void Pass()
	{
		passw.sendKeys("hsdf78745jdshkjfh");
	}
	
	public void Conform1()
	{
		conform.sendKeys("hellosdfjdshkjfh");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
