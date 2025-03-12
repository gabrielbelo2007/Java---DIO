package edu.gabriel.tiposevariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500; // 2.500 decimal
        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; 
        System.out.println(numeroCurto2);
        // Precisa do cast (short) para funcionar, não recomendado

        int numero = 5;
        System.out.println(numero);
        numero = 3;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
        // VALOR_DE_PI = 3.15;
    }
}
