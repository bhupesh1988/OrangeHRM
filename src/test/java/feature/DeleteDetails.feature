Feature: Delete Employee Details From Employee list



  @test2
  Scenario: UserShouldBeToDeleteEmployeeDetails
    Given user is in Loging Page
    When user Enter DefaultUserId And Password.
    And user can able to log in
    And user Click on the PIM category
    And user click on the Employee list
    And user enter Emloyee Name on EmployeeName search bar
    And user click on search button
    And user select name from the list
    And user click on Delete Button
    And user click ok on the alartbox to confirm the delete action
    Then I should be able to verify that Employee Record successfully deleted
