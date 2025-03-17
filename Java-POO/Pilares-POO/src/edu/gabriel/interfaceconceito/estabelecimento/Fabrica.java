package interfaceconceito.estabelecimento;

import interfaceconceito.equipamentos.copiadora.Copiadora;
import interfaceconceito.equipamentos.digitalizadora.Digitalizadora;
import interfaceconceito.equipamentos.impressora.Impressora;
import interfaceconceito.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
