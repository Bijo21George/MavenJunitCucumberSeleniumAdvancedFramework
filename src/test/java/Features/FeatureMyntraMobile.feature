@MobileScenario
Feature: Order Trousers from Myntra
  Background:
    Given User is on Myntra Homepage
    @MobileScenario
  Scenario: Order Trousers
    When User selects Men
      Then Mens category page is displayed
      When User selects Trousers
      Then Trousers are displayed
      When  User selects first trouser
      And Adds product to Bag
      And User selects size
      And User clicks on Done
      Then GotoBag button is selected