Feature: Redirect to webshop
  Click on a product, and the browser redirect to webshop

  Scenario Template: : Redirect to webshop
    Given Open application main page
    And Go to the search page
    When Upload a picture: "<filename>"
    And Go to product popup
    And Go to the product's webShop page
    Then Product page should appear on webShop
    Examples:
      | filename   |
      | test_1.jpg |
      | test_2.jpg |
      | test_3.jpg |
      | test_4.jpg |
      | test_5.jpg |