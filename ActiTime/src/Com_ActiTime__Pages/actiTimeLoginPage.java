package Com_ActiTime__Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com_ActiTime__Generic.BasePage;

public class actiTimeLoginPage extends BasePage
{
	@FindBy(id="username")
	private	WebElement unTb;
		@FindBy(name="pwd")
	private	WebElement pwTb;
		@FindBy(xpath="//div[.=\"Login \"]")
	private WebElement lnBTN;
		@FindBy(xpath="//span[.=\"Username or Password is invalid. Please try again.\"]")
	private WebElement error;	
		@FindBy(xpath="//nobr[contains(.,\"actiTIME 2020 Online\")]")
	private WebElement version;	
	
	public actiTimeLoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void enterUserName(String uName)
	{
		unTb.sendKeys(uName);
	}
	public void enterPassword(String pw)
	{
		pwTb.sendKeys(pw);
	}
	public void clickOnLogin()
	{
		lnBTN.click();
	}
	public String verifyErrorMessage()
	{
	   verifyElement(error);
	   String aErrorMessage = error.getText();
	   return aErrorMessage;
	}
	public String verifyVersion()
	{
		verifyElement(version);
		return version.getText();
	}

}
