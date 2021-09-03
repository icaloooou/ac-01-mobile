import java.math.BigDecimal

// D E U S  É  B O M

fun main() {
    println(idade(25))

    println(data("02","09","2021"))

    println(troca(2,4))

    println(poupanca(1000.00,1))

    println(aumento_salario(2000.00,20))

    println(diferenca(120,140))

    println(diferenca(140,120))

    println(case_salario(1000.00,1))
    //println(case_salario(1000.00,2))
    //println(case_salario(1000.00,3))
    //println(case_salario(1000.00,4))

    println(quadrado_pares(40,200))

    //println(ex11(1,800))

    println(limite(25))


}

//1
fun idade(atual: Int): Int {
    println("Ex 1: ")
    return atual + 25
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
//5
fun aumento_salario (salario:Double,acrescimo:Int) : Double {
    println("Ex 5:")
    var aumento = (salario * acrescimo) / 100
    return salario + aumento

}

//6


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
// fun media(n1:Int, n2:Int, n3: Int , n4:Int?) {
//Deu preguiça, perdão

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
fun limite(limite: Int) :Unit {
    println("Ex 12 : ")
    var valor = Int
    for (valor in 1..limite){
        if (valor % 5 == 0) {
            print("$valor ,")
        }
    }
}



// O  T E M P O  T O D O