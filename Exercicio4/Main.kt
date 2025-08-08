fun main() {
    print("Digite um número X: ")
    val input = readLine()
    val x = input?.toIntOrNull()

    if (x == null || x <= 0) {
        println("Por favor, digite um número inteiro positivo.")
        return
    }

    val resultado = somaMultiplosDe3Ou5(x)

    println("A soma dos múltiplos de 3 ou 5 abaixo de $x é: $resultado")
}

fun somaMultiplosDe3Ou5(limite: Int): Int {
    var soma = 0
    for (n in 1 until limite) { 
        if (n % 3 == 0 || n % 5 == 0) { 
            soma += n
        }
    }
    return soma
}
