public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        for(int  numero = 1; numero <= 5; numero++) {
            if(numero == 3) {
                // break; -> interrompe o código
                continue; // pula para a prox iteração
            }

            System.out.println(numero);
        }
    }
}
