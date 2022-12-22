@webdriver
  Feature: Webdriver methods

    @webdriver1
    Scenario: Open any web page
      Given I go to "bing"
      And I print page details
      And I go back then forward and refresh the page
      
    @webdriver2
    Scenario: Elements step
      Given I navigate to "quote"
      When I fill out first name as "peter" and last name as "orange"
      And I fill out all required fields