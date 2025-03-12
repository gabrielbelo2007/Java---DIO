## Padrão de Nomenclatura

- **Arquivo** `.java`: Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, a seguna palavra também deve ser maiúscula, exemplo:
> Calculadora.java, CalculadoraCientifica.java

- **Nome da classe no arquivo**: A classe deve possuir o mesmo nome do `arquivo.java`, exemplo:
> // arquivo CalculadoraCientifica.java 
> 
> public class CalculadoraCientifica {}

- **Nome de variável**: Toda variável deve ser escrita em *"camelCase"*, variáveis maiúsculas não devem ser alteradas (constantes).

## Declarando variáveis e métodos

- Estrutura de declaração de variável
```
 // Estrutura

 Tipo NomeBemDefinido = atribuição (opcional em alguns casos)

 // Exemplo

 int idade = 17; \
 double altura = 1.75; \
 Dog spike; // Variável sem valor
```

- Estrutura de declaração de métodos
```
 // Estrutura

 TipoRetorno NomeObjetivo Parametro(s)

 // Exemplo

 int somar (int numeroUm, int numeroDois)

 String formatarCep (long cep); 
```

## Identação

- Hierarquia do código, para facilitar a visualização e entendimento.

> Sem hierarquia

```
public class BoletimEstudantil {

public static void main(String[] args) { 
   int mediaFinal = 6; 
   if (mediaFinal < 6) 
   System.out.println("Reprovado"); 
   else if(mediaFinal == 6) \
   System.out.println("Prova Final"); 
   else 
   System.out.println("Aprovado");
   }
}
```

> Com hierarquia

```
public class BoletimEstudantil {
    
    public static void main(String[] args) {
        int mediaFinal = 6;

        if (mediaFinal < 6)
            System.out.println("Reprovado");
        else if(mediaFinal == 6)
            System.out.println("Prova Final");
        else
            System.out.println("Aprovado");
    }
}
```

## Organizando arquivos

- É necessário realizar uma organização dos arquivos de um projeto a medida que eles vão crescendo, através de pacotes (*packages*).

## Java Beans

- Formas de escritas universais, através de conveções, para classes, atributos, métodos e pacotes.

> Variável

<ol>
    <li> Deve ser clara, sem abreviações </li>
    <li> Sempre no singular, exceto arrays ou coleções </li>
    <li> Cuidado com singular e plural </li>
</ol>

> Métodos

- Nomeados em princípio com *"camelCase"*