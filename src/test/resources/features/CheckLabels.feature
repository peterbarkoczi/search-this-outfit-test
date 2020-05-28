Feature: Check labels for uploaded picture
  Upload a picture and the labels should appear

  Scenario Template: : Check labels
    Given Open application main page
    When Upload a picture: "<filename>"
    Then The labels should appear
    Examples:
      | filename   |
      | test_1.jpg |
      | test_2.jpg |
      | test_3.jpg |
      | test_4.jpg |
      | test_5.jpg |