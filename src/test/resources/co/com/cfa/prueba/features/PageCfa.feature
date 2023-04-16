#language: es
#Author: Brayant Gamboa Betancur

@RegressionTest
Característica: Realizar 5 escenarios de pruebas
  Yo como usuario
  Necesito realizar 5 escenarios de pruebas diferentes
  Para asegurar una salida a produccion exitosa


  @HomeExitoso
  Esquema del escenario: Validar el home de la pagina principal de cfa
    Dado El usuario ingresa a la pagina
    Cuando el usuario se encuentra en el Home de la pagina
    Entonces se valida que la pagina responda correctamente
#    Ejemplos:

  @BusquedaOficina
  Esquema del escenario: Realizar una busqueda de oficina
    Dado El usuario ingresa a la pagina
    Cuando el usuario busca la opcion de oficina <IdPrueba>
    Entonces se valida que la pagina nos muestre la oficina
    Ejemplos:
      | IdPrueba |
      | 1        |
#
#  @Asociarme
#  Esquema del escenario: Opcion de como asociarme
#    Dado El usuario ingresa a la pagina
#    Cuando el usuario busca la opcion de Como asociarme
#    Entonces se valida que la pagina nos muestre la informacion como asociarme
##    Ejemplos:
#
#  @Fundacion
#  Esquema del escenario: Opcion de Fundacion
#    Dado El usuario ingresa a la pagina
#    Cuando el usuario busca la opcion de Fundacion
#    Entonces se valida que la pagina nos muestre la informacion de la fundacion
##    Ejemplos:
#
#  @FundacionYEmpleo
#  Esquema del escenario: Opcion de Fundacion
#    Dado El usuario ingresa a la pagina
#    Cuando el usuario busca la opcion de Fundacion
#    Y ingresa en la opcion de Empleo
#    Entonces se valida que la pagina nos muestre la informacion empleo
###    Ejemplos:
###      | IdPrueba |
###      | 1        |