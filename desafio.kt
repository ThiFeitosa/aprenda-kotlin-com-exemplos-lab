// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class Aluno(val martricula: Int, val nome: String, var idade: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int )

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) 

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
}

fun main() {
    val thiago = Aluno(1,"Thiago",28)
    val maria = Aluno(2,"Maria",25)
    val joao = Aluno(3,"João",22)
    
    val dockotlin = ConteudoEducacional("Conhecendo kotlin e sua documentação oficial",1)
    val funckotlin = ConteudoEducacional("O poder das funções em kotlin", 2)
    
    
   // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
   // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}