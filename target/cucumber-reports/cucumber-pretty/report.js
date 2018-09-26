$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/EtsyComSample.feature");
formatter.feature({
  "name": "Search for items on Etsy",
  "description": "  As a user\n  I want to search for different items\n  So that I will be able to buy necessary items fast",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for particular item",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefenition.i_am_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I accept terms and conditions",
  "keyword": "When "
});
formatter.match({
  "location": "StepsDefenition.i_accept_terms_and_conditions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"handmade paper toy\" items",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefenition.i_search_for_items(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see search results",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefenition.i_see_search_results()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get search results for \"paper toy\" items",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefenition.i_get_search_results_for_items(String)"
});
formatter.result({
  "status": "passed"
});
});