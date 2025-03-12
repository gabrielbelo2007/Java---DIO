## Operadores

- Símbolos especiais que estão associados a determinadas operações.

## Classificação dos operadores

### 1. Atribuição

> Representado pelo símbolo de igualdade `=`

- É utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. Em `Java` definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição.

### 2. Aritméticos

> Representados por `+` (*adição*), `-`(*subtração*), `*` (*multiplicação*) e `/` (*divisão*).

- São utilizados para realizar operações matemáticas entre valores númericos.

> O operador de adição (`+`), quando utilizado em Strings, realiza a concatenação.

### 3. Unários

- São aplicados juntmante com outro operador aritmético, realizam trabalhos de incremento, decremento, inversão de valores e booleanos.

> (`+`) **Operador unário de valor positivo** - números são positivos sem esse operador explicitamente.
>
> (`-`) **Operador unário de valor negativo** - nega um número ou expressão aritmética.
>
> (`++`) **Operador unário de incremento** - incrementa o valor em uma unidade.
>
> (`--`) **Operador unário de decremento** - decrementa o valor em uma unidade.
>
> (`!`) **Operador unário lógico de negação** - nega o valor de uma expressão booleana.

### 4. Ternário

- *Condição Ternária* é uma forma resumida para definir uma condição e escolher entre dois valores. Funciona como um `IF` mas toda a estrutura é escrita em uma linha.

> É representado pelos símbolos `?:` utilizados:

```
<Expressão Condicional> ? <Caso condição seja "true"> : <Caso condição seja "false">
```

### 5. Relacionais

- Avaliam a relação entre duas variáveis ou expressões. Definem o valor à **esquerda** é igual, diferente, menor, menor ou igual, maior, maior ou igual do valor a **direita**, retornando um valor booleano como resultado.

> `==` Verifica se os valores são **iguais**. \
> `!=` Verifica se os valores são **diferentes**. \
> `>` Verifica se um valor é **maior que** o outro. \
> `>=` Verifica se um valor é **maior que** ou **igual** ao outro. \
> `<` Verifica se um valor é **menor que** o outro. \
> `<=` Verifica se um valor é **menor que** ou **igual** ao outro.

- Para avaliar conteúdos entre dois objetos é mais utilizado o parametro `.equals()`, pois ele demonstra `true` mesmo que os objetos sejam de tipos diferentes.

### 6. Lógicos

- Permitem criar expressões lógicas maiores e mais complexas a partir da junção de duas ou mais expressões.

> `&&` Operador Lógico "*and*" \
> `||` Operador Lógico "*or*"