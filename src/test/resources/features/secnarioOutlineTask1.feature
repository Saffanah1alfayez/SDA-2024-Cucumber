Feature: search for desired words on amazon


  Scenario Outline: search for Keyword on Ebay
    Given the user navigates to the Ebay homepage
    When the user searches for "<value>"
    Then the user verifies that the search results contain "<value>"
    * User closes the page
    Examples:
      | value   |
      | mac     |
      | windows |
      | linux   |