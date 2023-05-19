package sunshinePageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sunshineUtilityPackage.Baseclass;

public class sunshineHomeLocator extends Baseclass {

	public sunshineHomeLocator() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText= "Contact")
	public WebElement ClickContact;
	
	
}
