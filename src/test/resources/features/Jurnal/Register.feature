Feature: Register

  Scenario: sign up input valid data
    When user fill out full name
    And user fill out email
    And user fill out phone number
    And user fill out password
    And user fill out confirm password
    And user select on checkbox not a robot
    When user click on create account button
    Then create company page should be appear
    And user fill out company name
    And user select occupation
    And user select industry
    And user select a language
    And user select package feature
    When user click on start using jurnal button
    Then welcome page should be appear