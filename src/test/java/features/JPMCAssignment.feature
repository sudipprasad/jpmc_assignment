Feature: JP Morgan Logon

  Scenario: Validate JP Morgan Logo from the first Link in Google Search
    Given Open the Google Search Main Page
    When Enter the Search Term "J. P. Morgan" and Search
    Then Validate the Search Result
    And Click on the first click on the result page
    Then Validate the Logo of the page