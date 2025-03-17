## Encapsulamento

Já imaginou você instalar o *MSN Messenger* e ao querer enviar uma mensagem, fosse solicitado verificar se o computador está conectado a internet e depois pedir para você salvar a mensagem no histórico? Ou tentar enviar um SMS pelo celular primeiro você precisasse consultar manualmente o seu saldo?

Mesmo sendo necessária algumas etapas nos processos citados não é um requisito de visibilidade pública, isso quer dizer que, além da própria classe que possui a responsabilidade de uma determinada ação.

Quanto aos usuários do *MSN Messenger*, só é relevante saber que podemos e como devemos enviar e receber a mensagem, logo, as demais funcionalidades poderão ser consideradas privadas (`private`). E é ai que se caracteriza a necessidade do pilar de Encapusulamento.

```
// Sem o Encapsulamento

MSNMessenger msn =  new MSNMessenger();

msn.validarConectadoInternet();
msn.enviarMensagem();
msn.salvarHistoricoMensagem();

msn.receberMensagem();
```