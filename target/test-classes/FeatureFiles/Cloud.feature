Feature: Verify the Flipkart Browser
      @PositiveScenario
  Scenario Outline: Verify the product in Flipkart
    Given User should be in Login page of Flipkart and verified "<Phone No>","<Password>"
    When User should search Electronics and select TVs & Appliances
    And User should select any AC  add the AC in the cart add two quatity and print the discount ,Total amount
    And User should place the order and user should navigate to My cart page
    Then User should remove the orders

    Examples: 
      | Phone No   | Password      |
      | 9159157333 | Aadhithyacr18 |

      @negativeScenario
      Scenario Outline: Verify the Flipkart
      Given User should be at Login the page of Flipkart
      When User should login with "<Phone No>" and "<Password>"
      Then User should verify the "Venkatesh" is logged in 
      
      Examples: 
      | Phone No   | Password      |
      | 9159157333 | Aadhithyacr18 |
