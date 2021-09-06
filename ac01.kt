import java.math.BigDecimal

// D E U S  É  B O M

fun main() {
    println(idade(25))
    println(calculaIdade(2021, 2001))
    
    println(data("02","09","2021"))

    println(troca(2,4))

    println(poupanca(1000.00,1))

    println(aumento_salario(2000.00,20))
    
    println(verificar(1005, 98, 125))
    
    println(diferenca(120,140))

    println(diferenca(140,120))
    
    println(media(7.0, 8.0, 6.0))
    
    println(case_salario(1000.00,1))
    //println(case_salario(1000.00,2))
    //println(case_salario(1000.00,3))
    //println(case_salario(1000.00,4))

    println(quadrado_pares(40,200))

    //println(ex11(1,800))
    println(exercicio11())
    
    println(limite(25))
    println(array())


}

//1
fun idade(atual: Int): Int {
    println("Ex 1: ")
    return atual + 25
}
/*esse daqui precisa mostrar sua idade atual, fazendo a conta
do seu ano de nascimento, menos sua idade e ai sim depois
mostrar quantos anos terá daqui 25 anos*/
fun calculaIdade(atual:Int, nascimento:Int){
    var valorIdade: Int = atual - nascimento
    var valorMais25: Int = valorIdade + 25
    println("Sua idade atual é $valorIdade anos, e daqui 25 anos será de $valorMais25")
}

//2
fun data(dia:String, mes:String , ano: String): String {
    println("Ex 2: ")
    println("Dia : $dia , Mês : $mes , Ano $ano" )
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
fun poupanca(deposito:Double, meses : Int) : Double{
    println("Ex 4:")
    var rendimento = (deposito * 1.13) * meses
    return deposito + rendimento
}
/* aqui fiz apenas quanto rendeu e não quanto ficaria no total */
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
//11  esse tá dando ruim
/*
fun ex11(inicio: Int, limite: Int): Unit {
        println("Ex 11 :")
        var valor: Int
        var i = Int
        var ac = Long
        for (valor in inicio..limite) {
            if (valor % 2 == 0) {
                ac = ac + valor
            } else {
                i++
            }
            println("Soma dos pares = $ac")
            println("Quantidade de impares = $i")

        }
    }

*/
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
var vetor1 = IntArray(10){10*(it+1)}
for ((indice, valor) in vetor1.withIndex()){
    println("Elemento [$indice] é $valor ,")

}
}
//14
fun ex14(): Unit  { 
    println("Esqueci de fazer essa")
}

/*
Ex 15 :

O código acima inicia um array com 5 posições

o metodo get() retorna o elemento no indice especificado
o metodo set() insere um elemento passado como parametrono indice especificado

Ao printar o array, o java retorna o código hash do mesmo,porém ao importar a classe java.util.Arrays podemos converter os elementos para string e realizar o print

O metodo plus() adiciona um elemento ao fim do array

o metodo sliceArray() retorna um array delimitado pelos parametros passados 

Os metodos first e last retornam respectivamente o primeiro e ultimo elemento do array, o metodo indexOf retorna o elemento no indice passado como parametro

*/


/*
Ex 16:
- Kotlin Unit é geralmente utilizado quando a função não retorna nenhum valor significante ou realiza alguma outra atividade sem retorno 
- Operadores ternários são uma forma mais simples de realizar operações ou expressões
- Modularização é a divisão de objetos em unidades lógicas independentes, facilitando a manutenção e o reaproveitamento dos códigos

- Formas de passagem de parâmetros em Kotlin: pode se ter os argumentos padrões, para que evite a sobrecarga de métodos; tem tambem os argumentos nomeados, que é para quando chamamos a função e usamos o nome do parametro para isso, isso possibilita a passagem de parametros em qualquer ordem
- Operações seguras: para que uma variável ou função possa receber nulo, tem que ser identificado antes, caso contrário o código dará erro

*/




// O  T E M P O  T O D O
