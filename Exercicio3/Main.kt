fun main() {
    println("Digite um número inteiro não negativo para calcular o fatorial:")

    val input = readLine()

    val numero = input?.toIntOrNull()

    if (numero == null || numero < 0) {
        println("Por favor, digite um número inteiro não negativo válido.")
        return
    }

    val resultado = fatorial(numero)
    println("$numero! = $resultado")
}

fun fatorial(n: Int): Long {
    var resultado = 1L

    for (i in 2..n) {
        resultado *= i
    }

    return resultado
}
