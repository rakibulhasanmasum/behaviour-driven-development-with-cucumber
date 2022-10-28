Feature: Google Search Facebook
  Scenario: Type facebook and search
    Given User is on google home page
    When User search for facebook
    And click on the link containing facebook.com
    Then User should be redirected to facebook.com
