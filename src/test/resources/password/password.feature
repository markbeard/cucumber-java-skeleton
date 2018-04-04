#Feature: a feature
#
#  Scenario: a scenario
#    Given a fact
#    When a clause
#    Then a result should be
#    But an exception
#

Feature: Password validator

  Scenario: does a password have a valid length
    Given a password with value "abcd1234"
    When its length is at least 8 characters
    Then it is considered of valid length



