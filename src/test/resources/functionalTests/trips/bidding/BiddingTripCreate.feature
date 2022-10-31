Feature: Shipper Search

  Scenario Outline: Admin user searches for shipper, on behalf of whom he would like to create a bidding trip
    Given Admin user is on request page
    Then Clicks New Trip Create Button
    And Modal to Search Shipper Popups
    Then Enters Shipper ID "<shipper id>"
    And Clicks Search button
    Then Shipper info card appears
    And Admin user checks if the shipper id "<shipper id>" is valid
    Then Clicks on the proceed button
    And This will take Admin user to the Trip Creation Page

    Examples:
      | shipper id | shipper details id | shipper phone |
      | 374624     | 378524             | 01819616939   |