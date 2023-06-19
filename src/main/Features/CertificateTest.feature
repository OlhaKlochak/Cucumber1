Feature: Test certificate validation
  Scenario:
    @Olha
    When I send certificate "45924"
    Then check certificate validation "false"

  @Olha
    When I send certificate "45924126"
    Then check certificate validation "true"
  @Olha
    Scenario Outline:
    When I send certificate "<CERTIFICATE>"
    Then check certificate validation "<EXPECTED>"
    Examples:
      | CERTIFICATE | EXPECTED |
      | 4512        | false    |
      | 45924126    | true     |
      | 60932       | false    |
      | 60932709    | true     |
