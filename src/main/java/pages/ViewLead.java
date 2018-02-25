package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	
	public ViewLead() {
		
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleverifyfname;
	
	public ViewLead verifyname(String data) {
		
	verifyExactText(eleverifyfname, data);
		return this;
}


	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleverifycname;
	
	public ViewLead verifycname(String data){
		
	verifyPartialText(eleverifycname, data);
	
	return this;
}

	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleclickedit;
	
	public UpdateLeadForm clickEdit() {
		
	click(eleclickedit);
		return new UpdateLeadForm();
}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleclickdelete;
	
	public MyLeads clickDelete() {
		
	click(eleclickdelete);
		return new MyLeads();
}
	
}
