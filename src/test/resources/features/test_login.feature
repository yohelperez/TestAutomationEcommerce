#Author Yohel
  #language: en

  #historia de usuario
Feature: loguearse en el sitio web
  Como usuario loguearme en el sitio web laptop seller
  para poder acceder a las funciones de usuario logueado


  Scenario: loguearse en el sitio web
    Given que me encuentro en la pagina web
    When doy click en login e ingreso mis credenciales
    Then puedo ver la seccion de usuario