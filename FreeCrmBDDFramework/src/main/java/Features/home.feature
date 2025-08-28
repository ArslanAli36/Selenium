#Feature: Cogmento home Tab
Feature: Parallel execution

#Background:
#Given user has already logged into application
#Given user opens Chrome browser

#Scenario: Cogmento home Tab Scenario
#Given user opens chrome browser
#When user enter "<username>" and "<password>"
#Then user comes on home Tab
#When user clicks on refresh icon
#Then nothing happens
#When user clicks on settings icon
#Then placeholder Show activity stream for is displayed
#When user clicks on about icon
#Then activity_help is displayed
#Then user makes different interactions with website

@Google
Scenario: Google Search Scenario
Given user opens chrome
When user enter google URL
Then google page opens
When enter search value and click google search button
Then google search shows results
Then clicks on first link

@Youtube
Scenario: Youtube Search Scenario
Given user opens chrome browser
When user enter youtube URL
Then youtube page opens
When enter search value and click search button
Then youtube search shows results
Then click the first link

