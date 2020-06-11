Feature: Navigate to search page
  Click on "Let's search it!" button, and the upload box should appear

  Scenario: : Go to search page
    Given Open application main page
    When Go to the search page by click search link
    Then The upload box should appear
