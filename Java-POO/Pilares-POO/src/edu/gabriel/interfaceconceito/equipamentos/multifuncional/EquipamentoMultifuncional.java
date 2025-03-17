package interfaceconceito.equipamentos.multifuncional;

import interfaceconceito.equipamentos.copiadora.Copiadora;
import interfaceconceito.equipamentos.digitalizadora.Digitalizadora;
import interfaceconceito.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Multifuncional COPIANDO");
    }

    @Override
    public void digitalizar() {
        System.out.println("Multifuncional DIGITALIZANDO");
    }

    @Override
    public void imprimir() {
        System.out.println("Multifuncional IMPRIMINDO");
    }
    
}
