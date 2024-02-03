 @Smoke
Feature: Argos web

  Background:
    Given User on argos website
    When User accept cookies

  Scenario: Verify Nike search on argos web
    And User enter "Nike" in to search box
    When User click on search bar
    Then User must able to see nike products

  Scenario: Verify Puma search on argos web
    And User enter "Puma" in to search box
    When User click on search bar
    Then User must able to see puma products


