#Author: Mayank

#@AddProductToCart @Regression @Smoke @Sanity
Feature: Test Registration and Login Positive flows of Amazon Website

#  @SignIn1 @TestCase1 @Smoke
#  Scenario Outline: Validate that user is able to Login Successfully
#    Given I want to launch the Saucelab URL
#   When I want to enter <username> and <password>
#    Then I click on the submit button
#    And I validate that account login is successfull
#    Then I will quite my browser
    
#	Examples: 
#      | username  			| password 			|
#      | standard_user	| secret_sauce 	|
#      | standard_user1	| secret_sauce1 |

# Step definition or Glue Code
# Agile --> Sprints (2-3 weeks) --> User Stories --> QA Test Cases (Given, When, Then, And Format)

  @SignIn2 @TestCase2 @Smoke @Regression
  Scenario: Validate that user is able to Login Successfully
    Given I want to launch the Saucelab URL
    When I want to enter "username" and "password"
    Then I click on the submit button
    And I validate that account login is successfull
    Then I will quite my browser
    

