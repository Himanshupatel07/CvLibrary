@Smoke
Feature: Cv library web page

  Background:
    Given User on Cv Library web page
    When User accept cookies on web page

  Scenario: Verify Software Automation job on Cv Library web page
    And User enter "Software Automation" on search box
    When User select Location miles
    Then User click on magglass
    Then User should see a list of relevant job posting

  Scenario: Positive Test -User registers with valid information
    When User click on register button
    And User enters valid email "himpatel_1982@yahoo.co.in" into email box
    And User enter "Omom1omom" into password box
    Then click on Register button

  Scenario: Negative Test - user searches with an invalid job title
    And User enter invaild data "xyz engine" into search box
    And User click on search button
    Then an error message should be displayed

  Scenario: User searches for a job with boundary values with maximum characters
    And User enetr a very long job title "software automation with java expert with api also know python well knowledge of c#" into searchbox
    And User click on search button
    Then User should able to see very long job title posting

  Scenario Outline: User searches for different job titles
    And the user enters "<job_title>" in the search bar
    And clicks the search button
    Then the user should see a list of job postings

    Examples:
      | job_title         |
      | Software Engineer |
      | Data Scientist    |
      | UX Designer        |
      | Project Manager    |
