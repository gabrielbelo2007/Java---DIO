package pilarespoo;

public class Carro extends Veiculo{

    public void ligar() {
        confereCombustivel();
        confereCambio();
        System.out.println("Carro ligado!");
    }

    // Encapsulamento
    private void confereCombustivel() {
        System.out.println("Confere combustivel");
    }

    private void confereCambio() {
        System.out.println("Confere cambio");
    }
}
