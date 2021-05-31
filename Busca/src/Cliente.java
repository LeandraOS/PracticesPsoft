import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        No a = new No ("A");
        No b = new No ("B");
        No c = new No ("C");
        No d = new No ("D");

        a.addAdjacentes(b);
        a.addAdjacentes(c);
        b.addAdjacentes(d);

        List<No> l = new ArrayList<>();
        a.buscaProfundidade(l);

        //D B C A
        for(No no: l){
            System.out.println(no.toString());
        }
        // no = branco: muda a cor para cinza
        // no = cinza: percorre adjacentes e muda cor para preto
        // no = preto: adiciona o no na lista
    }
}
