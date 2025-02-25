package edu.gabriel.anatomiaclasses;
public class MinhaClasse {
    
// Metodo
    public static void main (String [] args) {
        String primeiroNome = "Gabriel";
        String segundoNome =  "Belo";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
        System.out.println(calculoMedia(7));
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

    public static String calculoMedia(int mediaFinal) {

        if (mediaFinal < 6)
            return "Reprovado";
        else if(mediaFinal == 6)
            return "Prova Final";
        else
            return "Aprovado";
    }
}
