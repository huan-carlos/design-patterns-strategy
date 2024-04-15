import RetornoBoleto.LeituraRetornoBancoBrasil;
import RetornoBoleto.LeituraRetornoBradesco;
import RetornoBoleto.ProcessarBoletos;

public class Principal {
    public static void main(String[] args) {
        var leituraRetorno = new LeituraRetornoBradesco();
        var processarBoleto = new ProcessarBoletos(leituraRetorno);
        processarBoleto.processar("bradesco-1.csv");
    }
}
