package Com_ActiTime__Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Com_ActiTime__Generic.BaseTest;
import Com_ActiTime__Generic.ExcelData;
import Com_ActiTime__Pages.actiTimeLoginPage;


public class InvalidLoginTest extends BaseTest 
{
	@Test(priority=2)
	public void invalidLogin() throws InterruptedException
	{
		actiTimeLoginPage ac = new actiTimeLoginPage(driver);
		String s = ExcelData.getData(file_Path, "TC01", 1,2);
		ac.verifyTitle(s);
		int rc = ExcelData.getRow(file_Path, "TC02");
		for(int i=1;i<rc;i++)
		{
			String un = ExcelData.getData(file_Path, "TC02", i, 0);
			ac.enterUserName(un);
			Reporter.log("Username  "+un, true);
			String pw = ExcelData.getData(file_Path, "TC02", i, 1);
			ac.enterPassword(pw);
			Reporter.log("Password  "+pw, true);
			ac.clickOnLogin();
			String aErrorMessage=ac.verifyErrorMessage();
			String eErrorMessage=ExcelData.getData(file_Path, "TC02", 1, 2);
			Assert.assertEquals(aErrorMessage, eErrorMessage);
		    Reporter.log("condition verified", true);
			Reporter.log("================", true);
			Thread.sleep(1000);
		}
	}

}
