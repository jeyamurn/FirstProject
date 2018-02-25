package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods {
	

	public MyLeads() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreate;
	
	public CreateLead clickLead() {
		
		click(elecreate);
		return new CreateLead();

}

	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement elefind;
	
	public FindLeads clickfindlead() {
		
		click(elefind);
		return new FindLeads();

}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement elemerge;
	
	public MergeLeads clickmergelead() {
		
		click(elemerge);
		return new MergeLeads();

}
}