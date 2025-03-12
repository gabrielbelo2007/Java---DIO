# Projeto: Validação de Processo Seletivo

## Objetivo

Explorar cenários com fluxo condicionais, repetições e excepcionais.

## Descrição

### Case 1:

Vamos imaginar que em um processo seletivo existe o valor base salarial de R$ 2000,00 e o salário pretendido pelo candidato. Vamos elaborar um controle de fluxo onde:

- Se o valor salarial de base for maior que o valor salarial pretendido, imprima: **LIGAR PARA O CANDIDATO**.
- Caso contrário, se o valor salarial base for igual ao valor salarial pretendido, imprima: **LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA**.
- Por fim, em caso de nenhuma das anteriores, imprima: **AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS**.

```
public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.0); // Ligar para o candidato
        analisarCandidato(2200.0); // Aguardando o resultado dos demais candidatos
        analisarCandidato(2000.0); // Ligar para o candidato com contra proposta
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
```

### Case 2:

Nosso sistema precisa garantir que diante das inúmeras candidaturas, sejam selecionados no máximo 5 candidatos para a entrevista, onde o salário pretendido seja menor ou igual ao salário base.

### Case 3:

Imprimir a lista dos candidatos selecionados para o RH entrar em contato.

### Case 4:

O RH deverá realizar uma ligação com no máximo 3 tentativas para cada candidato selecionado e caso o candidato atenda, deve-se imprimir:

- "CONSEGUIMOS CONTATO COM *[CANDIDATO]* após *[TENTATIVA]*  TENTATIVA(S)".
- Caso contrário imprima: "NÃO CONSEGUIMOS CONTATO COM O *[CANDIDATO]*".

## Certificação

![Modelo](lib/img/Validacao-processo-seletivo.jpg)