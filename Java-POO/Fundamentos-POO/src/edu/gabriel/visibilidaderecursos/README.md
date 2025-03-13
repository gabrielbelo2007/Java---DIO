## Visibilidade de Recursos

### Modificadores

Em Java, utilizamos três palavras reservadas e um conceito default (sem palavra reservada) para definir os quatro tipos de visibilidade de `atributos`, `métodos` e até mesmo `classes` no que se refere ao acesso por outras classes.

> Para uma melhor ilustração, iremos representar os conceitos de visibilidade de recursos através do contexto em uma lanchonete que vende lanche natural e suco.

#### 1. Modificador *public*

Como o próprio nome representa, quando nossa classe, método e atributo é definido como *public*, qualquer outra classe em qualquer outro pacote pode visualizar tais recursos.

#### 2. Modificador *default*

O modificador `default`  está fortemente associado a organização das classes por pacotes, algumas implementações não precisam estar disponíveis por todo o projeto, e este modificador de acesso restringe a visibilidade por pacotes.

Dentro do pacote `lanchonete`, iremos criar dois sub-pacotes para representar a divisão do estabelecimento.

- **lanchonete.atendimento.cozinha**: Pacote que contém classes da cozinha da lanchonete e atendimentos.

- **lanchonete.area.cliente**: Pacote que contém classes relacionadas ao espaço do cliente.

#### 3. Modificador *private*

Depois de reestruturar nosso estabelecimento (*projeto*), onde, temos as divisões (*pacotes*) espaço do cliente e atendimento, chegou a hora de refletir sobre visibilidade e modificadores de acesso. 

Conhecemos as ações disponíveis nas classes `Cozinheiro`, `Almoxarife`, `Atendente` e `Cliente`, mesmo com a organização da visibilidade por pacote, será se realmente estas classes precisam ser tão explicitas?

- Será que o `Cozinheiro` precisa saber que/como o `Almoxarife` controla a entrada e saída?

- Que o `Cliente` precisa saber como o `Atendenten` recebe o pedido para servir sua mesa?

- Que o `Atendente` precisa saber que antes de pagar o `Cliente` consulta o saldo?

> A visibilidade de recursos da linguagem não está associada a *interface gráfica*, mas sim, ao que as classes consegueum acessar uma das outras.

#### 4. Modificador *protect*