## Estruturas excepcionais

### Exceções

Ao executar o código Java, diferentes erros podem acontecer: erros de codificação feitos pelo programador, erros devido a entrada errada ou outros imprevistos.

Quando ocorre um erro, o Java normalmente para e fer auma mensagem de erro. O termo técnico para isso é: java lançará uma exceção.

> Um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente. Já exceções é um fluxo inesperado da nossa aplicação, exemplo: Querer dividir um valor por zero, querer abrir um arquivo que não existe, abrir uma conexão de banco com usuário ou senha inválida. Todos esses cenários e os demais não são erros mas sim fluxos não previstos pela aplicação.

### Tratamento de exceções

- A instrução ```try``` permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.

- A instrução ```catch``` permite definir um bloco de código a ser executado, caso ocorra um erro no bloco ```try```.

- A instrução ```finally``` permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. AS palavras-chave ```try``` e ```catch``` vem em pares.

```
try {
    // bloco de código conforme esperado
} catch(Exception e){ // precisamos saber qual exceção
    // bloco de código que captura as exceções que podem acontecer em caso de um fluxo não previsto
}
```

### Hierarquia das exceções

Existe uma variedade ed classes que representam exceções, e estas classes são organizadas em uma hierarquia denominadas **Checked and Unchecked Exceptions** ou *Exceções Checadas e Não Checadas*.

> O que determina uma exceção ser classificado como **checada** ou **não checada**? O risco dela ser disparada logo você precisa tratá-la.

### Exceções customizadas

Nós podemos criar nossas próprias exceções baseadas em regras de negócio e assim melhor direcionar quem for utilizar os recursos desenvolidos no projeto, exemplo:

- Imagina que como regra de negócio, para formatar um cep necessita sempre de ter 8 dígitos, caso contrário lançará uma exceção que denominamos de **CepInvalidoException**.

