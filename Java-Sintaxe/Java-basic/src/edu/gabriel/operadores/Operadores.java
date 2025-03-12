package edu.gabriel.operadores;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + "Java";

        System.out.println(nomeCompleto);

        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);

        numero = - numero;
        System.out.println(numero);

        numero = numero * -1; 
        // numero = + numero, nao muda o valor pois (+) é arimético
        System.out.println(numero);

        System.out.println(numero ++); // Incrementa depois de printar
        System.out.println(++numero); // Incrementa antes de printar

        boolean variavel = true;
        System.out.println(!variavel); // Nega o valor original

        int a, b;

        a = 6;
        b = 6;

        String resultado;
        // if (a == b) {
        //     resultado = "verdadeiro";
        // } else {
        //     resultado = "falso";
        // }

        resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);
        
        boolean simNao = a == b;
        System.out.println("Número 1 é igual a Número 2? " + simNao);
    }
}
