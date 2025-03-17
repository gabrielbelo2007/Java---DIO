## Pilares do POO

Programação orientada a objetos, é um paradigma de programação baseado no conceito de *"objetos"*, que podem conter dados na forma de campos, também conhecidos como *atributos*, e códigos, na forma de procedimentos, também conhecidos como *métodos*.

Para uma linguagem ser considerada orientada a objetos, esta deve seguir **Os quatro da orientação a objetos**:

- **Encapsulamento**: Nem tudo precisa estar visível, grande parte do nosso algoritmo pode ser distribuído em métodos com finalidades específicas que complementa uma ação em nossa aplicação.

> *Exemplo*: Ligar um veículo exige muitas etapas para a engenharia, mas o condutor só visualiza a ignição, dar a partida e a "magia" acontece.

- **Herança**: Características e comportamentos comuns podem ser elevados e compartilhados através de uma hierarquia de objetos.

> *Exemplo*: Um carro e uma motocicleta possuem propriedades como placa, chassi, ano de fabricação e métodos como acelerar, frear... Logo para não ser um processo de codificação reduntante, podemos desfrutar da herança criando uma `classe Veiculo` para que seja herdada por carro e motocicleta.

- **Abstração**: É a indisponibilidade para determinar a lógica de um ou vários comportamentos em um objeto.

> *Exemplo*: Um veículo determina duas ações como acelerar e frear, logo estes comportamentos deverão ser abstratos pois existem mais de uma maneira de se realizar a mesma operação.

- **Polimorfismo**: São as inúmeras maneiras de se realizar uma mesma ação.

> *Exemplo*: Um veículo determina duas ações como acelerar e frear, primeiramente precisamos identificar se estaremos nos referindo a Carro ou Motocicleta para determinar a ló´gica de aceleração e frenagem dos respectivos veículos.