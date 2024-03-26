Feature: Cucumber Homework3

  Background:
    Given User go to the page


  Scenario: Enter information of first user

    When  User enter "Sara" as a first name
    And   User enter "Sallllllllllllllllah" as  last name
    And   User enter "20" as age
    And   User select country "Saudi Arabia"
    And   User write "I am the first user" as note
    Then  User click submit

  Scenario: Enter information of second user

    When  User enter "Sam" as a first name
    And   User enter "ediiiiiiiiiiiiiiiiiiiiiii" as  last name
    And   User enter "25" as age
    And   User select country "Germany"
    And   User write "I am the second user" as note
    Then  User click submit


  Scenario: Enter information of third user

    When  User enter "farah" as a first name
    And   User enter "gorgeeeeeeeeeeeeeeeeeee" as  last name
    And   User enter "30" as age
    And   User select country "Japan"
    And   User write "I am the third user" as note
    Then  User click submit


