Feature: In order to surf different sites
	As a user
	I want to see the titles of each site loaded

Background: Setup drivers
Given Initialize driver

@Smoke	
Scenario: Surf different sites
Given The site to browse is "https://the-internet.herokuapp.com/"
Then User shall get the title "The Internet"

# Added Comment

