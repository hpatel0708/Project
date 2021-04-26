@End2End
Feature: Validate ChoiceAdvantage Login Page Functionality

Background:
Given User is on the ChoiceAdvantage Login Page 

@Scenario1
Scenario: User should be able to login with valid credentials
When User enters the userid as "hpatel.txa01"
When User enters the password as "Pooja94"
And User clicks on the login button
Then User should be able to land on Welcome Page  

@Scenario2
Scenario: User should  be able to login with invalid credentials
When User enters the userid as "hpatel1.txa01"
When User enters the password as "Goku2021"
And User clicks on the login button
Then User should be able to land on Welcome Page    



@Scenario3
Scenario Outline: User should be able to login with valid credentials
When User enters the "<userid>" and "<password>" 
Then User should be able to land on Welcome Page  
Examples: 
| userid | password |
| hpatel.txa01 | Zoro2020|
| hpatel1.txa01 | Goku2021|

@Scenario4
Scenario Outline: User should be able to login with valid credentials and able to find reservation
When User enters the "<userid>" and "<password>" 
Then User should be able to land on Welcome Page 
Then User clicks on find button
Then User clicks on reservation button
Then User fills up the form using "<lastname>" and "<firstname>" and "<status>" and "<roomtype>"
Then User clicks on the search button to find reservation
Then User should be able to see the list and validate 
Examples: 
| userid | password | lastname | firstname | status | roomtype |
| hpatel.txa01 | Zoro2020 | Lyon | Dwayne | Checked Out| SNK2 | 

 
