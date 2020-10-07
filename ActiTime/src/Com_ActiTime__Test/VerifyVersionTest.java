package Com_ActiTime__Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com_ActiTime__Generic.BaseTest;
import Com_ActiTime__Generic.ExcelData;
import Com_ActiTime__Pages.actiTimeLoginPage;

public class VerifyVersionTest extends BaseTest
{
@Test(priority=3)
public void verifyVersion()
{
	actiTimeLoginPage ac = new actiTimeLoginPage(driver);
	
	ac.verifyTitle(ExcelData.getData(file_Path, "TC01", 1, 2));
	String eTitle = ExcelData.getData(file_Path, "TC03", 1, 0);
	String aTitle=ac.verifyVersion();
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(aTitle, eTitle);
	sa.assertAll();
}
}
