package one.digitalInnovation.collections

fun main() {
    val joao = Funcionario("João",2000.0,"CLT")
    val pedro = Funcionario("Pedro",1500.0,"PJ")
    val roberto = Funcionario("Roberto",3000.0,"CLT")

    val repository = Repositorio<Funcionario> ()

    repository.create(joao.nome, joao)
    repository.create(pedro.nome, pedro)
    repository.create(roberto.nome, roberto)

    println(repository.findById(joao.nome))

    println("--------------------------------")
    repository.findAll().forEach{ println(it) }
    println("--------------------------------")
    repository.remove(roberto.nome)
    println("${roberto.nome} foi excluído")
    repository.findAll().forEach{ println(it) }
}