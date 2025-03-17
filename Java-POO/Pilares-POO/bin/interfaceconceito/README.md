## Interface

> Não é sobre interface gráfica.

Como vimos anteriormente, **Herança** é um dos pilares de POO, mas uma curiosidade que se deve ser esclarecida em Java é que a mesma não permite o que conhecemos como **Herança Múltipla**.

A medida que surgem novas necessidades, novos equipamentos (objetos) nascem para atender as expectativas de oferecer ferramentas com finalidades bem específicas como por exemplo: Impressoras, Digitalizadoras, Copiadoras e etc...

Observem que não há uma especificação de marca, modelo e ou capacidade de execução das classes citadas acima, isto é o que consideramos o nível abstrato de orientação a objetos que denominamos como **interfaces**.

> Então seria **interfaces** o mesmo que **classes**? Um molde para representação dos objetos reais?

- Este é um dos maiores questionamentos dos desenvolvedores no que se refere a modelo de classes da aplicação.

Como citado acima Java não permite herança múltipla, logo, vamos imaginar que recebemos o desafio de projetar uma nova classe para criar objetos que representem as três características citadas acima e que iremos denonimar de `EquipamentoMultifuncional`, por isso implementamos `interfaces`.

- Quando herdamos de uma inferface, precisamos implementar todos os seus métodos, pois os mesmos são implicitamente `public abstract`.

> A maior referência do uso de abstração de **Interfaces** foi o lançamento do primeiro Iphone, um unico equipamento que pode ser considerado um reprodutor musical, aparelho telefônico e navegador de internet.