Feature: Shipper Search
#  Background: Admin user

  Scenario Outline: He searches for shipper,
    Given Admin user is on request page
    Then Clicks New Trip Create Button
    And Modal to Search Shipper Popups
    When Enters Shipper ID "<shipper id>"
    And Clicks Search button
    Then Shipper info card appears
    And he checks if the shipper id "<shipper id>" is valid
    When he Clicks on the proceed button
    Then a new tab will open
    And Now admin user is on trip creation page
    Then he enters the load location "<load location>"
    And selects the 1"st" suggestion
    Then enters the unload location "<unload location>"
    And selects the 1"st" suggestion
    Then he clicks the done button
    And he clicks the next button
    Examples:
      | shipper id | shipper details id | shipper phone | load location | unload location |
      | 374624     | 378524             | 01819616939   | hali          | mani            |