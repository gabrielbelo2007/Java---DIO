## Tipos de Dados

- Palavras reservadas para a representação dos tipos de dados básicos, conhecidos como `tipos primitivos` (*Primitive Types*).

> Os oito tipos primitivos são: 
>
> int, byte, short, long, float, double, boolean e char - não são considerados objetos, representando valores brutos armazenados diretamente na `pilha de memória.` (*Memory Stack*).

| Tipo | Memória | 
|:-----|  ------:| 
| `byte` | 1 byte  | 
|`short` | 2 bytes | 
| `int`  | 4 bytes | 
| `long` | 8 bytes |

- Dados com partes fracionárias

| Tipo | Memória | 
|:------| --------:| 
|`float` | 4 bytes |
| `double` | 8 bytes|

> Qual tipo de dados utilizar para idade e o salário de uma pessoa? Geralmente se usa `int` para a maioria dos números dígitos e `double` para os de ponto flutuante.

```
// Começando com 0 seria necessário usar outro tipo, como String.

int cep = 2107333; 
long cpf = 98765432109L;  // Sempre encerra com L

float pi = 3.14F; // Sempre encerra com F
```

- Java é **fortemente** tipado.

```
// Exemplo

short nmeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal; 
```
> Essa mudança não é possível pois `int` armazena um valor maior do que o `short` comporta.

## Variáveis e Constantes

- Variável é uma área na memória do computador, associada a um nome, que pode armazenar dados com determinado tipo, que define o conjunto de valores e operações.

> O **Java** utiliza identificadores que representam uma referência (*ponteiro*) a um valor em memória, e esta referência pode ser redirecionada a outro valor, por isso o nome variável.

- Constantes são valores armazenados em memória que não podem ser redirecionados a outros valores depois de declarados.

> Em **Java** esses valores são representados pela palavra `final`, seguida do tipo da constante e convencionamente escritas em **CAIXA ALTA**.

