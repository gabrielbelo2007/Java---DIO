package exercicios.ex1;

public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1200);

        conta.ConsultarSaldo();
        conta.PagarBoleto(1300);
        conta.Depositar(100);
        

        // System.out.println(conta.Depositar(1000));
        // System.out.println(conta.Sacar(100));
        // System.out.println(conta.PagarBoleto(200));
    }
}