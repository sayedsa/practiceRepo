package StepDefinitions;

import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends Base {

	@Given ("^User is on Hotel page$")
	public void user_is_Hotel_page() {
		Base.initialize();
	}
	
	@When("^User click on Login$")
	public void user_click_on_login () {
	}
	
	@Then ("^User should see Login page$")
	public void user_should_see_login_page () {
		
	}
}
