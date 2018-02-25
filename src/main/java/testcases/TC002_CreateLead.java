package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods{


	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreateLead";
		testDescription="Creates a new Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Jeyamurugan";
		browserName="chrome";
		dataSheetName="TC003";
	}
		
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd, String cName, String fName,String lName,String phone, String verifyname) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLead()
		.clickLead()
		.cname(cName)
		.fname(fName)
		.lname(lName)
		.createphone(phone)
		.clickCreate()
		.verifyname(verifyname);		
		
			}

}
