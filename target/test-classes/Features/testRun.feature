Feature: This is my title of my feature

  Background: 
    And I enter username and password
    And I click login

  @Delete
  Scenario: Testing Login feature file
    Then I assert title
    And I click PIM
    And Get list of table
    And Click delete

  @Add
  Scenario Outline: trying mulitple logins
     And I click PIM
    And I click Add
    And I Enter FirstName and LastName
    And Click save button
    And Click Edit
    And Click male Gender
    And Select Nationality
    And Select Marital Status
    And Click Save
    
    

    Examples: 
      | username | password |
      | admin    | admin123 |
