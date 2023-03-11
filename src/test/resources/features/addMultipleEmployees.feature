Feature:Adding multiple employees
  To perform Data Driven Testing in Cucumber  we use Scenario Online

  Scenario Outline: Adding multiple employees
    Given user logs in with valid admin credentials
    And user navigates to the addEmployee page
    When user enters new employees "<First Name>","<Middle Name>", and "<Last Name>"
    And  user clicks on the save button
    Then new employee "<Full Name>" is added successfully
    Examples:
      | First Name | Middle Name | Last Name | Full Name             |
      | Lily       | G.          | Graham    | Lily G. Graham        |
      | Benjamin   | J.          | Parker    | Benjamin J. Parker    |
      | Sophia     | L.          | Kim       | Sophia L. Kim         |
      | David      | A.          | Evans     | David A. Evans        |
      | Gabrielle  | R.          | Thompson  | Gabrielle R. Thompson |


  """
Lily G. Graham
Benjamin J. Parker
Sophia L. Kim
David A. Evans
Gabrielle R. Thompson
"""
