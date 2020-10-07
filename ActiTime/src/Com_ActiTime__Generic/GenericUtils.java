package Com_ActiTime__Generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class GenericUtils 
{
	
	public static void getScreenShot(WebDriver driver,String name)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try 
		{
			Files.copy(src, new File("./ScreenShot/"+name+".png"));
		} 
		catch (Exception e) 
		{
		}
	}
	public static void selectByIndex(WebElement element,int index)
	{
		Select sl = new Select(element);
		sl.selectByIndex(index);
	}
	public static void selectByValue(WebElement element,String value)
	{
		new Select(element).selectByValue(value);
	}
	public static void selectByVisibleText(WebElement element,String text)
	{
		new Select(element).selectByVisibleText(text);
	}
	public static void robot(int press,int release)
	{
		try 
		{
			Robot r = new Robot();
			r.keyPress(press);
			r.keyRelease(release);
		} 
		catch (AWTException e) 
		{	
		}
			
	}
}
