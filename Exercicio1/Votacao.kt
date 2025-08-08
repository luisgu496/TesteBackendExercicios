class Votacao(
    val totalEleitores: Int,
    val votosValidos: Int,
    val votosBrancos: Int,
    val votosNulos: Int
) {

    fun calcularPercentualValidos(): Double {
        return (votosValidos.toDouble() / totalEleitores) * 100
    }

    fun calcularPercentualBrancos(): Double {
        return (votosBrancos.toDouble() / totalEleitores) * 100
    }

    fun calcularPercentualNulos(): Double {
        return (votosNulos.toDouble() / totalEleitores) * 100
    }
}

fun main() {
    val votacao = Votacao(
        totalEleitores = 1000,
        votosValidos = 800,
        votosBrancos = 150,
        votosNulos = 50
    )

    println("Percentual de votos válidos: ${votacao.calcularPercentualValidos()}%")
    println("Percentual de votos brancos: ${votacao.calcularPercentualBrancos()}%")
    println("Percentual de votos nulos: ${votacao.calcularPercentualNulos()}%")
}
