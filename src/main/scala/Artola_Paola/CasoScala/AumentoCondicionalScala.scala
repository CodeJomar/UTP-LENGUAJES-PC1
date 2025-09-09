package Artola_Paola.CasoScala

import java.time.LocalDate

case class Empleado(
                     nombre: String,
                     apellido: String,
                     edad: Int,
                     puesto: String,
                     salario: Double,
                     fechaContrato: LocalDate
                   ):

  def formatoAumento: String =
    f"Nombre: $nombre%-10s Antiguo: $salario%.2f Nuevo: ${salario * 1.10}%.2f"

object AumentoSalarial:

  /** Aplica aumento del 10% a empleados con salario < umbral */
  def calcularAumentoSalarial(listaEmpleados: List[Empleado], umbral: Double): List[Empleado] =
    def aplicaAumento(e: Empleado): Boolean =
      e.salario < umbral

    val empleadosConAumento = listaEmpleados
      .filter(aplicaAumento)
      .map(e => e.copy(salario = e.salario * 1.10))

    val empleadosSinCambio = listaEmpleados
      .filterNot(aplicaAumento)

    empleadosConAumento ++ empleadosSinCambio


@main def AumentoCondicionalScala(): Unit =
  val empleadosOriginales = List(
    Empleado("Ana", "García", 28, "Analista de Datos", 4500.0, LocalDate.of(2021, 5, 15)),
    Empleado("Luis", "Martínez", 32, "Desarrollador", 6200.0, LocalDate.of(2019, 9, 3)),
    Empleado("Sofía", "López", 35, "Gerente", 8500.0, LocalDate.of(2016, 2, 20)),
    Empleado("Pedro", "Rodríguez", 29, "Analista de Datos", 5100.0, LocalDate.of(2020, 7, 10)),
    Empleado("María", "Hernández", 31, "Desarrollador", 6500.0, LocalDate.of(2018, 12, 5)),
    Empleado("Miguel", "González", 27, "Analista de Datos", 4800.0, LocalDate.of(2022, 3, 18)),
    Empleado("Juana", "Pérez", 33, "Desarrollador", 5800.0, LocalDate.of(2019, 4, 22)),
    Empleado("David", "Sánchez", 40, "Gerente", 9100.0, LocalDate.of(2015, 8, 14)),
    Empleado("Elena", "Ramírez", 26, "Diseñadora UX", 5200.0, LocalDate.of(2021, 10, 8)),
    Empleado("Lionel", "Torres", 34, "Desarrollador", 6700.0, LocalDate.of(2017, 6, 30)),
    Empleado("Laura", "Flores", 28, "Analista de Datos", 4900.0, LocalDate.of(2020, 1, 12)),
    Empleado("Jorge", "Rivera", 38, "Gerente", 8800.0, LocalDate.of(2016, 11, 25)),
    Empleado("Carmen", "Díaz", 30, "Desarrollador", 6300.0, LocalDate.of(2019, 8, 17)),
    Empleado("Ricardo", "Morales", 29, "Analista de Datos", 4700.0, LocalDate.of(2021, 2, 28)),
    Empleado("Isabel", "Ortiz", 31, "Diseñadora UX", 5400.0, LocalDate.of(2018, 5, 9)),
    Empleado("Fernando", "Cruz", 36, "Desarrollador", 6900.0, LocalDate.of(2017, 3, 14)),
    Empleado("Andrea", "Reyes", 37, "Gerente", 9200.0, LocalDate.of(2015, 10, 3)),
    Empleado("Roberto", "Núñez", 27, "Analista de Datos", 5000.0, LocalDate.of(2022, 6, 19)),
    Empleado("Patricia", "Medina", 32, "Desarrollador", 6400.0, LocalDate.of(2018, 9, 22)),
    Empleado("Daniel", "Vargas", 29, "Diseñador UX", 5300.0, LocalDate.of(2020, 4, 11)),
    Empleado("Gabriela", "Castillo", 26, "Analista de Datos", 4600.0, LocalDate.of(2022, 1, 5)),
    Empleado("Alejandro", "Jiménez", 35, "Desarrollador", 7100.0, LocalDate.of(2017, 7, 28)),
    Empleado("Raquel", "Mendoza", 39, "Gerente", 8700.0, LocalDate.of(2016, 5, 16)),
    Empleado("Héctor", "Guerrero", 28, "Analista de Datos", 4950.0, LocalDate.of(2021, 8, 23)),
    Empleado("Teresa", "Rojas", 33, "Desarrollador", 6600.0, LocalDate.of(2018, 11, 7)),
    Empleado("Óscar", "Silva", 30, "Diseñador UX", 5500.0, LocalDate.of(2019, 3, 15)),
    Empleado("Mónica", "Delgado", 27, "Analista de Datos", 4850.0, LocalDate.of(2022, 5, 30)),
    Empleado("Francisco", "Castro", 34, "Desarrollador", 6800.0, LocalDate.of(2017, 10, 12)),
    Empleado("Lucía", "Vázquez", 41, "Gerente", 9400.0, LocalDate.of(2015, 1, 8)),
    Empleado("Arturo", "Romero", 29, "Analista de Datos", 5050.0, LocalDate.of(2020, 9, 21)),
    Empleado("Silvia", "Álvarez", 31, "Desarrollador", 6250.0, LocalDate.of(2019, 6, 4)),
    Empleado("Rafael", "Chávez", 32, "Diseñador UX", 5600.0, LocalDate.of(2018, 2, 26)),
    Empleado("Beatriz", "Juárez", 28, "Analista de Datos", 4750.0, LocalDate.of(2021, 11, 13)),
    Empleado("Javier", "Miranda", 36, "Desarrollador", 7000.0, LocalDate.of(2017, 1, 29)),
    Empleado("Valeria", "Campos", 38, "Gerente", 8900.0, LocalDate.of(2016, 8, 6)),
    Empleado("Eduardo", "Santos", 30, "Analista de Datos", 5150.0, LocalDate.of(2020, 3, 24)),
    Empleado("Claudia", "Luna", 33, "Desarrollador", 6450.0, LocalDate.of(2018, 7, 18)),
    Empleado("Manuel", "Espinoza", 31, "Diseñador UX", 5700.0, LocalDate.of(2019, 12, 9)),
    Empleado("Adriana", "Mejía", 27, "Analista de Datos", 4925.0, LocalDate.of(2022, 4, 2)),
    Empleado("Sergio", "Acosta", 35, "Desarrollador", 6750.0, LocalDate.of(2017, 9, 27))
  )

  val empleadosConAumento = AumentoSalarial.calcularAumentoSalarial(empleadosOriginales, 5500)

  println("\n=== Empleados Tras Aumento ===")
  empleadosConAumento.foreach(e => println(e.formatoAumento))
