package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletBalanceSteps {

    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    private Cashier cashier;

    @Given("there is ${int} in my wallet")
    public void there_is_in_my_wallet(Integer amount) {

        wallet.deposit(amount);
    }

    @When("I withdraw ${int}")
    public void i_withdraw(Integer amount) {

        cashier = new Cashier(cashSlot);

        cashier.withdraw(wallet, amount);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {

        assertEquals(0, cashSlot.getContents());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {

        assertEquals(
                "You don't have enough money in your wallet",
                cashier.getMessage()
        );
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {

    }

    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is(Integer expectedBalance) {

        assertEquals(expectedBalance, wallet.getBalance());
    }
}