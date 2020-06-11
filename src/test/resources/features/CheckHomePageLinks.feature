Feature: Check whether the links on home page work properly
  Check all links on home page

  Scenario: Click on "about us" link
    Given Open application main page
    When Click on about us link
    Then About page should appear

  Scenario: Click on "Let's search it!" link
    Given Open application main page
    When Click on lets search it link
    Then Search page should appear