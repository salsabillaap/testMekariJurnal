Feature: add new product in my jurnal

  Scenario: success add new product
    Given I already logged in
    When I click product menu
    Then Products page is appear
    When I select new product in action dropdown
    Then Create new product page appear
    And I fill name in info with "namu"
    And I fill code with "A12"
    And I fill sell unit price 25000
    When I select as Create Product
    Then New product is created



