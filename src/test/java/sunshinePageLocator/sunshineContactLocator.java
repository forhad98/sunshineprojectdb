package sunshinePageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sunshineUtilityPackage.Baseclass;

public class sunshineContactLocator extends Baseclass {

	public sunshineContactLocator() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy (id= "recipient-email")
	public WebElement EnterEmailAddress;
	
	@FindBy (id= "recipient-name")
	public WebElement EnterContactName;
	
	@FindBy (id= "message-text")
	public WebElement EnterMessage;
	
	@FindBy (xpath= "//button[text()='Send message']")
	public WebElement clickSendmMessageButton;
	
	@FindBy (id= "nava")
	public WebElement ContactVerification;
}
