package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods{

	

	@BeforeTest
	public void setData() {
		testCaseName="TC004_DeleteLead";
		testDescription="Deletes a lead entry";
		testNodes="Leads";
		category="Regression";
		authors="Jeyamurugan";
		browserName="chrome";
		dataSheetName="TC005";
	}
			
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String phone,String result) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLead()
		.clickfindlead()
		.clickphone()
		.typePhone(phone)
		.clickFind()
		.selectId()
		.selectFirstname()
		.clickDelete()
		.clickfindlead()
		.typeid()
		.clickFind()
		.verifyResult(result);
				
			}

}

	

