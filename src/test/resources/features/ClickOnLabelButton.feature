Feature: Click On label button
  Click on label button, and the clothes should appear

  Scenario Template: : Click on label button
    Given Open application main page
    And Go to the search page
    When Upload a picture: "<filename>"
    And Click on label button
    Then Images should appear
    Examples:
      | filename   |
      | test_1.jpg |
      | test_2.jpg |
      | test_3.jpg |
      | test_4.jpg |
      | test_5.jpg |
