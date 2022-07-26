package one.digitalInnovation.collections

data class Funcionarios (
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """
            Nome: ${nome}
            Salário: ${salario}
            Tipo de contrato: ${tipoContratacao}
        """.trimIndent()}