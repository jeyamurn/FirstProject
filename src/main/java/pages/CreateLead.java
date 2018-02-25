package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{


	public CreateLead() {
		PageFactory.initElements(driver,this);
	}	
	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecname;
	
	public CreateLead cname(String data) {
		
		type(elecname, data);
		return this;
}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefname;
	
	public CreateLead fname(String data) {
		
		type(elefname, data);
		return this; 
		}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelname;
	
	public CreateLead lname(String data) {
		
		type(elelname, data);
		return this;
		
}

	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elephone;
	
	public CreateLead createphone(String data) {
		
		type(elephone, data);
		return this;
		}	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleclickcreate;
	
	public ViewLead clickCreate() {
		
		click(eleclickcreate);
		return new ViewLead();
		}
	}
		