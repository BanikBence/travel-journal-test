Feature: ListOwnJournalsFeature
  This feature makes sure, that the journals that you created are visible in the journals page

  Scenario: On the "Your Journal" section user can see the lists of the user's journal
    Given I log in to the site as "http://localhost:8080"
    And I fill the required data as "TesterA" and "TesterA"
    Then I should see the journal as "journal1"