package projectDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.rmi.UnexpectedException;

public class ProjectDefinitions {

    @Given("I have entered my <email>")
    public void i_have_entered_my_email() throws UnexpectedException {

    }

    @Given("I have also selected a <username>")
    public void i_have_also_selected_a_username()throws UnexpectedException {

    }

    @Given("I have also selected a <password>")
    public void i_have_also_selected_a_password()throws UnexpectedException {
    System.out.println("Hej");
    }

    @When("I press sign up")
    public void i_press_sign_up() {

    }

    @Then("the <result> should be on the screen")
    public void the_result_should_be_on_the_screen() {

    }
}
