package exercicios.ex3;

public class Petshop {
    public static void main(String[] args) {
        Maquina maquina = new Maquina();

        maquina.colocarPet();
        maquina.colocarPet();
        maquina.darBanho();
        maquina.retirarPet();
        maquina.colocarPet();
        maquina.retirarPet();
        maquina.verificarAgua();
        maquina.verificarShampoo();
    }
}
