package Com_ActiTime__Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com_ActiTime__Generic.BasePage;

public class actiTimeEnterTimeTrackerPage extends BasePage
{
@FindBy(id="logoutLink")
private WebElement logout;

	public actiTimeEnterTimeTrackerPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogout()
	{
		logout.click();
	}
	

}
