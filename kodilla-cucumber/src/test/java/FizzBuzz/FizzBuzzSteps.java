package FizzBuzz;

import fizzbuzzchecker.FizzBuzzChecker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSteps {

    private int number;
    private String result;

    @Given("The chosen number is {int}")
    public void the_chosen_number_is(int number) {
        this.number = number;
    }
    @When("Check fizz buzz result")
    public void check_fizz_buzz_result() {
        result = FizzBuzzChecker.checkNumber(number);
    }
    @Then("Should get {string}")
    public void should_get(String expected) {
        assertEquals(expected, result);
    }
}
