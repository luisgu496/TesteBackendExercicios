# 💻 Algoritmo de Ordenação BubbleSort em Kotlin

Este projeto implementa o algoritmo de ordenação **BubbleSort** em **Kotlin**, ordenando o vetor `{5, 3, 2, 4, 7, 1, 0, 6}` em **ordem crescente** e exibindo o processo passo a passo, atendendo ao Exercício 2 do Teste de Backend da Tiennova.
## 📋 Descrição do Algoritmo

O **BubbleSort** é um algoritmo de ordenação simples que funciona comparando elementos adjacentes (pares consecutivos) e trocando-os de posição se estiverem fora de ordem.  
Esse processo é repetido várias vezes até que o vetor esteja totalmente ordenado.

No caso deste projeto:

- O vetor inicial é:  {5, 3, 2, 4, 7, 1, 0, 6}
- O algoritmo percorre o vetor **n-1 vezes** (`n` = tamanho do vetor).
- Em cada iteração:
- Compara pares de elementos adjacentes.
- Realiza a troca quando necessário.
- Ao final, o maior elemento da iteração vai para o final do vetor e não é mais comparado nas próximas rodadas.
- Exibe no console o estado do vetor ao final de cada iteração, marcando entre **colchetes** os elementos já ordenados.

---

## 📂 Estrutura do Projeto

O projeto é composto por um único arquivo: BubbleSort.kt


---

## 📦 Requisitos para execução

- **Opção 1 — Online (Recomendado para iniciantes)**  
  Basta acessar o [Kotlin Playground](https://play.kotlinlang.org/), colar o código e clicar em **Run**.

- **Opção 2 — Localmente no computador**
  - Java JDK 11 ou superior instalado.
  - Kotlin Compiler instalado ([Guia de instalação](https://kotlinlang.org/docs/command-line.html)).

---

## ▶️ Como executar localmente

1. **Salvar o código** em um arquivo chamado `BubbleSort.kt`.
2. **Abrir o terminal** na pasta onde o arquivo foi salvo.
3. **Compilar o código**:
   
   ```bash
   kotlinc BubbleSort.kt -include-runtime -d BubbleSort.jar
   ```
4. Executar
   
   ```bash
   java -jar BubbleSort.jar
   ```
---

## 📌 Exemplo de saída no console

Vetor original:  
[5, 3, 2, 4, 7, 1, 0, 6]

Iteração 1:  
Comparando 5 e 3... Trocado!  
Comparando 5 e 2... Trocado!  
...  
Vetor após iteração 1:  
3 2 4 5 1 0 6 [7]  

Iteração 2:  
...  
Vetor final ordenado:  
[0, 1, 2, 3, 4, 5, 6, 7]  

---

## 📜 Licença

Este projeto está licenciado sob a licença MIT 

---

## ✍ Autor
Desenvolvido por Luis Gustavo Ferreira Leite  🚀
