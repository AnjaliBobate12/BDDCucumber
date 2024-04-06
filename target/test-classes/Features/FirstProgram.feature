Feature: Application Login


Background:
Given setup the entries in database
When Lanch the browser from config variables
And hit the home page url of banking site

@RegressonTest
Scenario: Admin Page Login

Given User is on Netbanking Landing Page
When User Login into application with "admin" and password "1234"
Then Home Page is displayed
And  Cards are displayed


#Reusable
@SmokeTest @RegressionTest
Scenario: user Page Login

Given User is on Netbanking Landing Page
When User Login into application with "user" and password "7890"
Then Home Page is displayed
And  Cards are displayed


@SmokeTest
Scenario Outline: user Page Login

Given User is on Netbanking Landing Page
When User Login into application with "<username>" and password "<password>" combination
Then Home Page is displayed
And  Cards are displayed

Examples:
| username | password |
| debituser | hello1! |
|crdituser | jr444 |


#Regax Pattern

@MobileTest
Scenario Outline: user Page Login 

Given User is on Netbanking Landing Page
When User Login into application with <username> and password "<password>" combination for regax pattern
Then Home Page is displayed
And  Cards are displayed

Examples:
| username | password |
| debituser | hello1! |
|crdituser | jr444 |

Scenario: user Page Login

Given User is on Netbanking Landing Page
When User Login into application with 485 and password <True> combination for regax pattern
Then Home Page is displayed
And  Cards are displayed

