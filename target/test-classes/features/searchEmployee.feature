Feature: Searching existing Employee

  Scenario: Search for an employee by id
    Given user is on the Exelenter homepage
    And user logs in with valid admin credentials
    * user navigates to the employee list page
    * user enters an existing employee id in the id-search-field
    When user clicks on the search button
    Then the employee information is displayed on the employee list table

  Scenario: Search for an employee by name
    Given user is on the Exelenter homepage
    And user logs in with valid admin credentials
    * user navigates to the employee list page
    * user enters an existing employee name in the employee name-search-field
    When user clicks on the search button
    Then the employee information is displayed on the employee list table

     #Tip1: Ideally, declarative approach (shorter,behavior-driven) is preferred for writing steps in Gherkin
  #in rare scenarios, we do need imperative style (longer,detailed, and procedural-driven)
  # Tip2: Try to kep your steps within 7-8 Or less steps, shorter is better.If more than 7 steps, try to break it into smaller steps.
  # Remember S.M.A.R.T or I.N.V.E.S.T criteria in Testing. While 'S' in smart stands for specific, 'S' in INVEST stands for 'small' or 'short