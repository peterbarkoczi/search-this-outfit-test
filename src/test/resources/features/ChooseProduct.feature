Feature: Choose product
  Choose one product

  Scenario Template: Choose product
    Given Open application main page
    And Upload a picture: "<filename>"
    And Click on label button
    When Click on product
    Then Popup should appear
    Examples:
      | filename   |
      | test_1.jpg |
      | test_2.jpg |
      | test_3.jpg |
      | test_4.jpg |
      | test_5.jpg |