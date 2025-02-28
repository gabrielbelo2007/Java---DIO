## Argumentos

- Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um `array [ ]` de argumetnos do tipo String. Logo podemos após a definição da classe a ser executada informar estes parâmetros, exemplo: 

```
java MinhaClasse argumentoUm argumentoDois
```

>Exemplo

```
public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com índice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm ")
    }
}
```

### Scanner 

- Os índices dos argumentos passados na execução da classe, são atribuídos aos parâmetros na ordem determinada.

> Desta forma percebemos que podemos receber dados digitados pelo usuário do nosso sistema, porém tudo precisa estar em uma linha e também é necessário informar os valores nas posições correspondentes.

- Isso abre margem para erros no programa, e para torná-lo mais seguro vamos receber esses dados via **Scanner**.

- A classe `Scanner` permite que o usuário tenha uma interação mais assertiva com o nosso programa, veja como vamos mudar o nosso programa `AboutMe` para deixar mais intuitivo aos usuários.

```
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Ola me chamo " + nome + " " + sobrenome);
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
```

