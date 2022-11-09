@bidding_trip_create
Feature: Shipper Search
#  Background: Admin user logs in if not already logged in
#    Given Admin user is on login page
#    Then he clicks the login button

  Scenario Outline: He searches for shipper,
    Given Admin user is on request page
    Then Clicks New Trip Create Button
    And Modal to Search Shipper Popups
    When Enters Shipper ID "<shipper id>"
    And Clicks Search button
    Then Shipper info card appears
#    And he checks if the shipper id "<shipper id>" is valid

    When he Clicks on the proceed button
    Then a new tab will open

    And Now admin user is on trip creation page
    Then he enters the load location "<load location>"
    And selects the 1"st" suggestion
    Then enters the unload location "<unload location>"
    And selects the 1"st" suggestion
    Then he clicks the done button
    And he clicks the next button

    Then this will take him to the trip information tab
    And he clicks truck category button
    When truck category dropdown area expands
    And he selects "<ton>" ton truck
    And he selects "<feet>" feet truck
    And he selects "<type>" as truck type
    And clicks truck category apply button
    Then clicks bidding button to select trip type

    When he clicks the date dropdown button
    And after date dropdown field is being showed
    Then he sees only "<day limits>" days counting from today is selectable only
    And he selects "<date>" as date

    When he clicks the time dropdown button
    Then he selects "<time>" as time

    Then he enters "<shipper budget>" tk as shipper budget
    And he enters "<product details>" as product details

    Then he selects "<payment type>" as payment type
    And finally clicks the PUBLISH TRIP button

    @using_shipper_id
    Examples:
      | shipper id | load location | unload location | ton | feet | type | day limits | date | time     | shipper budget | product details      | payment type |
      | 374624     | hali          | mani            | 1   | 7    | open | 3          | 11   | 03:00 AM | 500            | - Testing Automation | cash         |

    @using_shipper_phone
    Examples:
      | shipper id  | load location | unload location | ton | feet | type | day limits | date | time     | shipper budget | product details      | payment type |
      | 01819616939 | hali          | mani            | 1   | 7    | open | 3          | 11   | 03:00 AM | 500            | - Testing Automation | cash         |
