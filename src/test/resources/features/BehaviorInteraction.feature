Feature: Scenario Testing in Test io
  Background: user open https://test.io/

  Scenario: User use behavior function and web element
    Given User click menu services
    When User click button back
    And User click button forward
    And User click button refresh
    And User get Title
    And user get pagesource
    And User get css
    And User get attribute
    And User get size
    And User get Location



