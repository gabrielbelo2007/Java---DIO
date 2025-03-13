## Visibilidade de Recursos

### Modificadores

Em Java, utilizamos três palavras reservadas e um conceito default (sem palavra reservada) para definir os quatro tipos de visibilidade de `atributos`, `métodos` e até mesmo `classes` no que se refere ao acesso por outras classes.

> Para uma melhor ilustração, iremos representar os conceitos de visibilidade de recursos através do contexto em uma lanchonete que vende lanche natural e suco.

#### Modificador *public*

Como o próprio nome representa, quando nossa classe, método e atributo é definido como *public*, qualquer outra classe em qualquer outro pacote pode visualizar tais recursos.

#### Modificador *default*

O modificador `default`  está fortemente associado a organização das classes por pacotes, algumas implementações não precisam estar disponíveis por todo o projeto, e este modificador de acesso restringe a visibilidade por pacotes.

Dentro do pacote `lanchonete`, iremos criar dois sub-pacotes para representar a divisão do estabelecimento.

- **lanchonete.atendimento.cozinha**: Pacote que contém classes da cozinha da lanchonete e atendimentos.

- **lanchonete.area.cliente**: Pacote que contém classes relacionadas ao espaço do cliente.