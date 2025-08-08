# Soma dos Múltiplos de 3 ou 5

## 📌 Descrição
Este projeto é uma implementação em **Kotlin** para calcular a soma de todos os números naturais menores que um valor **X** informado, que sejam múltiplos de **3** ou **5**.

Por exemplo, para **X = 10**, os múltiplos encontrados são `3, 5, 6 e 9`, cuja soma é **23**.

O programa foi desenvolvido de forma simples e clara, para fins de aprendizado e como solução de um teste técnico.

---

## 🚀 Funcionalidades
- Recebe um número **X** como entrada (limite superior).
- Calcula e retorna a soma de todos os múltiplos de **3 ou 5** menores que **X**.
- Exemplo:  
  Entrada: `10`  
  Saída: `23`
- Valida se a entrada é um número inteiro positivo.
- Evita contagem duplicada (números múltiplos de 3 **e** 5 são somados apenas uma vez).

---

## 📂 Estrutura do Projeto



---

## 🛠 Tecnologias Utilizadas
- **Kotlin** (linguagem principal)
- **Kotlin Standard Library** (nenhuma biblioteca externa necessária)

---

## 📥 Como Executar

### 1️⃣ Executar no Kotlin Playground (mais fácil)
1. Acesse [https://play.kotlinlang.org/](https://play.kotlinlang.org/).
2. Cole o conteúdo do arquivo `Main.kt`.
3. Clique em **Run**.
4. Digite o valor de **X** quando solicitado.

---

### 2️⃣ Executar no VSCode
1. Instale a extensão **Kotlin** no VSCode.
2. Crie um arquivo chamado `Main.kt` e cole o código.
3. Compile e execute no terminal:
   ```bash
   kotlinc Main.kt -include-runtime -d programa.jar
   java -jar programa.jar
  ``
