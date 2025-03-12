## Escopo

> Representa o ambiente onde uma variável pode ser acessada. Em `Java`, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada.

- A `variável` é criada no primeiro acesso à ela, se tornando inacessível após o interpretador sair do bloco de execução ao qual ela pertence. Portanto não pode ser lida ou manipulada por códigos que estão fora do seu bloco de declaração (*escopo da variável*).

- Em uma `Classe`, podemos visualizar a diferença de escopos. Os `atributos` (*variáveis*) são declarados no corpo principal da `Classe`, sendo acessíveis por todos os métodos.

- Caso você declare uma variável **dentro** de um `método`, o escopo dessa `variável` está limitado apenas ao corpo desse `método`.

---
```
public class Conta {
    // variavel da classe
    double saldo = 10.0;

    public void sacar(Double valor){
        // variavel local do metodo
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        // disponivel em toda classe
        Sytstem.out.println(saldo);
        
        // somente o metodo sacar tem acesso
        System.out.println(novoSaldo) -> ERROR
    }
}
```