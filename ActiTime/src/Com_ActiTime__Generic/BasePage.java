package Com_ActiTime__Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasePage 
{
public WebDriver driver;

public BasePage(WebDriver driver)
{
	this.driver=driver;
}
@Test
	public  void verifyTitle(String title)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
	try 
	  {
		wait.until(ExpectedConditions.titleIs(title));
		Reporter.log("Title is matching and matching title is"+title, true);
	  }  
	catch(Exception e)
	 {
		Reporter.log("The Title is not matching and actual matching title is"+driver.getTitle(), true);
		Assert.fail();
	 }
	}
@Test
    public void verifyElement(WebElement element)
    {
	WebDriverWait wait = new WebDriverWait(driver,10);
	try
	{
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("the element is matching", true);
	}
	catch(Exception e)
	{
		Reporter.log("The Element is not matching", true);
		Assert.fail();
	}
    }
}
