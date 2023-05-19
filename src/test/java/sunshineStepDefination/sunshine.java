package sunshineStepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import sunshinePageAction.sunshineContact;
import sunshinePageAction.sunshineHome;
import sunshineUtilityPackage.Baseclass;

public class sunshine extends Baseclass {

	sunshineContact SunshineContact = new sunshineContact();
	sunshineHome SunshineHome = new sunshineHome();
	@Given("^open \"([^\"]*)\" URL$")
	public void open_URL(String URL) throws Throwable {
		sunshineURL(URL);
		
	}

	@Then("^Click contact link$")
	public void click_contact_link() throws Throwable {
		SunshineHome.Clickcontactlink();
	}


	@Then("^Enter email address in contact email field$")
	public void enter_email_address_in_contact_email_field() throws Throwable {
		SunshineContact.Enteremailaddressincontactemailfield();
	}

	@Then("^Enter contact name  in contact name field$")
	public void enter_contact_name_in_contact_name_field() throws Throwable {
		SunshineContact.Entercontactnameincontactnamefield();
	}

	@Then("^Enter message in message field$")
	public void enter_message_in_message_field() throws Throwable {
		SunshineContact.Entermessageinmessagefield();
	}

	@Then("^click send message button$")
	public void click_send_message_button() throws Throwable {
		SunshineContact.clicksendmessagebutton();
	}

	@Then("^User able to send a message after clicking send button$")
	public void user_able_to_send_a_message_after_clicking_send_button() throws Throwable {
		SunshineContact.Userabletosendamessageafterclickingsendbutton();
	}


	
}
