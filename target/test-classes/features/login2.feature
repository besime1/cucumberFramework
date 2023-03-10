@login2
Feature: Login Test
  This is my Description and it is totally optional-  where your feature ,in more details.

  #This declarative style
  Scenario: valid admin login
    When  admin user logs in with valid credentials
    Then admin user logs in successfully

  Scenario:valid ess login
    When ess user logs with valid credentials
    Then ess user logs in successfully

  Scenario Outline:
    When user enters a valid "<username>" and a "<password>"
    And user clicks on the login button
    Then user logs in successfully and a "<message>" is displayed
    Examples:
      | username | password         | message       |
      | Admin    | Exelent2022Sdet! | Welcome Admin |
      | EssUser  | Ess@2023         | Welcome John  |
      | EssUser  | Ess@2023         | Welcome John  |

    #simmilar to DataProvider in TestNg
  #.ctrl+alt+L tdy for examples