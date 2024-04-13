Feature: Application Login


Background:

When Lanch the browser from config variables
And hit the home page url of banking site


@MobileTest @NetBanking
Scenario: user Page Login

Given User is on Netbanking Landing Page
When User Login into application with "user" and password "7890"
Then Home Page is displayed
And  Cards are displayed


@Mortage @SmokeTest
Scenario Outline: user Page Login

Given User is on Netbanking Landing Page
When User Login into application with "<username>" and password "<password>" combination
Then Home Page is displayed
And  Cards are displayed