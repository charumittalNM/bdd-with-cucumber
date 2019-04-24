#Author: Hackathon@gmail.com
@Pass1
Feature: Call directions Google APIs for haryana

  Scenario: Call directions Google APIs for haryana
    Given create call directions Google APIs
    |origin|destination|
    |Gurugram|sonipat   |
    When Hit call directions Google APIs
    Then Verify the directions Google APIs
   