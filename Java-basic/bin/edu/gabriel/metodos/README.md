## Métodos

> Todas as ações das aplicações são consideradas métodos.

- Uma classe é definida por atributos e métodos. Atributos são, em sua grande maioria, **variáveis** de diferentes tipos e valores. Os métodos, por sua vez, conrrespondem a **funções** ou **sub-rotinas** disponíveis dentro das nossas classes.

### Critérios de nomeação

- São convenções para facilitar nos códigos colaborativos:

> 1. Deve ser nomeado como verbo .
> 2. Seguir o padrão "*camelCase*".

- Em `Java` **não existem** métodos globais. Todos os métodos devem **sempre** ser definidos dentro de uma classe.

### Critérios de definição

- Para saber como definir os métodos, existe uma conveção estrutural:

> 1. **Qual a porposta principal do método?** Você deve se perguntar constantemente até compreender a real finalidade.
> 2. **Qual o tipo de retorno esperado?** Você deve analisar se o método será responsável por retornar um valor ou não.

- Caso o método não retorne nenhum valor, ele será representado pela palavra-chave `void`.

> 3. **Quais os parâmetros serão necessários para execução do método?** Os métodos as vezes precisão de argumentos para serem executados.
> 4. **O método possui o risco de apresentar alguma exceção?** Exceções são comuns, as vezes é necesspario prever e tratar as possíveis exceções.
> 5. **Qual a visibilidade do método?** Será necessário que o método seja visível a toda aplicação, somente em mesmo pacotes, através de herança ou somente a nível a própria classe.

---

```
public class Metodos {
    
    public double somar(int num1, int num2) {
        // Finalidade
        return ...;
    }

    public void imprimir(String texto){
        // Finalidade
        // Sem return
    }

    public double dividir(int dividendo, int divisor) throws Exception {
        // Indica que o metodo pode gerar uma exceção
    }

    private void metodoPrivado(){}
}
```