Feature: Food Order

  Scenario: A user should be able to add food to cart
    Given a user is on Swiggy landing page
    When he enters Bagalore,Karnataka,India in search box
    And he clicks on Go button
    And he clicks on the first restaurant on the page
    And he clicks Add on the first item of the restaurant page
    And he clicks on Checkout button  
    Then he must be on the Checkout page

