package compartido

import compartido.EmpleadoSc
import io.circe.parser.*

import scala.io.Source

object CargaJsonSc:
  def cargarEmpleados(rutaJson: String): List[EmpleadoSc] =
    val stream = getClass.getResourceAsStream(rutaJson)
    val contenidoJson = Source.fromInputStream(stream).mkString
    decode[List[EmpleadoSc]](contenidoJson).getOrElse(Nil)
    