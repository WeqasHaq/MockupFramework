
@tag
Feature: Title of your feature
  I want to use this template for my feature file


  @tag2
  Scenario Outline: Title of your scenario outline
      And I enter "<username>" and "<password>" 
    #Given I want to write a step with <name>
   # When I check for the <value> in step
   # Then I verify the <status> in step

    Examples: 
      | name  | value | status  | username| password|
      | name1 |     5 | success | admin   | admin   |
      | name2 |     7 | Fail    | admin   | admin123|
