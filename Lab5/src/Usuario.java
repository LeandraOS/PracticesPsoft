import Transportes.Transportes;
import Transportes.TiposTransporte;

public class Usuario {

    private String nome;
    private Transportes transportes;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void modificaTransporte(String transporte){
        try {
            TiposTransporte tiposTransporte = TiposTransporte.valueOf(transporte);
            transportes = tiposTransporte.obterTransporte();
            transportes.imprimeCalculaRota();
        } catch(IllegalArgumentException e){
            System.out.println(String.format("Erro: %s", e.getMessage()));
            System.out.println(String.format("Não há a opção %s de meio de transporte! Tente novamente...", transporte));
        }
    }
}
