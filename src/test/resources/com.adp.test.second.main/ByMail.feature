Feature: Deliver the Paycheck
  Scenario: Deliver Paycheck correctly to Employee
    Given Employee of levelId 20
    When Deliver PayStub ByMail
    Then Employee should receive PayStub of PayLevel 20
    And  Employee should receive PayStub of PaymentAmount 5000
    And Paycheck is delivered through "UPS"