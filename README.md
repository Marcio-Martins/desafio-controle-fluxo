# Desafio de Controle de Fluxo — Java

Exercício da trilha Java Básico da Digital Innovation One (DIO), desenvolvido para praticar estruturas de repetição, condicionais e tratamento de exceções.

## Objetivo

Ler dois números inteiros, validar se o segundo é maior que o primeiro e imprimir uma sequência com a diferença entre eles. Parâmetros em ordem inválida acionam uma exceção personalizada. Entradas que não sejam números inteiros são solicitadas novamente.

## Conceitos praticados

- Entrada de dados pelo terminal
- Estruturas condicionais e laços de repetição
- Exceções personalizadas e validação de parâmetros
- Compilação e execução de classes Java

## Pré-requisitos

- JDK instalado

~~~bash
java -version
javac -version
~~~

## Como compilar e executar

No terminal, entre na pasta do projeto:

~~~bash
cd desafio-java
javac -d out src/*.java
java -cp out Contador
~~~

Informe os dois números inteiros quando solicitado. Por exemplo, para os valores 1 e 5, o programa imprime os números de 1 a 4. Texto ou entradas inválidas são rejeitados e solicitados novamente.

## Cenários para validar manualmente

1. Informe 1 e depois 5: devem ser impressas quatro linhas de contagem.
2. Informe 5 e depois 1: deve ser exibida a mensagem de que o segundo parâmetro deve ser maior.
3. Informe texto no primeiro parâmetro: o programa deve avisar que a entrada precisa ser um inteiro e solicitar novamente.

## Contexto

Projeto educacional para registrar meu aprendizado em Java; não é um aplicativo de produção.

## Autor

Márcio Martins · [Perfil GitHub](https://github.com/Marcio-Martins) · [LinkedIn](https://www.linkedin.com/in/marcio-martins-eufrazio/)
