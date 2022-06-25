Feature: add new product in my jurnal

  Scenario: success add new product
    Given I already logged in
    When I click product menu
    Then Products page is appear
    When I select new product in action dropdown
    Then Create new product page appear
    When I fill name in info with "apple"
    And I fill code with "f322"
    And I add category as "fruit"
    And I add unit as "kg"
    And I fill descriptions "An apple is an edible fruit produced by an apple tree (Malus domestica)"
    And I fill sale unit price "25000"
    And I set default set tax as ppn
    And I select as Create Product
    Then New product is created



