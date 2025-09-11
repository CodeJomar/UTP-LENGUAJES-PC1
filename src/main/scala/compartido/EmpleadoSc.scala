package compartido
import io.circe.Decoder

case class EmpleadoSc(
                     nombre: String,
                     apellido: String,
                     edad: Int,
                     puesto: String,
                     salario: Double,
                     fechaContrato: String
                   )

object EmpleadoSc:
  given Decoder[EmpleadoSc] = Decoder.derived


