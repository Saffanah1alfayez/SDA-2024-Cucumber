Feature: The name of the feature
  Background:
    Given user goes to google page

@samsung
    Scenario: first scenario
      When user search for "samsung"
      Then test the page title contains the word "samaung"
      And close the page
@cucumber
  Scenario: second scenario
    When user search for "cucumber"
    Then test the page title contains the word "cucumber"
    And close the page