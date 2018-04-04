package password;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.*;

public class Stepdefs {

    private Password myPass;

    @Given("^a password with value \"([^\"]*)\"$")
    public void a_password_with_value(String arg1) {
        myPass = new Password();
        myPass.setPassValue(arg1);
    }

    @When("^its length is at least (\\d+) characters$")
    public void its_length_is_at_least_characters(int arg1) {

        if(myPass.validateLength(arg1)) {
            System.out.println("Test PASSED");
        }
        else {
            System.out.println("Test FAILED");
        }
    }

    @Then("^it is considered of valid length$")
    public void it_is_considered_of_valid_length() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }


}
