Feature: Upload image
  Upload a picture and it should appear on the site

  Scenario Template: : Upload image
    Given Open application main page
    When Upload a picture: "<filename>"
    Then The picture should appear on the screen
    Examples:
      | filename    |
      | test_1.jpg  |
      | test_2.jpg  |
      | test_3.webp |