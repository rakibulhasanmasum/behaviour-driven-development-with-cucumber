@add_new_shipper
Feature: Admin user adds new shipper

  Scenario Outline: Admin user navigates to shipper page and fills up shipper form and creates new account
    Given Admin user is on request page
    When he clicks on the shipper button
    Then a new tab will open and he will be on shipper page respectively

    When Admin user is on shipper index page
    Then he clicks the add shipper button

    Then opens add new shipper page
    And he enters "<shipper name>" in name input field
    And he enters "<company name>" in company name field
    And he enters "<phone number>" in phone number field
    And he selects "<shipper type>" as shipper type
    And clicks create account button

    Examples:
      | shipper name  | company name   | phone number | shipper type |
      | rahim jamidar | maula brothers | 01998877665  | customer     |


#  Scenario: Admin user fill up add shipper form
#    Examples: