public class ExemploFor {
    public static void main(String[] args) {
        // for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
        //     System.out.println("Contando carneirinhos: " + carneirinhos);
        // }

        String alunos[] = {"Gabriel", "Bel", "Clara", "Mendes"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno na posição x: " + x + " é " + alunos [x]);
        }
    }
}