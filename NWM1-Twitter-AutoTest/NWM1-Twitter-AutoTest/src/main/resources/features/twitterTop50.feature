#Author: your.email@your.domain.com
Feature: twitterTop50.feature

  Scenario: Call user_timeline api By screen_name
    Given pass "stepin_forum" and "4 " to user_timeline api
    When Hit user_timeline api
    Then Verify the user_timeline api response