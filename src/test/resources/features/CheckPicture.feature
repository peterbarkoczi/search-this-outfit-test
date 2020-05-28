Feature: Check picture of chosen label
  Click on label button, and on the picture page the picture of chosen label should appear

  Scenario Template: : Check the picture
    Given Open application main page
    When Upload a picture: "<filename>"
    And Click on label button
    And Click on picture link
    Then The picture appear on the picture page
    Examples:
      | filename   |
      | test_1.jpg |
      | test_2.jpg |
      | test_3.jpg |
      | test_4.jpg |
      | test_5.jpg |