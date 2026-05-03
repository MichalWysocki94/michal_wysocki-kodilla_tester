Feature:  Is it Summer? Everybody likes Summer

  Scenario Outline: Winter isn't Summer

    Given today is <day>
    When  I ask whether it's Summer
    Then  I should be told <answer>
    Examples:
      | day | answer |
      | last day of December | "Nope" |
      | second day of January | "Nope" |
      | 10th day of February  | "Nope" |
      | first day of August | "Yes! Summer!" |
      | 21th day of June    | "Yes! Summer!" |




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