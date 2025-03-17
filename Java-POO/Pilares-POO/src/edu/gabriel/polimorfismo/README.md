## Polimorfismo 

Podemos observar no contexto de **Abstração** e **Herança** que conseguimos criar uma singularidade estrutural de nossos elementos. Isso quer dizer que qualquer classe que deseja representar um serviço de mensagens, basta estender a classe `ServicoMensagemInstantanea` e implementar os respectivos *métodos abstratos*. O que vale reforçar, é que cada classe ter a mesma ação executando procedimentos de maneira especializada.

> Para concluirmos a compreensão, **Polimorfismo** permite que as classes mais abstratas determinem ações uniformes para que cada classe filha concreta implementem os comportamentos de forma específica.

### Modificador *protect*

Vamos para uma retrospectiva a respeito do nosso sistema de mensagens instantâneas desde a etapa de **Encapsulamento**.

O nosso requisito que solicita que além de Enviar e Receber mensagens precisamos validar se o aplicativo está conectado a internet (`validarConectadoInternet`) e salvar o histórico de cada mensagem (`salvarHistoricoMensagem`).

Sabemos que cada aplicativo costuma salvar as mensagens em seus respectivos servidores cloud, mas e quanto a validar a conexão com a net? Não poderia ser um mecanismo comum à todos? Logo qualquer classe filha de `ServicoMensagemInstantanea` poderia desfrutar através de herança desta funcionalidade.

> Mas fica a reflexão da visibilidade de recursos: O modificador *private* somente a classe conhece a implementação quanto que o modificador *public* todos passarão a conhecer. Mas se quisermos que somente as classes filhas soubessem? Temos o modificador ***protected***.
