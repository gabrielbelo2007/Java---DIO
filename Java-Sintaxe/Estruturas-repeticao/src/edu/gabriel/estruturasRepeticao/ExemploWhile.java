
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        Double mesada = 50.0;

        while(mesada > 0){
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada){
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce + "");
            mesada -= valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Gastou toda a mesada em doces!");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
