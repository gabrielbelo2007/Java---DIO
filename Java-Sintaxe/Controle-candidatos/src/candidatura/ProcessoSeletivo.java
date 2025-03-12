package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatosSelecionados = selecaoCandidato();
        imprimirSelecionados(candidatosSelecionados);

        for(String candidato : candidatosSelecionados){
            ligarCandidato(candidato);
        }
    }

    static void ligarCandidato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando;
        boolean atendeu;

        do { 
            atendeu =  atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado!");
            }
        } while (continuarTentando && tentativasRealizadas < 3); {
            if(atendeu){
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
            } else {
                System.out.println("Não foi possível contato.");
            }
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(String[] candidatosSelecionados) {
        System.out.println("");
        System.out.println("Os candidatos selecinados foram:");
        for(String candidato : candidatosSelecionados){
            System.out.println(candidato);
        }
    }

    static String[] selecaoCandidato() {
        String [] candidatos = {"Gabriel", "Isabel", "Maria", "Clara", "Mendes", "Guilherme", "Leo", "Ian"};
        String [] candidatosSelecionados = new String[5];

        int quantidadeCandidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(quantidadeCandidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou esse valor salarial: " + salarioPretendido);
            
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados[quantidadeCandidatosSelecionados] = candidato;
                quantidadeCandidatosSelecionados++;
            }
            candidatosAtual++;
        }
        return candidatosSelecionados;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

}
