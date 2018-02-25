package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods{


	public MergeLeads() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="(//img[@alt = 'Lookup'])[1]")
	private WebElement elefromlevel1;
	
	public FindLeads clickfromlead() throws InterruptedException {
		
		Thread.sleep(3000);
		click(elefromlevel1);
		switchToWindow(1);
			return new FindLeads();
		
		}
	
	@FindBy(how=How.XPATH,using="(//img[@alt = 'Lookup'])[2]")
	private WebElement eletolead;
	
	public FindLeads clicktolead() throws InterruptedException {
		
		Thread.sleep(3000);
		click(eletolead);
		switchToWindow(1);
			return new FindLeads();
		
		}
	
	@FindBy(how=How.CLASS_NAME,using="buttonDangerous")
	private WebElement eleclickmerge;
	
	public ViewLead clickmerge() throws InterruptedException {
		
		Thread.sleep(1000);
		click(eleclickmerge);
		Thread.sleep(2000);
		acceptAlert();
		return new ViewLead();
		
		}
}
