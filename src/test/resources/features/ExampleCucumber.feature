Feature: Login feature

  Scenario Outline: User Login, Input Email And Password
    Given user open "https://test.io/login"
    And user fill  email
    And user fill collom password "qa12345"
    And user click login
    Then user see alert login

Examples:
| Input email  | output |
| qatest@gmail.com  | True   |
| qatest@gmailcom   | False  |