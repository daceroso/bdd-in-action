Feature: Show next departing trains

  As a commuter travelling between two stations on the same line
  I want to know that time the next trains for my destination will leave
  So that I can spend less time waiting at the station


  Scenario: Next train goint to the resquested destination on the same line
    Given the T1 train to Chatswood leaves Hornsby at 8:02, 8:15, 8:21
    When Travis want to travel from Hornsby to Chatswood at 8:00
    Then he should be told about the trains at: 8:02, 8:15