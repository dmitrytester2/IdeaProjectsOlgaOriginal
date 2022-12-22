$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/predefined.feature");
formatter.feature({
  "name": "Smoke steps",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@predefined"
    }
  ]
});
formatter.scenario({
  "name": "Predefined steps for Google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@predefined"
    },
    {
      "name": "@predefined1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://google.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see page title as \"Google\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iShouldSeePageTitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//input[@name\u003d\u0027q\u0027]\" should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Behavior Driven Development\" into element with xpath \"//input[@name\u003d\u0027q\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element using JavaScript with xpath \"(//input[@name\u003d\u0027btnK\u0027])[1]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementUsingJavaScriptWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for element with xpath \"//*[@id\u003d\u0027res\u0027]\" to be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iWaitForElementWithXpathToBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027res\u0027]\" should contain text \"Cucumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldContainText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});