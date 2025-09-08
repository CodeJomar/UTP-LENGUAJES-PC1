package Pascual_Evelyn.CasoSc

import compartido.Empleado

object AumentoSalarial:
  def calcularAumentoSalarial(listaEmpleados: List[Empleado]): List[Empleado] =

    def aplicaAumento(e: Empleado): Boolean =
      e.salario < 5000 && e.puesto.equalsIgnoreCase("Analista de Datos")

    val empleadosConAumento = listaEmpleados
      .filter(aplicaAumento)
      .map(e => e.copy(salario = e.salario * 1.12))

    val empleadosSinCambio = listaEmpleados
      .filterNot(aplicaAumento)

    empleadosConAumento ++ empleadosSinCambio