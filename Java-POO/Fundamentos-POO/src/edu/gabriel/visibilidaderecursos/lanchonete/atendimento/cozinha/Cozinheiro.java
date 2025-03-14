package visibilidaderecursos.lanchonete.atendimento.cozinha;
@SuppressWarnings("unused")
public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL NO BALCÃO");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }

    public void AdicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println(":PREPARANDO LANCHE");
    }

    private void prepararVitamina() {
        System.out.println("PREPARANDO VITAMINA");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("SELECIONANDO FRUTA, LEITE e SUCO");
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }

    private void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E O OVO");
    }

    //
    // public void pedirParaTrocarGas(Atendente meuAmigo) {
    //     meuAmigo.trocarGas();
    // }

    void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
