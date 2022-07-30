Feature: add contact in my jurnal


  Scenario: Success create contact
    Given I already logged in
    When I click contact menu
    Then Contact page appear
    When I click new contact
    Then Create new contact page appear
    When I fill name with "salsabilla"
    And I choose contact type as customer
    When I select Mr. in Contact Name
    And I click add button
    Then Contact with name "salsabilla" is created