Feature: ICICI Bank Personal loan apply
  Background:
  @WebScenario
  Scenario: Apply for Personal loan
      Given User is on ICICIbank homepage
      When user hovers on loans
      Then user clicks on personal loan
      When user enters loan details
      And clicks on Apply now
      Then personal loan details second page is opened
