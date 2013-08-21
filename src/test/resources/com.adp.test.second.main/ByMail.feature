Feature: Deliver the Paycheck
  Scenario: Deliver Paycheck correctly to Employee
    Given Employee of levelId 20
    When Deliver PayStub ByMail
    Then Employee should receive PayStub of PayLevel 40
    And  Employee should receive PayStub of PaymentAmount 4000
