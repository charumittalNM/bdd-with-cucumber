#Author: Hackathon@gmail.com
@Pass
Feature:  Call directions Google APIs for punjab

  Scenario: Call directions Google APIs for punjab
    Given create call directions Google APIs
    |origin|destination|
    |amritsar |ludhiana   |
    When Hit call directions Google APIs
    Then Verify the directions Google APIs