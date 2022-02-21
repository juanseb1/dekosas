#Language:en
Feature: Realizar la busqueda de productos por diferentes flujos con archivo de xlsx

  Scenario: Buscar en la pagina de Dekosas productos
    Given Dado que se debe realizar la busqueda por categoria, el home y la barra de busqueda
    When  cuando llamo a los datos en el archivo de excel
    Then hace la busqueda y me muestra resultados