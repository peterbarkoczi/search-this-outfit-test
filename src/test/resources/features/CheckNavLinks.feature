Feature: Check nav links

  Scenario Template: Check whether nav links are appear in header
    Given Open application main page
    Then "<navLink>" nav link should appear in header
    Examples:
      | navLink  |
      | Home     |
      | Search   |
      | About    |
      | Contacts |

  Scenario: Check Home nav link
    Given Open application main page
    When Click on Home link
    Then Home page should appear


  Scenario: Check Search nav link
    Given Open application main page
    When Click on Search link
    Then Search page should appear


  Scenario: Check About nav link
    Given Open application main page
    When Click on About link
    Then About page should appear

  Scenario: Check Contacts nav link
    Given Open application main page
    When Click on Contacts link
    Then Contacts page should appear