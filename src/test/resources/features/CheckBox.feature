Feature: Scenario Testing in Materializecss
  Background: user open https://materializecss.com/

  Scenario: User use choose element function
    Given User open menu radio button html
    When User click radio button yellow
    Then radio button is selected
    When User click Checkbox red
    Then  checkbox is selected
    When User click dropdow
    Then dropdown is selected