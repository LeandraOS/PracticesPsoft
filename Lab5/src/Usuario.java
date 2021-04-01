import Transportes.Transportes;
import Transportes.TiposTransporte;

public class Usuario {

    private Transportes transportes;

    public void modificaTransporte(String transporte){
        try {
            TiposTransporte tiposTransporte = TiposTransporte.valueOf(transporte);
            transportes = tiposTransporte.obterTransporte();
            transportes.imprimeCalculaRota();
        } catch(IllegalArgumentException e){
            System.out.println(String.format("Erro: %s", e.getMessage()));
        }
    }
}
