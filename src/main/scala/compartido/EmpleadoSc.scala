package compartido
import io.circe.Decoder

case class Empleado(
                     nombre: String,
                     apellido: String,
                     edad: Int,
                     puesto: String,
                     salario: Double,
                     fechaContrato: String
                   )

object Empleado:
  given Decoder[Empleado] = Decoder.derived


