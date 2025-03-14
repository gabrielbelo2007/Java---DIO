package construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("123", "Gabriel");

        marcos.setEndereco("RUA DAS MARIAS");

        // e como definiciar o cpf e o nome?

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
