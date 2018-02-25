package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class UpdateLeadForm extends ProjectMethods {

	public UpdateLeadForm() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleupdatecname;
	
	public UpdateLeadForm updatecname(String data) {
		
		type(eleupdatecname, data);
		return this;

	}
	
	@FindBy(how=How.XPATH,using="(//input[@name = 'submitButton'])[1]")
	private WebElement eleclickupdate;
	
	public ViewLead clickUpdate() {
		
		click(eleclickupdate);
		return new ViewLead();

	}
	
}
