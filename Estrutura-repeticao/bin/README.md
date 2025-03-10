## For 

O comando ```for``` permite que uma variável contadora seja testada e incrementada a cada iteração, definindo essas informações na chamada do comando. 

> Recebe como entrada uma variável contadora, uma condição e o valor de incrementação.

```
for (bloco de inicialização, expressão booleana de validação, bloco de incrementação) {

    // comando que será executado até que a expressão de validação torne-se falsa

}
```
> O controle de fluxo ```for``` é muito utilizado para interagir sobre arrays e coleções.

## For / Each

O uso desse comando está fortemente relacionado com um cenário onde existe um array ou coleção, e assim, a interação é baseada nos elementos da coleção.

```
public class ExemploFor {
    public static void main(String[] args) {

        String alunos[] = {"Gabriel", "Bel", "Clara", "Mendes"};

        for (String: aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno;) 

            // Nome do aluno é: Gabriel ...
        }
    }
}
```

## Break / Continue

**Break** quebra o laço onde ele for chamado, e **Continue** interrompe o atual loop e segue para a próxima iteração.

## While

O laço ```while``` determina que enquanto uma condição for válida, o bloco de código será executado. O laço testa a condição antes de executar o código, logo, caso a condição seja inválida o bloco não é executado.

> Estrutura do controle de repetição *while*

```
while (expressão booleana de validação) {
    // comando que será executada até a expressão ser falsa
}
```

## Do While

O laço *do / while*, assim como o laço while, repete um bloco de código enquanto a condição for verdadeira, porém a testagem da condição ocorrer após a primeira execução do código, ou seja, mesmo que a condição seja falsa, o código vai ser executado pelo menos uma vez.

> Estrutura do controle de repetição *do/while*

```
do {
    // comando que será executado indepentende da condição
} while (expressão booleana de validação) {}
```
