$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Smoke.feature");
formatter.feature({
  "line": 1,
  "name": "In order to surf different sites",
  "description": "As a user\r\nI want to see the titles",
  "id": "in-order-to-surf-different-sites",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "Setup drivers",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Initializing driver",
  "keyword": "Given "
});
formatter.match({
  "location": "SurfBrowsersTest.initializing_driver()"
});
formatter.result({
  "duration": 2554704962,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Surf different sites",
  "description": "",
  "id": "in-order-to-surf-different-sites;surf-different-sites",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "The site to browse is \"https://the-internet.herokuapp.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User shall get the title \"The Internet\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://the-internet.herokuapp.com/",
      "offset": 23
    }
  ],
  "location": "SurfBrowsersTest.the_site_to_browse_is(String)"
});
formatter.result({
  "duration": 5690383787,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The Internet",
      "offset": 26
    }
  ],
  "location": "SurfBrowsersTest.user_shall_get_the_title(String)"
});
formatter.result({
  "duration": 689971393,
  "status": "passed"
});
});