package Pascual_Evelyn.CasoSc

import compartido.{CargaJsonSc, EmpleadoSc}

object AumentoSalarial:
  
  def calcularAumentoSalarial(listaEmpleados: List[EmpleadoSc]): List[EmpleadoSc] =
    listaEmpleados
      .filter(e => e.salario < 5000 && e.puesto.equalsIgnoreCase("Analista de Datos"))
      .map(e => e.copy(salario = e.salario * 1.12))

@main def aplicarAumento(): Unit =
  val empleadosOriginales = CargaJsonSc.cargarEmpleados("/empleados.json")

  val inicio = System.nanoTime()
  val empleadosActualizados = AumentoSalarial.calcularAumentoSalarial(empleadosOriginales)
  val fin = System.nanoTime()

  val duracionMs = (fin - inicio) / 1e6
  println(f"Tiempo de ejecución para la función de AumentoSalarial: $duracionMs%.2f ms")

  println("Lista de empleados con aumento de sueldo:")
  empleadosActualizados.foreach { e =>
    println(f"${e.nombre} ${e.apellido}%-10s - ${e.puesto}: S/. ${e.salario}%.2f")
  }

  