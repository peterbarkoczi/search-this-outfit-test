Feature: Check labels for uploaded picture
  Upload a picture and the labels should appear

  Scenario: Check labels
    Given Open application main page
    When Upload a picture
    Then The labels should appear