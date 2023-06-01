#Author Yohel
  #language: en

  #historia de usuario
Feature: Agregar articulos al carrito
  Como usuario logueado quiero agregar articulos al carrito
  para poder generar una lista de articulos a comprar


  Scenario: agregar articulos al carrito
    Given que me encuentro logueado y en la pagina principal
    When doy click en agregar al carrito
    Then se actualiza la lista de items en el carrito