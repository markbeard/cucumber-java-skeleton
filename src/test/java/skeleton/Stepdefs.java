package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.*;



public class Stepdefs {

    private Belly myBelly;
    private CukeAccount myCukes;

    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        myBelly = new Belly();
        myBelly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int arg1) {
        // Write code here that turns the phrase above into concrete actions
       System.out.println("*** " + myBelly.bellyWait(arg1));
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("*** " + myBelly.growl());
    }

    /* Scenario for counting cukes */

    @Given("^I have (\\d+) cukes$")
    public void i_have_cukes(int arg1) {
        myCukes = new CukeAccount();
        myCukes.openAccount(arg1, "green", "mark");
    }

    @When("^I count my cukes$")
    public void i_count_my_cukes() {
        System.out.println(("*** " + "My cuke account has " + myCukes.howMany() + " cukes\n"));
    }

    @Then("^I establish how many cukes i need to make (\\d+) cukes$")
    public void i_establish_how_many_cukes_i_need_to_make_cukes(int arg1) {
        System.out.println("*** " + "To have the minimum number of cukes (" + arg1 +
        ") - I need an extra " + myCukes.defecit(arg1) + " cukes.\n");
    }

    // ----------------------------------------

    @Given("^I have (\\d+) cuke$")
    public void i_have_cuke(int cukeCount) {
        myCukes = new CukeAccount();
        myCukes.openAccount(cukeCount, "green", "Mark");
    }

    @When("^I look at my cuke$")
    public void i_look_at_my_cuke() {
        System.out.println(myCukes);
        System.out.println("I am looking at cuke " + myCukes.lookAt() + "\n");

    }

    @Then("^i know what colour it is$")
    public void i_know_what_colour_it_is() {
        System.out.println("my cuke is " + myCukes.getColour() + " in colour" + "\n");
    }




}
