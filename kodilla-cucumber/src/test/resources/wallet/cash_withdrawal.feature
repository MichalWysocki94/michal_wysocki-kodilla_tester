Feature: Cash Withdrawal

  Scenario Outline: Withdrawal from wallet

    Given I have deposited $<balance> in my wallet
    When I requested $<withdrawal>
    Then $<dispensed> should be dispensed
    And the balance of my wallet should be $<updatedBalance>

    Examples:
      | balance | withdrawal | dispensed |  updatedBalance |
      | 200     | 30         | 30        | 170             |
      | 100     | 100        | 100       | 0               |
      | 50      | 10         | 10        | 40              |
      | 0       | 10         | 0         | 0               |
      | 20      | 50         | 0         | 20              |
      | -50     | 100        | 0         | -50             |