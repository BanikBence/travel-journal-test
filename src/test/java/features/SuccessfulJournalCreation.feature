Feature: SuccessfulJournalCreation
  This feature deals with the journal creation

  Scenario: You can create a new journal if you are logged in
    Given I log in to the site as "http://localhost:8080" and fill data as "TesterA" and "TesterA"
    When I click the CREATE NEW JOURNAL button
    And I fill the Create journal form with "A magical journey"
    Then I will see the new journal with the data I put in