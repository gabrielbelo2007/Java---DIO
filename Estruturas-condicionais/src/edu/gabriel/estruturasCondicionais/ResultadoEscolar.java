public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;
        int media = 7;

        if(nota >= media){
            System.out.println("Aprovado");
        } else if (nota >= (media - 2)){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
