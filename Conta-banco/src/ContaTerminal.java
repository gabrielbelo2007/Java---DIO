import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner valoresDigitados = new Scanner(System.in)) {

        System.out.print("Digite o número da agência: ");
        int numero = valoresDigitados.nextInt();

        System.out.print("Digite a agência: ");
        String agencia = valoresDigitados.next();

        System.out.print("Digite seu nome: ");
        String nomeCliente = valoresDigitados.next();

        System.out.print("Digite seu saldo: ");
        Double saldo = valoresDigitados.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
         //Encerra o programa
        } catch (Exception e) {
             System.out.println(e);
        }
      }
}
