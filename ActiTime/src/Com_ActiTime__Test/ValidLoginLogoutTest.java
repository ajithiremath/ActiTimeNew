package Com_ActiTime__Test;

import org.testng.annotations.Test;

import Com_ActiTime__Generic.BaseTest;
import Com_ActiTime__Generic.ExcelData;
import Com_ActiTime__Pages.actiTimeEnterTimeTrackerPage;
import Com_ActiTime__Pages.actiTimeLoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test(priority=1)
public static void loginLogout()
{
		String uName = ExcelData.getData(file_Path, "TC01",1, 0);
		String pass =ExcelData.getData(file_Path, "TC01", 1, 1);
		String tl =ExcelData.getData(file_Path, "TC01", 1, 2);
		String te =ExcelData.getData(file_Path, "TC01", 1, 3);
		actiTimeLoginPage ac = new actiTimeLoginPage(driver);
		ac.verifyTitle(tl);
		ac.enterUserName(uName);
		ac.enterPassword(pass);
		ac.clickOnLogin();
		actiTimeEnterTimeTrackerPage al = new actiTimeEnterTimeTrackerPage(driver);
		al.verifyTitle(te);
		al.clickOnLogout();
}
}
