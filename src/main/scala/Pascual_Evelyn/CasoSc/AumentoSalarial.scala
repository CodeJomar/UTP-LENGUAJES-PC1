package Pascual_Evelyn.CasoSc

import compartido.Empleado

object AumentoSalarial:
  def calcularAumentoSalarial(listaEmpleados: List[Empleado]): List[Empleado] =
    val empleadosConAumento = listaEmpleados
      .filter(_.salario < 5000)
      .map(e => e.copy(salario = e.salario * 1.12))

    val empleadosSinCambio = listaEmpleados
      .filter(_.salario >= 5000)

    empleadosConAumento ++ empleadosSinCambio
    