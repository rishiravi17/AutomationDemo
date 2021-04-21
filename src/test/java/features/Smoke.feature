Feature: In order to surf different sites
	As a user
	I want to see the titles

Background: Setup drivers
Given Initializing driver

@Smoke	
Scenario: Surf different sites
Given The site to browse is "https://the-internet.herokuapp.com/"
Then User shall get the title "The Internet"

#Committing comments.