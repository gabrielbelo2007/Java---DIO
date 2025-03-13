package visibilidaderecursos.lanchonete;

import visibilidaderecursos.lanchonete.area_cliente.Cliente;
import visibilidaderecursos.lanchonete.atendimento.Atendente;
import visibilidaderecursos.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

    public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro();
    // ações que não precisam estar disponíveis para todo estabelecimento

    // cozinheiro.lavarIngredientes();
    // cozinheiro.baterVitaminaLiquidificador();
    // cozinheiro.selecionarIngredientesLanche();
    // cozinheiro.prepararLanche();
    // cozinheiro.prepararVitamina();
    // cozinheiro.prepararCombo();

    // ações que o estabelecimento precisa saber
    // pode ser default

    cozinheiro.adicionarSucoNoBalcao();
    cozinheiro.adicionarLancheNoBalcao();
    cozinheiro.AdicionarComboNoBalcao();

    // Almoxarife almoxarife = new Almoxarife();
    // ações que não precisam estar disponíveis para todo estabelecimento
    
    // almoxarife.controlarEntrada();
    // almoxarife.controlarSaida();

    // ações que só o pacote cozinha precisa saber (default)

    // almoxarife.entregarIngredientes();
    // almoxarife.trocarGas();

    Atendente atendente = new Atendente();
    // atendente.pegarLancheCozinha();
    atendente.receberPagamento();
    atendente.servindoMesa();

    // ação que só o pacote cozinha precisa saber (default)
    
    // atendente.trocarGas();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();

    // ação que não deveria, mas ainda não tem normas de atendimento

    // cliente.pegarPedidoBalcao();

    // acão sigilosa

    // cliente.consultarSaldoAplicativo();

    // clientes não precisam ouvir 

    // cozinheiro.pedirParaTrocarGas(almoxarife);
    // cozinheiro.pedirParaTrocarGas(atendente);
    }
}
