Feature: Certificate checking
  @Run
Scenario: Check certificate
  When I open page
  And send certificate "45924126"
Then sout result