package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    @Given("I have deposited ${int} in my wallet")
    public void i_have_deposited_$_in_my_wallet(Integer amount) {
        wallet.deposit(amount);
        assertEquals(amount, wallet.getBalance(), "Incorrect wallet balance");
    }
    @When("I requested ${int}")
    public void i_requested_$(Integer amount) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, amount);
    }
    @Then("${int} should be dispensed")
    public void $_should_be_dispensed(Integer expected) {
        assertEquals(expected, cashSlot.getContents());
    }

}
