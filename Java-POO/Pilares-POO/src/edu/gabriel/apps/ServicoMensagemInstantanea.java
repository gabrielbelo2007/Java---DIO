package apps;
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // mais um metodo que todos os filhos deverao implementar
    // public abstract void salvarHistoricoMensagem();

    // somente os filhos conhecem este método
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet!");
    }
}

