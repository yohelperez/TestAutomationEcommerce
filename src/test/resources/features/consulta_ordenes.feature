Feature: Seguir las ordenes
  Como usuario logueado quiero buscar la lista de ordenes
  para informarme del estado de ellas
  Scenario: Consultar estado de ordenes
    Given que me encuentro logueado
    When doy click en ordenes
    Then veo la lista de ordenes y su estado