package sunshinePageAction;

import org.testng.Assert;

import sunshinePageLocator.sunshineContactLocator;
import sunshineUtilityPackage.Baseclass;
import sunshineUtilityPackage.TestDataClass;

public class sunshineContact extends Baseclass{

	sunshineContactLocator SunshineContactLocator = new sunshineContactLocator();
	
	public void Enteremailaddressincontactemailfield () throws Exception {
		Thread.sleep(3000);
		SunshineContactLocator.EnterEmailAddress.sendKeys(TestDataClass.contactEmail);
		
	}
	
	public void Entercontactnameincontactnamefield () throws Exception {
		Thread.sleep(3000);
		SunshineContactLocator.EnterContactName.sendKeys(TestDataClass.contactName);
		
	}
	public void Entermessageinmessagefield () throws Exception {
		Thread.sleep(3000);
		SunshineContactLocator.EnterMessage.sendKeys(TestDataClass.contactMessage);
		
	}
	
	public void clicksendmessagebutton () throws Exception {
		Thread.sleep(3000);
		SunshineContactLocator.clickSendmMessageButton.click();
	}
	public void Userabletosendamessageafterclickingsendbutton () throws Exception {
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	boolean contactVerify =	SunshineContactLocator.ContactVerification.isDisplayed();
	Assert.assertTrue(contactVerify);
		
	}
}




