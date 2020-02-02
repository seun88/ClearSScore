Feature: Log in
  As a registered customer
  i would like to log into my account

  Scenario Outline: Customer logs in with valid details
    Given i navigate to clearscore web
    And input "<Email>"
    And input "<Password>"
    When i click login button
    Then i am logged in

    Examples:
    |Email|Password|
    |seunakinbode@yahoo.com|Serah1988|
    |yemisi91@hotmail.com  |Qualityanalyst1|

  Scenario Outline: Customer logs in with invalid details
    Given i navigate to clearscore web
    And input "<Email>"
    And input "<Password>"
    When i click login button
    Then i am logged in

    Examples:
      |Email|Password|
      |seunakinbode@yahoo.com|Serah1988|
      | |Qualityanalyst1|