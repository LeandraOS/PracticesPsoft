import Transportes.Transportes;
import Transportes.TiposTransporte;

public class Usuario {

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    private Transportes transportes;

    public void modificaTransporte(String transporte){
        try {
            TiposTransporte tiposTransporte = TiposTransporte.valueOf(transporte);
            transportes = tiposTransporte.obterTransporte();
            transportes.imprimeCalculaRota();
        } catch(IllegalArgumentException e){
            System.out.println(String.format("Erro: %s", e.getMessage()));
            System.out.println("Não há esta opção de meio de transporte! ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
