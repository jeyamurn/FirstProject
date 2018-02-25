package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_EditLead";
		testDescription="Modifies company name and Update";
		testNodes="Leads";
		category="Smoke";
		authors="Jeyamurugan";
		browserName="chrome";
		dataSheetName="TC004";
	}
		
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String fName,String newcompany, String verifycompany) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLead()
		.clickfindlead()
		.typeFirstname(fName)
		.clickFind()
		.selectFirstname()
		.clickEdit()
		.updatecname(newcompany)
		.clickUpdate()
		.verifycname(verifycompany);		
				
			}

}

