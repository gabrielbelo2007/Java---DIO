package exercicios.ex2;

public class Piloto {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.ligarCarro();

        carro.passarMarcha("+");
        carro.acelerar();
        carro.passarMarcha("+");
        carro.acelerar();
        carro.acelerar();
        carro.passarMarcha("+");
        carro.acelerar();
        carro.desacelar();
        carro.passarMarcha("-");
        carro.acelerar();
        carro.desacelar();
    }
}
