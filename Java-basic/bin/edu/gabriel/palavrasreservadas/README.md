## Palavras reservadas

> São identificadores de uma linguagem que já possuem uma finalidade específica, portanto não podem ser usadas para nomeação.

- A linguagem `Java` possui 52 palavras reservadas. Todas essas palavras são classificadas em grupos e escritas com letra minúscula, sendo identificadas com uma cor especial nas IDEs.

### Controle de pacotes

- **import**: importa `pacotes` ou `classes` para dentro do código.
- **package**: especifica a que pacote todas as `classes` de um arquivo pertencem.

### Modificadores de acesso

- **public**: acesso de qualquer `classe`.
- **private**: acesso apenas dentro da `classe`.
- **protected**: acesso por `classes` no mesmo `pacote` e `subclasses`.

### Primitivos

- **boolean**: um valor de `true` ou `false`.
- **byte**: um inteiro de 8-bits (*signed*).
- **char**: um character unicode (*16-bit unsigned*)
- **double**: um número de ponto flutuante de 64-bits (*signed*).
- **float**: um número de ponto flutuante de 32-bits (*signed*).
- **int**: um inteiro de 32-bits (*signed*).
- **long**: um inteiro de 64-bits (*signed*).
- **short**: um inteiro de 32-bits (*signed*).
- **void**: indica que o `método` não retorna valores.
- **null**: valor especial que indica a ausência de um valor.

### Modificadores de classses, variáveis ou métodos

- **abstract**: `classe` que não pode ser instanciada ou `método` que precisa ser implementado por uma `subclasse` não abstrata.
- **class**: especifica uma `classe`.
- **extends**: indica a `superclasse` que a `subclasse` está estendendo.
- **final**: impossibilita que uma `classe` seja estendida, que um `método` seja sobrescrito ou que uma `variável` seja reinicializada.
- **implements**: indica as interfaces que uma `classe` irá implementar.
- **interface**: especifica uma interface.
- **native**: indica que um `método` está escrito em uma linguagem dependente de plataforma, como o `C`.
- **new**: instancia um novo `objeto`, chamando seu construtor.
- **static**: faz um `método` ou `variável` pertencer à `classe` ao invés de às instâncias.
- **strictfp**: usado em frente a um `método` ou `classe` para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões.
- **synchronized**: indica um `método` só pode ser acessado por uma thread de cada vez.
- **transient**: impede a serialização de campos.
- **volatile**: indica que uma `variável` pode ser alterada durante o uso de threads.
- **this**: referência para o `objeto` atual.
- **super**: referência à `classe` pai.

### Controle de fluxo e repetição

- **break**: sai do bloco de código em que ele está.
- **switch**: permite selecionar um entre muitos blocos de código para serem executados.
- **case**: executa um bloco de código dependendo se o teste do `switch` for `true`.
- **default**: define o bloco de código a ser executado se nenhum dos casos do `switch` for `true`.
- **continue**: pula a execução do código que viria após essa linha e vai para a próxima passagem do loop.
- **if**: usado para executar um código se uma condição for `true`.
- **else**: usado com if, para executar código alternativo se a condição for `false`.
- **while**: cria um loop que executa um código enquanto a condição for `true`.
- **do**: executa o código uma vez, mesmo que a condição seja `false` e repete se a condição for `true`.
- **for**: repete um código um número específico de vezes.

### Tratamento de exceções e erros

- **try**: define um bloco de código a ser testado.
- **cacth**: captura exceções do bloco `try`.
- **finnaly**: define um bloco de código a ser executado após o `try`, independente de erro ou não.
- **throw**: usado para lançar uma exceção manualmente.
- **throws**: declara exceções que um método pode lançar.