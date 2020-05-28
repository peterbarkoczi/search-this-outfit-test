Feature: Click On label button
  Check wether clothes are appear when user click on button

  Scenario Template: : Click on label button
    Given Open application main page
    When Upload a picture: "<filename>"
    And Click on label button
    Then Images should appear
    Examples:
      | filename    |
      | test_1.jpg  |
