Feature: Certificate checking

  @Run
  Scenario: Check certificate
    When I open page "https://certificate.ithillel.ua/"
    And send certificate "45924126"
    And click the field
    Then check the certificate validation "true"