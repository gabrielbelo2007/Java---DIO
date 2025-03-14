## Enums

Enum é um tipo especial de classe onde os objetos são previamente criados, imutáveis e disponíveis por toda aplicação.

Usamos *Enum* quando o nosso modelo de negócio contém objetos de mesmo contexto que já existem na aplicação pré-estabelecidos, com a certeza de não haver tanta alteração de valores.

> Exemplos:

- **Grau de Escolaridade**: Analfabeto, Fundamental, Médio, Superior.
- **Estado Civil**: Solteiro, Casado, Divorciado, Viúvo.
- **Estados Brasileiros**: São Paulo, Rio de Janeiro, Piauí, Maranhão.

> Não confunda uma lista de constantes com *Enum*.

Enquanto que uma constante é uma variável de tipo com valor imutável, um *Enum* é um conjunto de objetos já pre-definidos na aplicacação.

Como um *Enum* é um conjunto de objetos, logo, estes objetos podem conter atributos e métodos. Olhe o *Enum* para disponibilizar os quatro estados brasileiros citados acima, contendo informações de: Nome, Sigla e um método que pega o nome de cada estado e já retorna tudo em maiúsculo.