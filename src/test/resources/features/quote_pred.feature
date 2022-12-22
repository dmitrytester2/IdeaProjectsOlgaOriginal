@webdriver
  Feature: Webdriver methods

    @wedriver3
    Scenario: Steps for Email, Password and Confirm password
      Given I need to go to the page "Get a Quote"
      And I fill out Email as "abc@abc.com"
      And I fill out Password as "qwerty"
      And I fill out Confirm Password as "qwerty"

    @webdriver4
    Scenario: I create web elements for email, password, confirm password
      Given I navigate to the page "Get a Quote"

    @webdriver5
    Scenario: Submit form with required field
      Given I open page
      And I type first name "peter" and last name "orange"
      And I type my username
      And I fill out the rest of required fields
      Then I assert required fields