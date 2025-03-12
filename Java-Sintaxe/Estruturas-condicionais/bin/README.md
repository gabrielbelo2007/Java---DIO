## Estruturas condicionais

- A *Estrutura Condicional* possibilita a escolha de um grupo de ações e comportamentos a serem executadas quanddo determinadas condições são ou não satisfeitas, essas estruturas podem ser **Simples** ou **Compostas**.

### Condicional Simples

Quando uma validação de execução de fluxo ocorre quando a condição é positiva, temos uma estrutura *Estrutura Condicional Simples*. 

### Condicional Composta

Quando o programa deve seguir mais de uma linha de execução condicionada a uma regra, é denominado de *Estrutura Condicional Composta*.

### Condicionais encadeadas

Em um controle de fluxo condicional, nem sempre nos limitamos ao "se" (```if```)  e "senão" (```else```), poderemos ter uma terceira, quarta ou inúmeras condições.

### Condição ternária

É possível abreviar o algoritmo condicional refatorando com o conceito de operador ternário. Com esse operador a condição é posta em apenas uma linha, se for ```true``` o primeiro valor é atribuído na variável, caso seja ```false``` o segundo valor é atribuído.

> Exemplo 1 (*Condição simples*):

```
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;

        String resultado = nota >= 7 ? "Aprovado" :  "Reprovado";

        System.out.println(resultado);  // Aprovado
    }
 }
```

> Exemplo 2 (*Condição composta*):

```
public class  ResultadoEscolar {
    public static void main(String[] args) {
        int note = 6;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado"
        System.out.println(resultado) // Recuperação
    }
}
```

### Switch Case

A estrutura **switch** compara o valor de cada caso com o da variável sequencialmente, e sempre que encontra um valor correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser executados após um caso verdadeiro ser encontrado, acrescentamos o comando **break** no final de cada bloco de códigos, ou utilizamos o ```switch rule```.