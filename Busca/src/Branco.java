import java.util.List;

public class Branco extends Cor {
    @Override
    public void visita(No no, List<No> list) {
        no.setCor(new Cinza(), list);
    }
}
