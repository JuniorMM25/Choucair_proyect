#autor JR
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at the Choucair Academy with automation course
  @scenario1
  Scenario: Search for a automation course
    Given than Junior wants to learn automation at the academy Choucair
    | strUser     |   strPassword   |
    |4835178|Choucair2021*|
    When he search for the course on the Choucair academy platform
    |strCourse          |
    |Foundation Express |
    Then he finds the course called resources
    |strCourse            |
    |Foundation Express   |
