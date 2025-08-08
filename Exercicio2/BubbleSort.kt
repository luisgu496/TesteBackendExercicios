fun main() {
    val vetor = mutableListOf(5, 3, 2, 4, 7, 1, 0, 6)
    val n = vetor.size

    println("Vetor original:")
    println(vetor)
    println()

    for (i in 0 until n - 1) {
        println("Iteração ${i + 1}:")

        for (j in 0 until n - 1 - i) {
            print("Comparando ${vetor[j]} e ${vetor[j + 1]}... ")

            if (vetor[j] > vetor[j + 1]) {
                val temp = vetor[j]
                vetor[j] = vetor[j + 1]
                vetor[j + 1] = temp
                println("Trocado!")
            } else {
                println("Mantido.")
            }
        }

        println("Vetor após iteração ${i + 1}:")
        val ordenado = vetor.takeLast(i + 1)
        val restante = vetor.dropLast(i + 1)
        println(restante.joinToString(" ") + " [" + ordenado.joinToString(" ") + "]")
        println()
    }

    println("Vetor final ordenado:")
    println(vetor)
}
