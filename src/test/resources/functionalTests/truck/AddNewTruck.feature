@add_new_truck
Feature: Admin user adds new truck
  Scenario Outline:
    Given Admin user is on request page
    When he clicks on the truck button
    Then a new tab will open and he will be on truck page respectively

    When Admin user is on trucks index page
    Then he clicks on the add new truck button
    Then add new truck modal opens to search owner
    And he types "<owner phone>" as owner info on the search field
    And clicks the search button
#    Then owner info card appears with searched owner's information
#    And Admin user checks if the fetched info matches
    Then he clicks on the proceed button for further steps

#    And add new truck form appears
    Then he clicks on the select metro drop down button
    And he selects "<metro>" for truck metro

    Then he clicks select class drop down button
    And he selects "<class>" for truck class

    Then he types "<vehicle number>" as vehicle number

    Then he clicks on the category drop down button
    And he selects "<ton>" as ton, "<feet>" as feet, "<type>" as type
    Then he clicks apply button

    Then he clicks on truck model name drop down button
    And he selects "<model name>" as truck model name


    Then he types "<manufacturing month>" as manufacturing month
    And he types "<year>" as manufacturing year
#    Then he types "<height>" as truck height
#    Then he types "<width>" as truck width
#    Then he types "<length>" as truck length
#    Then he types "<capacity>" as truck capacity

    Then he clicks on the hq drop down button
    And he select "<hq>" as truck hq

    Then he clicks on the stand drop down button
    And he selects "<stand>" as truck stand

    And he clicks add button



    @by_owner_phone
    Examples:
      | owner phone | metro | class | vehicle number | model name | manufacturing month | year | height | width | length | capacity | hq       | stand       | ton | feet | type |
      | 01819616939 | rm    | tha   | 000168         | 1          | 06                  | 1999 | 5      | 5     | 5      | 1000     | BNB | Alikodom | 1   | 7    | open |

    @by_owner_id
    Examples:
      | owner phone | metro | class | vehicle number | model name | manufacturing month | year | height | width | length | capacity | hq       | stand       | ton | feet | type |
      | 134         | dm    | ta    | 199999         | 1          | 06                  | 1999 | 5      | 4     | 5      | 1000     | BNB | Alikodom | 1   | 7    | open |
