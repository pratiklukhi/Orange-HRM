Feature: Delete Employee details from employee list
@test
  Scenario: User should be able to delete employee successfully

    Given user is on login Page
    When user enter username and password
    And able to successfully login
    And I Click on the PIM from category
    And click on the employee list
    And I enter employee name in employee name text box
    And click on search button
    And I select employee name from the list
    And click on delete Button
    And I click ok of the alert box to confirm the delete name
    Then I should be able to verify that Employee record has been successfully deleted
