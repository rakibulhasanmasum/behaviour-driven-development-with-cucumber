@bidding_trip_create
Feature: Bidding trip create with given examples
  Background: Admin user clicks create trip button

  By the time admin user tries to navigate to the /requests page, he may have been requested to login if he is not logged
  in yet. After a successful login he will be sent to the /requests page where he finds the create trip button on the top
  and he clicks the button in purpose.

    Given Admin user is on login page
    Then he clicks the login button
    And Admin user is on request page
    Then Clicks New Trip Create Button

  Scenario Outline: He searches for shipper, and fills all the necessary input fields and creates a bidding trip
    When Modal to Search Shipper Popups
    And He enters Shipper ID "<shipper id>"
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
      | 374624     | hali          | mani            | 1   | 7    | open | 3          | 16   | 03:00 AM | 500            | - Testing Automation | cash         |

    @using_shipper_phone
    Examples:
      | shipper id  | load location | unload location | ton | feet | type | day limits | date | time     | shipper budget | product details      | payment type |
      | 01819616939 | hali          | mani            | 1   | 7    | open | 3          | 16   | 03:00 AM | 500            | - Testing Automation | cash         |
