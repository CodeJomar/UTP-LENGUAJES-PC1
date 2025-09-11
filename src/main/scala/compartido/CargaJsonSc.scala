package compartido

import compartido.Empleado
import io.circe.parser.*

import scala.io.Source

object CargaJsonSc:
  def cargarEmpleados(rutaJson: String): List[Empleado] =
    val stream = getClass.getResourceAsStream(rutaJson)
    val contenidoJson = Source.fromInputStream(stream).mkString
    decode[List[Empleado]](contenidoJson).getOrElse(Nil)
    