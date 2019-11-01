package gradle.cucumber.step;

import gradle.cucumber.domain.IsItFriday;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class IsItFridayYetStepdefs {

    private IsItFriday isItFriday;
    private String actualAnswer;

    @Given("today is Sunday")
    public void today_is_Sunday() {
        isItFriday = new IsItFriday("Sunday");
    }

    @Given("today is Friday")
    public void today_is_Friday() {
        isItFriday = new IsItFriday("Friday");
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = isItFriday.isItFriday();
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}