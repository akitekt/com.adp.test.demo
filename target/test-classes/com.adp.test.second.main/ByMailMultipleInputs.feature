Feature: Deliver multiple Paychecks
  Scenario: Deliver multiple Paychecks correctly to all the Employees
    Given the following employee exist:
      | Peter | aslak@email.com | 20    |
      | Matt  | matt@email.com  | 25    |
    Then I should see the following paychecks:
      | Peter | 4000     |
      | Matt  | 5000     |
