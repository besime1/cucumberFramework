Feature: Searching existing Employees
  This one os more like imperative style (approach)

  Background:
    And user logs in with valid admin credentials
    * user navigates to the employee list page

  Scenario: Search for an employee by id
    * user enters an existing employee id "0013" in the id-search-field
    When user clicks on the search button
    Then the employee information is displayed on the employee list table

  Scenario: Search for an employee by name
    * user enters an existing employee name "Paul Brown" in the employee name-search-field
    When user clicks on the search button
    Then the employee information is displayed on the employee list tableS.M.A.R.T or I.N.V.E.S.T criteria in Testing. While 'S' in SMART stands for Specific, 'S' in INVEST stands for 'Small' or 'Short'