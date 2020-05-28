Feature: Back to the main page from pictures page
  Go to pictures page, and click on the logo, what open the main page

  Scenario: Back to the main page
    Given Open application main page
    And Upload "test_1.jpg" file
    And Go to the pictures page
    When Click on the logo
    Then Main page should appear