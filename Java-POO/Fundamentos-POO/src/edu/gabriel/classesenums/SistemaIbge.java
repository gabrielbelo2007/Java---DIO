package classesenums;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro estado: EstadoBrasileiro.values()){
            System.out.println(estado.getSigla() + " " + estado.getNome());
        }

        EstadoBrasileiro pernambuco = EstadoBrasileiro.PERNAMBUCO;
        System.out.println(pernambuco.getNome());
        System.out.println(pernambuco.getSigla());
        System.out.println(pernambuco.getIbge());
    }
}
