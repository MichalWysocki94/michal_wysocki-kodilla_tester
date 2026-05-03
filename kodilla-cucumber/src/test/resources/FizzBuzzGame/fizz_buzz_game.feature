Feature:  FizzBuzz game

  Scenario Outline: Check what should be returned for a number

    Given The chosen number is <number>
    When  Check fizz buzz result
    Then  Should get "<result>"
    Examples:
      | number | result |
      | 3      | Fizz   |
      | 5      | Buzz   |
      | 15     | FizzBuzz |
      | 13     | None     |




#  Scenario: Winter isn't Summer
#
#    Given today is last day of December
#    When  I ask whether it's Summer
#    Then  I should be told "Nope"
#
#  Scenario: Sumer is Summer
#
#    Given today is first day of August
#    When  I ask whether it's Summer
#    Then  I should be told "Yes! Summer!"