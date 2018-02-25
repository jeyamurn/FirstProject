package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{

	public static String id;	
	public FindLeads() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH,using="(//span[@class = 'x-tab-strip-text '])[2]")
	private WebElement elephone;

	public FindLeads clickphone() {

		click(elephone);
		return this;

	}

	@FindBy(how=How.XPATH,using="(//input[@name = 'firstName'])[3]")
	private WebElement eletypefname;

	public FindLeads typeFirstname(String data) {

		type(eletypefname, data);
		return this;

	}


	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement eletypephone;

	public FindLeads typePhone(String data) {

		type(eletypephone, data);
		return this;

	}

	@FindBy(how=How.XPATH,using="(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleselectfname;

	public ViewLead selectFirstname(){

		click(eleselectfname);
		return new ViewLead();

	}

	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[1]")
	private WebElement eleselectfname1;

	public MergeLeads selectFirstnamemerge() throws InterruptedException{
		Thread.sleep(1000);	
		click(eleselectfname1);
		switchToWindow(0);	
		return new MergeLeads();

	}

	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[6]")
	private WebElement eleselectfname2;

	public MergeLeads selectFirstnamemerge2() throws InterruptedException{
		Thread.sleep(1000);	
		click(eleselectfname2);
		switchToWindow(0);
		return new MergeLeads();

	}

	@FindBy(how=How.XPATH,using="(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleselectid;

	public FindLeads selectId(){

		id = getText(eleselectid);	
		return this;
	}

	@FindBy(how=How.XPATH,using="(//button[@class= 'x-btn-text'])[7]")
	private WebElement eleclickfind;

	public FindLeads clickFind(){

		click(eleclickfind);
		return this;

	}


	@FindBy(how=How.NAME,using="id")
	private WebElement eletypeid;

	public FindLeads typeid(){

		type(eletypeid, id);
		return this;

	}
	@FindBy(how=How.XPATH,using="//div[@class = 'x-paging-info']")
	private WebElement eleverifyresult;

	public FindLeads verifyResult(String data) {

		verifyExactText(eleverifyresult, data);
		return this;

	}
	@FindBy(how=How.XPATH,using="(//button[@class= 'x-btn-text'])[1]")
	private WebElement eleclickfindmerge;

	public FindLeads clickFindmerge(){

		click(eleclickfindmerge);
		return this;
	}
}
