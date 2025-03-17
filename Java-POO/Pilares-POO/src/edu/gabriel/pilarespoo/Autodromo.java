package pilarespoo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.setChassi("9089080");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("1982290");
        z400.ligar();

        Veiculo coringa = jeep;

        coringa.ligar();

        coringa = z400;

        coringa.ligar();
    }
}
