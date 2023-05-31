#Author Yohel
  #language: en

  #historia de usuario
  Feature: Consultar items del sitio web
    Como usuario necesito buscar el sitio web laptop seller
    para ver los itmes en venta

  #hay escenarios multiples y singulares (se ejecuta solo un escenario)
  # se puede enviar diferentes filas de parametros para ejecutar la prueba
  #Scenario Outline: envia multiples combinaiciones de parametros

  Scenario: Buscar la pagina del sitio web
    Given que me encuentro en la pagina principal de google
    When busco el link del website
    Then puedo ver los items del sitio



