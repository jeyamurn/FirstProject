package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_MergeLead";
		testDescription="Merges 2 Leads";
		testNodes="Leads";
		category="Sanity";
		authors="Jeyamurugan";
		browserName="chrome";
		dataSheetName="TC006";
	}
			
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String phone) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLead()
		.clickmergelead()
		.clickfromlead()
		.clickphone()
		.typePhone(phone)
		.clickFindmerge()
		.selectFirstnamemerge()
		.clicktolead()
		.clickphone()
		.typePhone(phone)
		.clickFindmerge()
		.selectFirstnamemerge2()
		.clickmerge();
		
					}

}
