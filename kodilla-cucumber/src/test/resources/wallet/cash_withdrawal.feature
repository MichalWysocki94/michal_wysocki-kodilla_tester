Feature: Cash Withdrawal

  Scenario Outline: Withdrawal from wallet

    Given I have deposited $<balance> in my wallet
    When I requested $<withdrawal>
    Then $<dispensed> should be dispensed

    Examples:
      | balance | withdrawal | dispensed |
      | 200     | 30         | 30        |
      | 100     | 100        | 100       |
      | 50      | 10         | 10        |
      | 0       | 10         | 0         |
      | 20      | 50         | 0         |
      | -50     | 100        | 0         |