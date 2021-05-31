import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No {
    private Set<No> adjacentes = new HashSet<>();
    private Cor cor;
    private String nome;

    public No(String nome) {
        this.nome = nome;
        this.cor = new Branco();
    }

    public void buscaProfundidade(List<No>list){
        cor.visita(this, list);
    }

    public void setCor(Cor cor, List<No> list){
        this.cor = cor;
        cor.assumiu(this, list);
    }

    public void addAdjacentes(No adj){
        adjacentes.add(adj);
    }
    public String toString(){
        return this.nome;
    }

    public Set<No> getAdjascentes(){
        return this.adjacentes;

    }
}
