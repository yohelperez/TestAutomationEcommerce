#Author Yohel
  #language: en

  #historia de usuario
Feature: Editar articulos del website
  Como administrador logueado quiero agregar articulos al website
  para actualizar items listados en el website


  Scenario: Agregar articulos al website
    Given que me encuentro logueado en el website
    When agrego un producto
    Then se actualiza la lista de productos