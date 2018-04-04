Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 5 hour
    Then my belly should growl

  Scenario: cukes are missing
    Given I have 10 cukes
    When I count my cukes
    Then I establish how many cukes i need to make 100 cukes

  Scenario: cuke colours
    Given I have 1 cuke
    When I look at my cuke
    Then i know what colour it is

