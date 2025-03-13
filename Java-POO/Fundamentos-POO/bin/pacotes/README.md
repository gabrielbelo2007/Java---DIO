## Pacotes

São subdiretórios (estrutura de diretórios como `src/edu/gabriel`) a partir da pasta src do nosso projeto onde estão localizadas as classes da linguagem e novas que forem criadas para o projeto, visando a organização das classes para acesso posterior. *Existem algumas convenções do mercado para criação de pacotes.*

### Nomenclatura

> Exemplo empresa chamada **PowerSoft**, desenvolvendo softwares comerciais, governamentais e um software livre.

- **Comercial**: com.powersoft
- **Governamental**: gov.powersoft
- **Código aberto**: org.powersoft

> Isso em conjunto com a organização das classes de acordo com a funcionalidade delas, `model, repository, service, controller, view e util`.

### Identificação

Uma das características de uma classe é a identificação: *Cliente, NotaFiscal, TituloPagar*, porém quando existe a organização por pacotes, passa a ter duas identificações. O nome simples (*Cliente*) e o nome qualificado (**endereçamento do pacote + nome**).

> Considere a classe `Usuario` que está endereçada no pacote `com.controle.acesso.model`, o nome qualificado desta classe é `com.controle.acesso.mode.Usuario`.

### Package e Import

A localização de uma classe é definida pela palavra reservada `package`, logo, uma classe só contém uma definição de package no arquivo, sempre na primeira linha do código. Para a utilização de uma classe existentes em outros pacotes, necessitamos realizar a importação dessas classes.

```
package

import ...
import ...

public classe MinhaClasse {   
}
```


