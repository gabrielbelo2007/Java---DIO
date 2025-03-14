package gettersesetters.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno gabriel = new Aluno();

        gabriel.setNome("Gabriel");
        gabriel.setIdade(18);

        System.out.println("O aluno " + gabriel.getNome() + " tem " + gabriel.getIdade() + " anos.");
    }
}
