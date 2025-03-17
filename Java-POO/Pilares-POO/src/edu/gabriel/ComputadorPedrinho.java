import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        // Não se sabe qual app vai ser escolhido, mas qualquer um deve enviar e receber msg

        String appEscolhido = "msn";

        switch (appEscolhido) {
            case "msn" -> smi = new MSNMessenger();
            case "fbm" -> smi = new FacebookMessenger();
            case "tlg" -> smi = new Telegram();
            default -> {
            }
        }

        smi.enviarMensagem();
        smi.receberMensagem();

        // smi.validarConectadoInternet(); -> pedrinho não consegue acessar
    }
}
