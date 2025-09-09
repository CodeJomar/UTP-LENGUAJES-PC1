package Pascual_Evelyn.CasoSc

@main def aplicarAumento(): Unit =
  val empleadosOriginales = CargaJson.cargarEmpleados("/empleados.json")

  val inicio = System.nanoTime()
  val empleadosActualizados = AumentoSalarial.calcularAumentoSalarial(empleadosOriginales)
  val fin = System.nanoTime()

  val duracionMs = (fin - inicio) / 1e6
  println(f"Tiempo de ejecución para la función de AumentoSalarial: $duracionMs%.2f ms")

  println("Lista de empleados con sueldo actualizado:")
  empleadosActualizados.foreach { empleado =>
    println(f"${empleado.nombre} ${empleado.apellido} - ${empleado.puesto}: S/. ${empleado.salario}%.2f")
  }

  