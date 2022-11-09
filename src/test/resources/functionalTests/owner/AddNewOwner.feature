@add_new_owner
Feature: Admin user adds new Owner
  Scenario Outline: Admin user navigates to owner tab and fills up new owner form and creates owner
    Given Admin user is on request page
    When he clicks on the owner button
    Then a new tab will open and he will be on owner page respectively

    Then Admin user is on owner list page
    When he clicks on the add owner button
    Then opens add new owner page
    And he enters "<owner name>" as owner name
    And he types "<owner phone>" as owner phone
    And he clicks type drop down button and selects "<owner type>" as owner type
    Then he clicks on the create account button
    
    Examples:
      | owner name          | owner phone | owner type |
      | Mohaiminul Mohaddes | 01998877666 | owner      |