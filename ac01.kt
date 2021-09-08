/*
Felipe Waddington Pereira Jeronymo - 1904837
Hires Serva de Maria Menezes - 1904889
Igor Luan Teles de Souza - 1905365
Ingrid Cristinne Calou Batista - 1904821
Rodrigo Augusto Aniceto Alves - 1904668
Gustavo de Moraes Silva - 1905338

*/

fun main() {
    println(calculaIdade(2021, 2001))

    println(data("02","09","2021"))

    //println(troca(2,4))

    println(poupanca(1000.00))


    println(verificar(1005, 98, 125))

    println(diferenca(120,140))



    println(media(7.0, 8.0, 6.0))

    println(case_salario(1000.00,1))
    //println(case_salario(1000.00,2))
    //println(case_salario(1000.00,3))
    //println(case_salario(1000.00,4))

    //println(quadrado_pares(40,200))


    println(exercicio11())

    //println(limite(25))
    //println(array())
    println(nulltesting(null,null,null,null))

}

//1

fun calculaIdade(atual:Int, nascimento:Int){
    var valorIdade: Int = atual - nascimento
    var valorMais25: Int = valorIdade + 25
    println("Sua idade atual é $valorIdade anos, e daqui 25 anos será de $valorMais25")
}

//2
fun data(dia:String, mes:String , ano: String): String {
    println("Ex 2: ")
    return ("$dia / $mes / $ano")
}

//3
fun troca(x: Int, y : Int){
    println("Ex 3:")
    var x = x
    var y = y
    var aux = x
    x = y
    y = aux
    println("X = $x")
    println("Y = $y")
    // retorna kotlin unit pq não tem retorno?
}

//4

fun poupanca(deposito: Double){
    var rende: Double = (deposito / 100 * 1.3)
    println("Rendeu após 1 mês $rende reais")
}

//5
fun aumento_salario (salario:Double,acrescimo:Int) : Double {
    println("Ex 5:")
    var aumento = (salario * acrescimo) / 100
    return salario + aumento

}

//6
fun verificar(a:Int, b:Int, c:Int){
    if(a > 1000 || a < 100){
        println(a)
        if(b > 1000 || b < 100){
            println(b)
            if(c > 1000 || c < 100)
                println(c)
        }
    }
}

//7
fun diferenca(n1: Int,n2: Int):Int {
    println("Ex 7:")
    if (n1 > n2){
        return n1 - n2
    }
    else {
        return n2 - n1
    }
}


//8
fun media(nota1:Double, nota2:Double, nota3:Double){
    var media: Double = (nota1+nota2+nota3)/3
    if(media > 6.0){
        println("Aluno aprovado")
    } else{
        var N4: Double = 7.0
        media = (media + N4)/3
        if(media > 6){
            println("Aprovado com N4")
        }else{
            println("Reprovado")
        }
    }
}

// 9
fun case_salario(salario: Double,opcao :Int) : Unit {
    println("Ex 9 :")
    var resultado = when (opcao) {
        1 -> println(aumento_salario(salario, 30))
        2 -> println( aumento_salario(salario, 40))
        3 -> println(aumento_salario(salario, 50))
        4 -> println(aumento_salario(salario, 60))
        else -> {
            println( "opcao inválida")
        }
    }
}

//10
fun quadrado_pares(inicio: Int,limite:Int): Unit {
    println("Ex 10 :")
    for (valor in inicio..limite) {
        if (valor % 2 == 0) {
            var quadrado : Int
            quadrado = valor * valor
            print ("$quadrado , ")
        }
    }
}
//11
fun exercicio11(){
    var pares: Int = 0
    var impares: Int = 0
    for(valor in 1..800){
        if(valor % 2 == 0){
            pares += valor
        }
        else{
            impares ++
        }
    }
    println("Soma dos pares: $pares")
    println("Quantidade de impares: $impares")
}

//12
fun limite(limite: Int) :Unit {
    println("Ex 12 : ")
    var valor = Int
    for (valor in 1..limite){
        if (valor % 5 == 0) {
            print("$valor ,")
        }
    }
}
//13
fun array() {
    println("Ex 13 : ")
    val vetor1 = IntArray(10){10*(it+1)}
    for ((indice, valor) in vetor1.withIndex()){
        println("Elemento [$indice] é $valor ,")

    }
}
//14
fun nulltesting(nullableVal1: Int?, nullableVal2: String? , nullableVal3:Int?, nullableVal4: String?) {

    println(nullableVal1?.plus(1)) // safe call



    if (nullableVal2 != null) {
        println(nullableVal2)
    } else {
        var nullableVal2 = "Tratar Null com if"
        println(nullableVal2)
    }

    println(nullableVal3) //Null safety no parametro

    println(nullableVal4?.length ?: "Elvis operator para tratar null") //Elvis operator

}


/*
Ex 15 :

O código  inicia um array com 5 posições

o metodo get() retorna o elemento no indice especificado
o metodo set() insere um elemento passado como parametro no indice especificado

Ao printar o array, o java retorna o código hash do mesmo,porém ao importar a classe java.util.Arrays podemos converter os elementos para string e realizar o print

O metodo plus() adiciona um elemento ao fim do array

o metodo sliceArray() retorna um array delimitado pelos parametros passados

Os metodos first e last retornam respectivamente o primeiro e ultimo elemento do array, o metodo indexOf retorna o elemento no indice passado como parametro

*/


/*
Ex 16:
- Kotlin Unit é geralmente utilizado quando a função não retorna nenhum valor significante ou realiza alguma outra atividade sem retorno

- Operadores ternários são uma forma mais simples de realizar operações ou expressões. Kotlin não possui operadores ternários tradicionais

- Modularização é a divisão de objetos em unidades lógicas independentes, facilitando a manutenção e o reaproveitamento dos códigos

- Formas de passagem de parâmetros em Kotlin: pode se ter os argumentos padrões, para que evite a sobrecarga de métodos; tem tambem os argumentos nomeados, que é para quando chamamos a função e usamos o nome do parametro para isso, isso possibilita a passagem de parametros em qualquer ordem

- Operações seguras: para que uma variável ou função possa receber nulo, tem que ser identificado antes, caso contrário o código dará erro

- Kotlin possui tipagem estática, onde o tipo de dado é declarado na variável ou dinâmica por inferência  onde o primeiro valor declarado define o tipo.
  Kotlin também não permite que um tipo de dado seja alterado no contexto de execução



*/



