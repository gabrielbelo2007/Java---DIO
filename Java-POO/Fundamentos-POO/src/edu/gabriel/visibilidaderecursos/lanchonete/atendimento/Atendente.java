package visibilidaderecursos.lanchonete.atendimento;

public class Atendente {
    public void servindoMesa() {
        pegarLancheCozinha();
        System.out.println("SERVINDO A MESA");
    }

    private void pegarLancheCozinha() {
        System.out.println("PEGANDO O LANCHE NA COZINHA");
    }

    public void receberPagamento() {
        System.out.println("RECEBENDO PAGAMENTO");
    }

    @SuppressWarnings("unused")
    void trocarGas() {
        System.out.println("ATENDENTE TROCANDO O GAS");
    }

    @SuppressWarnings("unused")
    private void pegarPedidoBalcao() {
        System.out.println("PEGANDO O PEDIDO NO BALCÃO");
    }
}
