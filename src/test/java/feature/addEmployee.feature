Feature: AddEmployee

  As a admin, I want to add an employee on OrangeHRM website
  So that, I can use all employee features

  @test
  Scenario: User should able to add employee successfully

    Given I am on login page
    When I enters valid username and valid password
    And click on login button
    Then I should able to login successfully
    When I click on PIM in  main menu bar
    And click on add employee
    And I fill all require details
    And click on save button
    Then I can see employee details in personal details page
    When I click on welcome button in main menu bar
    And click on Logout
    Then I can see Login page
    When I enter valid username and valid password
    And click on login button
    Then I can see dashboard page


