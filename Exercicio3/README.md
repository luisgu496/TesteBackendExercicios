# 📐 Calculadora de Fatorial em Kotlin

Este é um simples programa desenvolvido em **Kotlin** que calcula o **fatorial** de um número natural (inteiro não negativo), atendendo aos requisitos clássicos do problema matemático.  

O fatorial de um número `n` é definido como:

\[
n! = 1 \times 2 \times 3 \times ... \times n
\]

Por definição, temos:
- `0! = 1`
- `1! = 1`

## 🚀 Funcionalidades

- Calcula o fatorial de **qualquer número natural** informado pelo usuário.
- Trata os casos especiais `0!` e `1!`.
- Retorna resultados corretos para valores conhecidos.
- Exibe mensagens de erro para entradas inválidas.

## 🖥️ Exemplo de Uso

Ao rodar o programa:

Digite um número inteiro não negativo para calcular o fatorial:  
5  
5! = 120


## 📋 Requisitos

- [Kotlin](https://kotlinlang.org/) instalado no seu sistema.
- Java JDK 8+ instalado.

## 📂 Estrutura do Projeto


├── Main.kt    # Código-fonte principal do programa                                                                                                                                                
        └── README.md     # Documentação do projeto

# ⚙️ Como Executar

## 1️⃣ Clonar o repositório
```bash
git clone https://github.com/seu-usuario/FatorialKotlin.git
cd FatorialKotlin
```

## 2️⃣ Compilar o programa
```bash
kotlinc Main.kt -include-runtime -d Fatorial.jar
```

## 3️⃣ Executar
```bash
java -jar Fatorial.jar
```

## 📜 Licença
Este projeto está licenciado sob a licença MIT
